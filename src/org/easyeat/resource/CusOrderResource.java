package org.easyeat.resource;

import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Date;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.EntityTag;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.*;

import org.easyeat.entity.CusOrder;
import org.easyeat.service.CusOrderService;
import org.easyeat.service.OrderContentService;
import org.easyeat.service.SellerService;
import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
@Path("cusorder")
public class CusOrderResource {
	@Resource
	private CusOrderService cusorderService;
	@Resource
	private OrderContentService orderContentService;
	@Resource
	private SellerService sellerService;
	/*
	 * @Resource private OrderItemService orderItemService;
	 */
	@GET
	@Path("/")
	@Produces("application/json")
	public Response getCusOrders(@Context Request request) throws UnsupportedEncodingException {
		List<CusOrder> cusOrderList = cusorderService.inquireAllCusOrder();
		CacheControl cacheControl = new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);
		EntityTag etag = new EntityTag(Integer.toString(cusOrderList.hashCode()));
		ResponseBuilder builder = request.evaluatePreconditions(etag);
		// cached resource did change -> serve updated content
		if (builder == null) {
			builder = Response.ok(cusOrderList);
			builder.tag(etag);
		}

		builder.cacheControl(cacheControl);
		return builder.build();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getCusOrderbyID(@PathParam("id") String id, @Context Request request)
			throws UnsupportedEncodingException {
		CusOrder cusOrder = cusorderService.inquireCusOrderById(id);

		CacheControl cacheControl = new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);

		EntityTag etag = new EntityTag(Integer.toString(cusOrder.hashCode()));
		ResponseBuilder builder = request.evaluatePreconditions(etag);

		// cached resource did change -> serve updated content
		if (builder == null) {
			builder = Response.ok(cusOrder);
			builder.tag(etag);
		}

		builder.cacheControl(cacheControl);
		return builder.build();
	}

	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public boolean deleteCusOrder(@PathParam("id") String id) {
		if (cusorderService.deleteCusOrderbyId(id) != 1) {
			return false;
		}
		return true;
	}

	@POST
	@Path("/")
	@Produces("application/json")
	public boolean createCusOrder(@FormParam(value = "orderInfo") String oi, @FormParam(value = "dishes") String d)
			throws UnsupportedEncodingException {
		JSONObject orderInfo = JSONObject.fromObject(oi);
		JSONArray dishes = JSONArray.fromObject(d);
		float totalPrice = 0;
		CusOrder order = (CusOrder) JSONObject.toBean(orderInfo, CusOrder.class);
		String id = cusorderService.createCusOrder(order);
		for (int i = 0; i < dishes.size(); ++i) {
			JSONObject dish = (JSONObject) dishes.get(i);
			String number = (String) dish.getString("number");
			totalPrice += Float.parseFloat(dish.getString("price")) * Integer.parseInt(number);
			orderContentService.createOrderContent(id, dish.getString("id"),number);
		}
		if (cusorderService.updateTotalPriceById(id, String.valueOf(totalPrice)) > 0)
			return true;
		else
			return false;
	}

	/*
	 * @PUT
	 * 
	 * @Path("/{id}")
	 * 
	 * @Produces("application/json") public boolean
	 * updateCusOrder(@PathParam("id") int id, @QueryParam("status") String s)
	 * throws UnsupportedEncodingException { int status=0;
	 * if(s.equals("Ensuring")) status=1; else if(s.equals("Delivering"))
	 * status=2; else if(s.equals("Finished")) status=3; else
	 * if(s.equals("Cancel")) status=4; else return false; CusOrder cusOrder =
	 * new CusOrder(); cusOrder.setId(id); cusOrder.setStatus(status); if
	 * (cusorderService.updateStatusById(cusOrder) != 1) { return false; }
	 * return true; }
	 */

	@GET
	@Path("/info")
	@Produces("application/json")
	public Response getOrderInfo(@QueryParam("cusid") String cusId, @Context Request request)
			throws UnsupportedEncodingException {
		List<CusOrder> cusOrderList = cusorderService.getOrderInfoByCusId(cusId);
		for(CusOrder co : cusOrderList){
			co.setDishcount(String.valueOf(orderContentService.getOrderContentByOrderId(co.getId()).size()));
			co.setResname(sellerService.querrySellerNamebyID(co.getSellerid()));
		}
		CacheControl cacheControl = new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);

		EntityTag etag = new EntityTag(Integer.toString(cusOrderList.hashCode()));
		ResponseBuilder builder = request.evaluatePreconditions(etag);

		// cached resource did change -> serve updated content
		if (builder == null) {
			builder = Response.ok(cusOrderList);
			builder.tag(etag);
		}

		builder.cacheControl(cacheControl);
		return builder.build();
	}
}

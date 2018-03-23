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
import org.springframework.stereotype.Component;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Component
@Path("cusorder")
public class CusOrderResource {
	@Resource
	private CusOrderService cusorderService;
	/*@Resource
	private OrderItemService orderItemService;
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
	    if(builder == null){
	        builder = Response.ok(cusOrderList);
	        builder.tag(etag);
	    }

		builder.cacheControl(cacheControl);
		return builder.build();
	}

	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getCusOrderbyID(@PathParam("id") String id,@Context Request request) throws UnsupportedEncodingException {
		CusOrder cusOrder = cusorderService.inquireCusOrderById(id);

		CacheControl cacheControl = new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);

		EntityTag etag = new EntityTag(Integer.toString(cusOrder.hashCode()));
		ResponseBuilder builder = request.evaluatePreconditions(etag);

	    // cached resource did change -> serve updated content
	    if(builder == null){
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

	/*@POST
	@Path("/")
	@Produces("application/json")
	public boolean createCusOrder(@FormParam(value = "cusId") String ci, @FormParam(value = "products") String p,
			@FormParam(value = "number") String n, @FormParam(value = "logisticProviderId") String lpid)
			throws UnsupportedEncodingException {
		int cusId = Integer.parseInt(ci);
		int logisticProviderId = Integer.parseInt(lpid);
		System.out.println(cusId);
		System.out.println(logisticProviderId);
		JSONArray products = JSONArray.fromObject(p);
		JSONArray numbers = JSONArray.fromObject(n);
		float totalPrice = 0;
		int id = cusorderService.createCusOrder(new Date(), totalPrice, cusId, logisticProviderId, 1, "");
		if (id != 0) {
			for (int i = 0; i < products.size(); ++i) {
				JSONObject product = (JSONObject) products.get(i);
				String number = (String)numbers.get(i);
				totalPrice += Float.parseFloat(product.getString("price")) * Integer.parseInt(number);
				orderItemService.createOrderItem(id, Integer.parseInt(product.getString("id")),
						Integer.parseInt(number),
						Float.parseFloat(product.getString("price")) * Integer.parseInt(number));
			}
			if (cusorderService.updateTotalPriceById(id, totalPrice) > 0)
				return true;
			else
				return false;
		}
		return false;
	}*/

	/*@PUT
	@Path("/{id}")
	@Produces("application/json")
	public boolean updateCusOrder(@PathParam("id") int id, @QueryParam("status") String s)
			throws UnsupportedEncodingException {
		int status=0;
		if(s.equals("Ensuring"))
			status=1;
		else if(s.equals("Delivering"))
			status=2;
		else if(s.equals("Finished"))
			status=3;
		else if(s.equals("Cancel"))
			status=4;
		else
			return false;
		CusOrder cusOrder = new CusOrder();
		cusOrder.setId(id);
		cusOrder.setStatus(status);
		if (cusorderService.updateStatusById(cusOrder) != 1) {
			return false;
		}
		return true;
	}*/

	@GET
	@Path("/info")
	@Produces("application/json")
	public Response getOrderInfro(@QueryParam("cusid") int cusId, @Context Request request) throws UnsupportedEncodingException {
		List<CusOrder> cusOrderList = cusorderService.getOrderInfoByCusId(cusId);
		CacheControl cacheControl = new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);

		EntityTag etag = new EntityTag(Integer.toString(cusOrderList.hashCode()));
		ResponseBuilder builder = request.evaluatePreconditions(etag);

	    // cached resource did change -> serve updated content
	    if(builder == null){
	        builder = Response.ok(cusOrderList);
	        builder.tag(etag);
	    }
	    
		builder.cacheControl(cacheControl);
		return builder.build();
	}
}

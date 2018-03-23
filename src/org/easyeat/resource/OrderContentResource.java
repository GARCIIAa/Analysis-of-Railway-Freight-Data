package org.easyeat.resource;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.CacheControl;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.easyeat.entity.Dish;
import org.easyeat.entity.OrderContent;
import org.easyeat.service.DishService;
import org.easyeat.service.OrderContentService;
import org.springframework.stereotype.Component;
@Component
@Path("ordercontent")
public class OrderContentResource {
	@Resource
	private OrderContentService orderitemService;
	@Resource
	private DishService dishService;
	@GET
	@Path("/{orderId}")
	@Produces("application/json")
	public Response getProductByOrderId(@PathParam("orderId") String orderId) throws UnsupportedEncodingException{
		List<OrderContent> orderContentList = orderitemService.getOrderContentByOrderId(orderId);
		List<Dish> dishes = new ArrayList<Dish>();
		for(OrderContent oc:orderContentList){
			Dish d = dishService.getDishByID(oc.getDishID());
			d.setOrderCounts(oc.getCount());
			d.setTotalPrice(String.valueOf(Integer.parseInt(oc.getCount())*Float.parseFloat(d.getPrice())));
			dishes.add(d);
		}
		CacheControl cacheControl =  new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);

		Response.ResponseBuilder builder = Response.ok(dishes);
		builder.cacheControl(cacheControl);
		return builder.build();
	}
}

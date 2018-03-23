package org.easyeat.resource;

import java.io.UnsupportedEncodingException;
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

import org.easyeat.entity.User;
import org.easyeat.service.UserService;
import org.springframework.stereotype.Component;
@Component
@Path("user")
public class UserResource {
	@Resource
	private UserService userService;
	@GET
	@Path("/")
	@Produces("application/json")
	public Response getCustomers() throws UnsupportedEncodingException
	{
		List<User> userList = userService.querryUsers();
		CacheControl cacheControl =  new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);
		Response.ResponseBuilder builder = Response.ok(userList);
		builder.cacheControl(cacheControl);
		return builder.build();
	}
	
	@GET
	@Path("/{id}")
	@Produces("application/json")
	public Response getCustomerbyID(@PathParam("id")String id) throws UnsupportedEncodingException
	{
		User user = userService.querryCustomersbyID(id);
		CacheControl cacheControl =  new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);

		Response.ResponseBuilder builder = Response.ok(user);
		builder.cacheControl(cacheControl);
		return builder.build();
	}
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public void deleteCustomer(@PathParam("id")String id) throws UnsupportedEncodingException
	{
		userService.deleteCustomerbyID(id);
	}
	/*@GET
	@Path("/pic")
	@Produces("application/json")
	public Response getCusPicbyID(@QueryParam("id")String id) throws UnsupportedEncodingException
	{
		String user = userService.querryCustomersbyID(id);
		CacheControl cacheControl =  new CacheControl();
		cacheControl.setMaxAge(86400);
		cacheControl.setPrivate(true);                                 

		Response.ResponseBuilder builder = Response.ok(user);
		builder.cacheControl(cacheControl);
		return builder.build();
	}*/
}

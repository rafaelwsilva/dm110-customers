package br.inatel.pos.mobile.dm110.customer.api;

import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customers")
public interface CustomerService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	String[] getCustomers();

	@GET
	@Path("/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	String customerByEmail(@PathParam("email") String email);

	@POST
	@Produces(MediaType.APPLICATION_JSON)
	void addCustomer(@FormParam("name") String name, @FormParam("email") String email);

}

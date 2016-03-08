package com.training.resources;

import java.util.HashMap;

import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.owlike.genson.Genson;
import com.training.entities.Employee;

	@Path("/simple")
	public class SimpleResource {

	@GET //Get type of request is allowed
	@Produces(MediaType.TEXT_PLAIN) // resource results in plain text
	public String getMessage() {
		return "You have configured REST successfully.";
	}
	@GET
	@Path("/name")
	@Produces(MediaType.APPLICATION_JSON)
	public String getEmployee() {
		String empRep = null;
		
		Employee emp = new Employee(101,"Ramesh");
		
		Genson serializer = new Genson();
		
		empRep = serializer.serialize(emp);
		
		return empRep;
		
	}
	@POST
	@Path("/add")
	public String addEmployee(@FormParam("id") int empId,@FormParam("name") String empName) {
		String message = null;
		
		Employee emp = new Employee(empId, empName);
		
		message = emp.toString();
		return "One Employee with " +message + "Added";
	}
	
	@DELETE
	@Path("/delete/{empId}")
	public String deleteEmployee(@PathParam("empId") int id) {
		return "One Employee with id " + id + " Deleted";
	}
	
	
	@Path("/findAll")
	@Produces(MediaType.APPLICATION_JSON)
	@GET
	public Response findAllEmployees(@QueryParam("dept") String dept) {
		
		HashMap<String,Employee> list = new HashMap<String,Employee>();
		list.put("PS", new Employee(101,"Pritam"));
		list.put("IT", new Employee(102,"Sumit"));
		list.put("AD", new Employee(101,"Rahman"));
		
		Employee found = list.get(dept);
		
		return Response.status(200).entity(found).build();
	}
}

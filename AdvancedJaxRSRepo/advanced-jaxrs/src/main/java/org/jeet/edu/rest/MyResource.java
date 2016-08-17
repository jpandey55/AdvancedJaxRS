package org.jeet.edu.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("test")
public class MyResource {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String testMethod() {
		System.out.println("Test1");
		return "It works";
	}
}

package com.redhat.coolstore;

import com.redhat.coolstore.DemoCommand;

import javax.enterprise.context.RequestScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.core.MediaType;

@RequestScoped
@Path("/")
public class DemoEndpoint  {
	
	private Client client = ClientBuilder.newBuilder().build();

	@GET
	@Path("circuit-breaker")
	@Produces(MediaType.APPLICATION_JSON)
	public String getDummy() {
		return new DemoCommand(client).execute();
	}

}

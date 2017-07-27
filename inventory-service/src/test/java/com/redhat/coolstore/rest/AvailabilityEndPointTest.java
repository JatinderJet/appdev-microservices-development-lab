package com.redhat.coolstore.rest;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.Assert;
import org.junit.runner.RunWith;

import com.redhat.coolstore.InventoryServiceBaseTest;

import java.net.URL;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.jboss.arquillian.test.api.ArquillianResource;

@RunWith(Arquillian.class)
public class AvailabilityEndPointTest extends InventoryServiceBaseTest{

	@ArquillianResource
	private URL deploymentURL;

	@Test
	@RunAsClient
	public void testResource()
	{	
		Client client = ClientBuilder.newBuilder().build();
		WebTarget target;
		// Given
		String itemId = "444436";
		target = client.target(deploymentURL+ "api/availability/"+ itemId);
		//Test
		Response response = target.request().get();
		System.out.println(response.readEntity(String.class));
		//Verify
		Assert.assertEquals(Response.Status.OK.getStatusCode(),response.getStatus());
	}



}

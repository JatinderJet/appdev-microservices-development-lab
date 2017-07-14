package com.redhat.coolstore.rest;

import java.net.URL;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;

import org.jboss.arquillian.junit.Arquillian;
import org.jboss.arquillian.test.api.ArquillianResource;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import com.redhat.coolstore.InventoryServiceBaseTest;


@RunWith(Arquillian.class)
public class HealthCheckResourceTest extends InventoryServiceBaseTest{

	@ArquillianResource
	private URL deploymentURL;
	
/*	private static final String URL =  "http://localhost:8080/api/health/ping";
	
	Client client = ClientBuilder.newBuilder().build();


    WebTarget target;

    @Before
    public void before(){
        target = client.target(deploymentURL+"/api/health/ping");
    }*/


	@Test
	public void testHealth() throws Exception {

		Client client = ClientBuilder.newBuilder().build();
		WebTarget target;
		// Given
		target = client.target(deploymentURL+ "api/health/ping");
		//Test
		Response response = target.request().get();
		System.out.println(response.readEntity(String.class));
		//Verify
		Assert.assertEquals(Response.Status.OK.getStatusCode(),response.getStatus());

	}
	

}

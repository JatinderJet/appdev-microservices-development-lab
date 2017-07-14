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

	@Test
	public void testHealth() throws Exception {

		// To be implemented
		// using ClientBuilder API create client
		// Set the WebTarget to the resource URL i.e. 'api/health/ping'
		// Replace below Response type variable to extract the 'GET' endpoint output
		// Verify the Response Status 
		
		// Given

		//Test

		//Verify

	}
	

}

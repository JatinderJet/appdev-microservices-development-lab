package com.redhat.coolstore.rest;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
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
	public void testResource()
	{
		// To be implemented
		// using ClientBuilder API create client
		// Set the WebTarget to the resource URL
		// Replace below Response type variable to extract the 'GET' endpoint output
		// Verify the Response Status 

		// Given
		String itemId = "444436";

		//Test
		
		//Verify
	}



}

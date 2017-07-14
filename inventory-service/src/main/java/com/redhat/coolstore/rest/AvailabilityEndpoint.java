package com.redhat.coolstore.rest;

import java.io.Serializable;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.redhat.coolstore.model.Inventory;
import com.redhat.coolstore.service.InventoryService;



@RequestScoped
@Path("/availability")
public class AvailabilityEndpoint implements Serializable {

	private static final long serialVersionUID = -7227732980791688773L;

	// To be implemented
	// Inject the Inventory Service class member

	
	//To be implemented
	// Define the rest API route for GET request, 
	// path {itemID}
	// Produces JSON
	public Inventory getAvailability(@PathParam("itemId") String itemId) {
		// To be implemented 
		// make a call using inventoryService object to return the Inventory Entity.
		// Below return command needs to be replaced with returned object.
		return null;
	}

}

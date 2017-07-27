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

import java.sql.Connection;
import java.sql.SQLException;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestScoped
@Path("/availability")
@Api(value = "/availability", description = "Get the availability")
public class AvailabilityEndpoint implements Serializable {

	private static final long serialVersionUID = -7227732980791688773L;

	@Inject
	private InventoryService inventoryService;

	@GET
	@Path("{itemId}")
	@ApiOperation(value = "Get the current inventory details",
	notes = "Returns the inventory details as a json string",
	response = String.class
			)
	@Produces(MediaType.APPLICATION_JSON)
	public Inventory getAvailability( @ApiParam(value = "itemId that needs to be queried", required = true)@PathParam("itemId") String itemId) {
		System.out.println("Calling the inventory service");
		if(inventoryService == null)
			System.out.println("It is null");
		return inventoryService.getInventory(itemId);
	}

}

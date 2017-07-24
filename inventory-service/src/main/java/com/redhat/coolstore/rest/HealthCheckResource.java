package com.redhat.coolstore.rest;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.wildfly.swarm.health.Health;
import org.wildfly.swarm.health.HealthStatus;


@Path("/health")
public class HealthCheckResource implements Serializable {

	private static final long serialVersionUID = -7227732980791688773L;


	//To be implemented
	// Expose Route with relative path "ping"
	// Request type : GET
	// Return Type HealthStatus
	// Enable the 'monitor' fraction using @Health annotation
	// Function has logic to always return UP status
	// Check solution to return date 	

}

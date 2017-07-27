package com.redhat.coolstore.rest;

import java.io.Serializable;
import java.util.Date;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.wildfly.swarm.health.Health;
import org.wildfly.swarm.health.HealthStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@Path("/health")
@Api(value = "/health", description = "checks service health")
public class HealthCheckResource implements Serializable {

	private static final long serialVersionUID = -7227732980791688773L;

	@GET
	@Path("/ping")
	@ApiOperation(value = "ping",
	notes = "checks service health",
	response = String.class
			)
	@Health
	public HealthStatus checkHealth() {
		return HealthStatus.named("pong").up()
				.withAttribute("date", new Date().toString());
	}
}


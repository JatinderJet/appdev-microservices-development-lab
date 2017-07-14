package com.redhat.coolstore.rest;

import java.io.Serializable;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import org.wildfly.swarm.health.Health;
import org.wildfly.swarm.health.HealthStatus;


@Path("/health")
public class HealthCheckResource implements Serializable {

	private static final long serialVersionUID = -7227732980791688773L;

	@GET
	@Path("/ping")
	@Health
	public HealthStatus checkHealth() {
		return HealthStatus.named("pong").up();
	}

}

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
    @Path("/liveness")
    @Health
    public HealthStatus liveness() {
        return HealthStatus.named("liveness").up();
    }
    
    @GET
    @Path("/readiness")
    @Health
    public HealthStatus readiness() {
        return HealthStatus.named("readiness").up();
    }

}

package com.redhat.coolstore.rest;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

import io.swagger.annotations.Api;

@ApplicationPath("/api")
@Api(value = "/api", description = "ContextPath")
public class RestApplication extends Application {

    

}

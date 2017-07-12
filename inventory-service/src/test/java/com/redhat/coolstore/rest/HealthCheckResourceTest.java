package com.redhat.coolstore.rest;

import static org.fest.assertions.Assertions.assertThat;

import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.drone.api.annotation.Drone;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.redhat.coolstore.InventoryServiceBaseTest;

@RunWith(Arquillian.class)
public class HealthCheckResourceTest extends InventoryServiceBaseTest{
	@Drone
	WebDriver browser;
	
	@Test
	@RunAsClient
	public void testReadiness() throws Exception {
		browser.navigate().to("http://localhost:8080/api/health/readiness");
		System.out.println(browser.getPageSource());
		assertThat(browser.getPageSource()).contains("UP");
	}	
	
	@Test
	@RunAsClient
	public void testLiveness() throws Exception {
		browser.navigate().to("http://localhost:8080/api/health/liveness");
		System.out.println(browser.getPageSource());
		assertThat(browser.getPageSource()).contains("UP");
	}
	
	//@Test
	//@RunAsClient
	public void testReadinessDown() throws Exception {
		browser.navigate().to("http://localhost:8080/api/health/readiness");
		System.out.println(browser.getPageSource());
		assertThat(browser.getPageSource()).contains("UP");
	}	
	
	//@Test
	//@RunAsClient
	public void testLivenessDown() throws Exception {
		browser.navigate().to("http://localhost:8080/api/health/liveness");
		System.out.println(browser.getPageSource());
		assertThat(browser.getPageSource()).contains("down");
	}
}

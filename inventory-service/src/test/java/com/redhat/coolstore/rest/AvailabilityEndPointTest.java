package com.redhat.coolstore.rest;

import org.jboss.arquillian.drone.api.annotation.Drone;
import org.openqa.selenium.WebDriver;
import org.jboss.arquillian.container.test.api.RunAsClient;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.redhat.coolstore.InventoryServiceBaseTest;
import static org.fest.assertions.Assertions.assertThat;

@RunWith(Arquillian.class)
public class AvailabilityEndPointTest extends InventoryServiceBaseTest{
	@Drone
	WebDriver browser;

	@Test
	@RunAsClient
	public void testIt() throws Exception {
		browser.navigate().to("http://localhost:8080/api/availability/444436");
		System.out.println(browser.getPageSource());
		assertThat(browser.getPageSource()).contains("Tokyo");
	}	
	
}

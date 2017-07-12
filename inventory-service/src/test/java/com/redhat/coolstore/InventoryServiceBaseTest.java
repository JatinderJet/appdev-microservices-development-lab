package com.redhat.coolstore;

import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;

import com.redhat.coolstore.model.Inventory;
import com.redhat.coolstore.rest.AvailabilityEndpoint;
import com.redhat.coolstore.service.InventoryService;


public class InventoryServiceBaseTest {

	@Deployment
	public static Archive createDeployment() {
		return ShrinkWrap.create(WebArchive.class)
				.addPackage(Inventory.class.getPackage())
				.addPackage(InventoryService.class.getPackage())
				.addPackage(AvailabilityEndpoint.class.getPackage())
				.addAsResource("project-it.yml", "project-defaults.yml")
				.addAsResource("META-INF/test-persistence.xml",  "META-INF/persistence.xml")
				.addAsResource("META-INF/test-load.sql",  "META-INF/test-load.sql");
	}

}

package com.redhat.coolstore.service;

import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.redhat.coolstore.InventoryServiceBaseTest;
import com.redhat.coolstore.service.InventoryService;
import javax.inject.Inject;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

//To be implemented
// Add annotation to integrate arquillian lifecycle
public class InventoryServiceTest extends InventoryServiceBaseTest {


	@Inject
	private InventoryService inventoryService;

	@Test
	public void testGetInventory() throws Exception {
		// To be implemented 
		// Assert the injected inventoryService object is not null
		// Assert for the given itemId 444436 quantity returned is 230
		
		// Given 
		
		// Verify
	}

}

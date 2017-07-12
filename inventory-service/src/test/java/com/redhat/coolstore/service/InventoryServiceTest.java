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


@RunWith(Arquillian.class)
public class InventoryServiceTest extends InventoryServiceBaseTest {


	@Inject
	private InventoryService inventoryService;

	@Test
	public void testGetInventory() throws Exception {
		assertThat(inventoryService, is(notNullValue()));
		assertThat(inventoryService.getInventory("444436").getQuantity(), is(230));
	}

}

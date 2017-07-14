package com.redhat.coolstore.service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.enterprise.context.ApplicationScoped;
import com.redhat.coolstore.model.Inventory;

@ApplicationScoped
public class InventoryService {

	@PersistenceContext
	private EntityManager em;

	public InventoryService() {
	}
	
	//To be implemented 
	// Define a function getInventory
	// Uses EntityManager find method to query DB on primary key
	// returns Inventory Entity
	
}

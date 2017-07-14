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
	
	public Inventory getInventory(String itemId) {
		Inventory inventory = em.find(Inventory.class,itemId);
		return inventory;
	}
}

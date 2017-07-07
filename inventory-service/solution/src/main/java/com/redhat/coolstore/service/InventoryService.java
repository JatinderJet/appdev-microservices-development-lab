package com.redhat.coolstore.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.enterprise.context.ApplicationScoped;
import com.redhat.coolstore.model.Inventory;

@ApplicationScoped
public class InventoryService {

	@PersistenceContext
	private EntityManager em;

	public InventoryService() {
		System.out.println("C'tor Inventory Service");
	}
	
	public Inventory getInventory(String itemId) {
		Inventory inventory = em.find(Inventory.class,itemId);
		return inventory;
	}
}

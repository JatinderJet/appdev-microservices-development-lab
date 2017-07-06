package com.redhat.coolstore.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.enterprise.context.ApplicationScoped;
import com.redhat.coolstore.model.Inventory;

@Stateless
@ApplicationScoped
public class InventoryService {

	@PersistenceContext
	private EntityManager em;

	public InventoryService() {
		
	}
	
	public Inventory getInventory(String itemId) {
		System.out.println("I am in inventory Service and going to call model");
		Inventory inventory = em.find(Inventory.class,itemId);
		return inventory;
	}
}

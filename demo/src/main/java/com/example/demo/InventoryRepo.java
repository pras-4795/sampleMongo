package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface InventoryRepo extends MongoRepository<Inventory, String>{

	public Inventory findByItem(String item);
}

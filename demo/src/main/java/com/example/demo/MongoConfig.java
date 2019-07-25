package com.example.demo;

import org.springframework.data.mongodb.config.AbstractMongoConfiguration;

import com.mongodb.MongoClient;

public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	public MongoClient mongoClient() {
		return new MongoClient("LAPTOP-EI6ESKM0", 27017);
	}

	@Override
	protected String getDatabaseName() {
		return "test";
	}

}

package com.example.testcontainer.container;

import org.testcontainers.containers.PostgreSQLContainer;
public class PostgreTestContainer extends PostgreSQLContainer<PostgreTestContainer> {

	
	
	public static final String IMAGE_VERSION="postgreS:11.1";

	 public static final String DATABASE_NAME="test";
	
	 public static PostgreSQLContainer container;
	 
	 
	 
	public PostgreTestContainer() {
		super(IMAGE_VERSION);
	}


	public static PostgreSQLContainer  getInstance() {
		    if(container == null){
		    	container= new PostgreSQLContainer().withDatabaseName(DATABASE_NAME);
		    }
		return container;
	}
 
	
	
	
	
	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
		System.setProperty("DB_URL",container.getJdbcUrl());
		System.setProperty("DB_USERNAME",container.getUsername());
		System.setProperty("DB_PASSWORD",container.getPassword());
		
	}
	
	
	@Override
	public void stop() {
	
	}


}

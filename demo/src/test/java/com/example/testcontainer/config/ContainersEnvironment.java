package com.example.testcontainer.config;

import org.testcontainers.containers.PostgreSQLContainer;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;

import com.example.testcontainer.container.PostgreTestContainer;

@Testcontainers
public class ContainersEnvironment {

	
	
	@Container
	public static PostgreSQLContainer postgreSQLContainer =PostgreTestContainer.getInstance();
	
}

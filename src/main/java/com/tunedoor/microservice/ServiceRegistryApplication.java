package com.tunedoor.microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.logging.Logger;

/**
 * 
 * @author Mohamed Saeed
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {
	
	private static Logger logger = Logger.getLogger(ServiceRegistryApplication.class.getName());

	public static void main(String[] args) {
		System.setProperty("spring.config.name", "registration-server");
		logger.info("Change Application Configuration to use registration-server.yml");
		SpringApplication.run(ServiceRegistryApplication.class, args);
	}
}

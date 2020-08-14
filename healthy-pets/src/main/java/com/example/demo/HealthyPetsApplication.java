package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 * This is the driven class for the entire application.
 * @author Zijun Mei and Yimin Li
 *
 */
@SpringBootApplication
public class HealthyPetsApplication {

	/**
	 * This is the main method for the entire application. 
	 * @param args receive arguments from cmd.
	 */
	public static void main(String[] args) {
		SpringApplication.run(HealthyPetsApplication.class, args);
	}

}

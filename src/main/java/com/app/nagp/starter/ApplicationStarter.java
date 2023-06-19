package com.app.nagp.starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author vipin kumar
 * 
 * This is main class which is responsible to start the application.
 */
@SpringBootApplication
@ComponentScan(basePackages = "com.app.nagp")
@EnableJpaRepositories("com.app.nagp.repository")
@EntityScan("com.app.nagp.entities")
public class ApplicationStarter {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStarter.class, args);
	}
}

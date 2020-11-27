package com.demo.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class AngularAndSpringBootDocumentUploadApplication {

	public static void main(String[] args) 
	{
		System.out.println("hello");
		SpringApplication.run(AngularAndSpringBootDocumentUploadApplication.class, args);
	}

}

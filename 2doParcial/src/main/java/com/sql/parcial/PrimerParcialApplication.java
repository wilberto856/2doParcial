package com.sql.parcial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PrimerParcialApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerParcialApplication.class, args);
	}

}

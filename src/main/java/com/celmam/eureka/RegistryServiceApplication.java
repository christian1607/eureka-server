package com.celmam.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class RegistryServiceApplication {

	public static void main(String... string) {
		SpringApplication.run(RegistryServiceApplication.class, args);
	}
}

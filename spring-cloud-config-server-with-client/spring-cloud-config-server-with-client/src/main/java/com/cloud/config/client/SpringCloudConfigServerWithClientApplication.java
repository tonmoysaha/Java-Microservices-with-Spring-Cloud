package com.cloud.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringCloudConfigServerWithClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerWithClientApplication.class, args);
	}

}

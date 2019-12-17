package com.mankali.api.config.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.mankali.api.config.client")
public class ApiConfigClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiConfigClientApplication.class, args);
	}

}

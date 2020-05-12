package com.neelav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class TwilioDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwilioDemoApplication.class, args);
	}

}


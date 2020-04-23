package com.song.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientProducerApplication.class, args);
	}

}

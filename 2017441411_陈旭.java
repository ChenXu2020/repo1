package com.cx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@EnableEurekaClient
@RestController
@SpringBootApplication

public class Application {
	@RequestMapping("/hello")
	public String home() {
		return "helllo world";
	}

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
	return new RestTemplate() ;
	}
	
	public static void main(String[] args){
		SpringApplication.run(Application.class, args);
	}
}
//

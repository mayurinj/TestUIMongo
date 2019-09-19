package com.cg.SpringMongoDBProd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
@EnableEurekaClient
@SpringBootApplication
public class SpringMongoDbProdApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongoDbProdApplication.class, args);
		System.out.println("hkjdhfkjdhfff");
	}

}

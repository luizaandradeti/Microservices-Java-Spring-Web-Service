package com.compraservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class CompraServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CompraServiceApplication.class, args);
	}
}
package com.example.execerciciosSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "controllers")
public class ExecerciciosSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExecerciciosSpringBootApplication.class, args);
	}

}

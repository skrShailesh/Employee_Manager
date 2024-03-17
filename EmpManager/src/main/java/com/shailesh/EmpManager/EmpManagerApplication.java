package com.shailesh.EmpManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication

public class EmpManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManagerApplication.class, args);
	}

}
//@EntityScan(basePackages = {"com.shailesh.EmpManager"})
//@EnableJpaRepositories(basePackages = {"com.shailesh.EmpManager"})
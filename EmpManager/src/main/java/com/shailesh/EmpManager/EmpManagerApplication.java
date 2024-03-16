package com.shailesh.EmpManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
//@EntityScan(basePackages = {"com.shailesh.EmpManager"})
//@EnableJpaRepositories(basePackages = {"com.shailesh.EmpManager"})
public class EmpManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpManagerApplication.class, args);
	}

}

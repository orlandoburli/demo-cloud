package br.com.orlandoburli.api.customers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomersApplication {

	public static void main(final String[] args) {
		SpringApplication.run(CustomersApplication.class, args);
	}
}
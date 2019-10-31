package br.com.orlandoburli.api.discover;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DiscoverApplication {

	public static void main(final String[] args) {
		SpringApplication.run(DiscoverApplication.class, args);
	}
}

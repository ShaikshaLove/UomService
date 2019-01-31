package io.shaiksha.uom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * UomServiceApplication.java
 * @author shaiksha
 * @version 1.0
 * @since 31/01/2018
 *
 */
@SpringBootApplication
@EnableEurekaClient
public class UomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UomServiceApplication.class, args);
	}

}


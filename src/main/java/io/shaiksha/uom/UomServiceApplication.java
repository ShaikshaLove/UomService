package io.shaiksha.uom;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * UomServiceApplication.java
 * @author shaiksha
 * @version 1.0
 * @since 31/01/2018
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class UomServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UomServiceApplication.class, args);
	}

}


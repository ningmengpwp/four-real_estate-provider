package com.four;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource(locations="dubbo-provider.xml")
public class FourRealEstateProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(FourRealEstateProviderApplication.class, args);
	}
}

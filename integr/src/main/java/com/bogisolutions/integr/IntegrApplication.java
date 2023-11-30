package com.bogisolutions.integr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.ImportResource;

// @ImportResource("classpath:/integration-config.xml")
@SpringBootApplication
public class IntegrApplication {

	public static void main(String[] args) {
		SpringApplication.run(IntegrApplication.class, args);
	}

}

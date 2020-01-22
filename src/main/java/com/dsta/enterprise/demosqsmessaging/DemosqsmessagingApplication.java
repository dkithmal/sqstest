package com.dsta.enterprise.demosqsmessaging;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemosqsmessagingApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemosqsmessagingApplication.class, args);

		AWSSQSPublisher.publishMessage("test message");
	}

}

package com.dsideal.systemmanager;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@ComponentScan(basePackages = {"com.dsideal.systemmanager", "com.dsideal.systemmanager.repository"})
public class SystemmanagerApplication {
	private static final Logger logger = LoggerFactory.getLogger(SystemmanagerApplication.class);
	public static void main(String[] args) {
		System.out.println("server is running at 9090....");
		SpringApplication.run(SystemmanagerApplication.class, args);
	}
}

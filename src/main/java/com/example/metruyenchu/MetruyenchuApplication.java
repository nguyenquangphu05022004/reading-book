package com.example.metruyenchu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MetruyenchuApplication {

	public static void main(String[] args) {
		SpringApplication.run(MetruyenchuApplication.class, args);
	}

}

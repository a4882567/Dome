package org.java;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@ComponentScan(basePackages="org.java")
@EnableTransactionManagement
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}

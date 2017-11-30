package com.intellect.cashcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan(basePackages = { "com.intellect.cashcor"})
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class CashcoreApplication extends SpringBootServletInitializer {
	public static void main(String[] args) {
		SpringApplication.run(CashcoreApplication.class, args);
	}
@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      return builder.sources(CashcoreApplication.class);
  }
}

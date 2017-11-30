package com.intellect.cashcore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


@SpringBootApplication
public class CashcoreApplication extends SpringBootServletInitializer {
	<!-- public static void main(String[] args) {
		SpringApplication.run(CashcoreApplication.class, args);
	} -->
@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CashcoreApplication.class);
    }
	
@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
      return builder.sources(CashcoreApplication.class);
  }
}

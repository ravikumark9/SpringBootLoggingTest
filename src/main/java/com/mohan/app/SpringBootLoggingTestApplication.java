package com.mohan.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootLoggingTestApplication extends SpringBootServletInitializer {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootLoggingTestApplication.class);
	
    public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingTestApplication.class, args);
	}

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootLoggingTestApplication.class);
    }
    
    @RequestMapping("/")
    public String getString() {
      for(int i = 0; i<10; i++) {
        LOGGER.info("Test"); 
      }
      return "this is  ravi, for testing";
    }
	
	
}

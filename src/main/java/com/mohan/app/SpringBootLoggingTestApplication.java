package com.mohan.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringBootLoggingTestApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootLoggingTestApplication.class);
	
    public static void main(String[] args) {
		SpringApplication.run(SpringBootLoggingTestApplication.class, args);
	}
    
    @RequestMapping("/")
    public String getString() {
      for(int i = 0; i<10000; i++) {
        LOGGER.info("Test"); 
      }
      return "Hi this is ravi";
    }
	
	
}

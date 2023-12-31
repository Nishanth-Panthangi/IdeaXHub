package com.ideaXhub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class IdeaHubApplication extends SpringBootServletInitializer {
	private static Logger logger = LoggerFactory.getLogger(IdeaHubApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(IdeaHubApplication.class, args);
		logger.debug("Application IdeaHub Started!");
	}

}

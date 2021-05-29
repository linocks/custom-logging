package com.linocks.customlogging;

import com.linocks.customlogging.config.MyLogger;
import io.reflectoring.descriptivelogger.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CustomLoggingApplication extends SpringBootServletInitializer {

//	@Override
//	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//		return application.sources(CustomLoggingApplication.class);
//	}

	static final MyLogger logger = LoggerFactory.getLogger(MyLogger.class, CustomLoggingApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(CustomLoggingApplication.class, args);
		logger.debug("Spring Boot Application has started successfully.........");
		
	}

	@GetMapping("/")
	public String getHome(){
		logger.info("Loading Homepage");
		return "Welcome to spring boot custom logging using logback";
	}

	@GetMapping("/about")
	public String getAbout(){
		logger.info("Loading About Page");
		logger.warn("This about page is about spring boot ELK Stack Log management..");
		return "Welcome to the about page";
	}

	@GetMapping("/exception")
	public String logException(){
		logger.warn("Runtime exception thrown....");
			throw new RuntimeException("Ooops Exception has occurred .......");
//		try{
//
//		}catch(RuntimeException r){
//			logger.error(r.getMessage()+" on /exception route");
//			r.printStackTrace();
//		}
//		return "Exception thrown";
	}


}

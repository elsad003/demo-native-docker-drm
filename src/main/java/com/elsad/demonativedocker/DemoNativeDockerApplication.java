package com.elsad.demonativedocker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoNativeDockerApplication {

	private static final Logger log = LoggerFactory.getLogger(DemoNativeDockerApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(DemoNativeDockerApplication.class, args);
	}

	@GetMapping("/")
	public String hello(){

		log.info("Hello, World!");

		return "Test!";
	}

	@GetMapping("/next")
	public String hello2(){
		return "Hello,World!";
	}

}

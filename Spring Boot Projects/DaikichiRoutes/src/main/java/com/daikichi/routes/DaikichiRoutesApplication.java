package com.daikichi.routes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RequestMapping("/daikichi")
@RestController
public class DaikichiRoutesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiRoutesApplication.class, args);
	}
	@RequestMapping("")
	public String welcome() {
		return "Welcome !";
	}
	
	@RequestMapping("/raed")
	public String Raed() {
		return "Welcome Raed !";
	}
	
	@RequestMapping("/dojo")
	public String dojo() {
		return "Welcome Raed coding dojo!";
	}


}

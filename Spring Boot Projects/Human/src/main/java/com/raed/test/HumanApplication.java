package com.raed.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HumanApplication {

	public static void main(String[] args) {
		SpringApplication.run(HumanApplication.class, args);
	}
	@RequestMapping("/")
	public String index () {
		return "Hello Human";
	}
	
	@RequestMapping("/test")
	public String index(@RequestParam(value="q") String firstname ,@RequestParam(value="z") String lastname) {
        return "You searched for: " + firstname +" " + lastname;
    }
	@RequestMapping("/raed")
	public String raed(@RequestParam(value="q") String firstname ,@RequestParam(value="times") int times) {
      String x="";  
        for(int i = 0; i <times ; i++) {
        	x += " Hello " + firstname; 
        }
        return x;
    } 
	}



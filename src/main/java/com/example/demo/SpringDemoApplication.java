package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	@GetMapping(value = "/name")
	public String getName(){
		System.out.println("Controller  getname method invoked");
		return  "Hello , Good Morning";

//		git init
//		git add README.md
//		git commit -m "first commit"
//		git branch -M main
//		git remote add origin git@github.com:ishuupatidar7/spring-demo.git
//		git push -u origin main
	}
}

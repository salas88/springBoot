package com.vladyslav.springBoot.Controller;

import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@Value("${first.name}")
	private String firstName;
	
	@Value("${last.name}")
	private String lastName;
	
	@GetMapping("/")
	public String showTime() {
		return "Time on server is " + LocalTime.now();
	}
	
	@GetMapping("/workout")
	public String getDeily() {
		return "Tiday is a lucky day";
	}
	
	@GetMapping("/myInfo")
	public String showInfoAboutMe() {
		
		return "first name - " + firstName + ", last name - " + lastName;
	}

}

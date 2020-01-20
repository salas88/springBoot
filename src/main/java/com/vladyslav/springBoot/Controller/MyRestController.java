package com.vladyslav.springBoot.Controller;

import java.time.LocalTime;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	
	@GetMapping("/")
	public String showTime() {
		return "Time on server is " + LocalTime.now();
	}
	
	@GetMapping("/workout")
	public String getDeily() {
		return "Tiday is a lucky day";
	}

}

package com.sampleSpringBoot.demo.MyController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/hi")
	
	public String sayHello() {
		return "hello Walmart, WELCOME ";
			
	}

}

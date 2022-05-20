package com.harsha.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeRestController {

	
	@GetMapping("/{name}")
	public String welcome(@PathVariable String name) {
		return "<h1>Welcome "+name+"</h1>";
	}
}

package com.dcl.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

	@GetMapping("/demo")
	public String demo() {
		return "This is a test message for Docker";
	}
	
}

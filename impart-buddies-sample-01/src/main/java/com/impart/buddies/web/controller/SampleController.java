package com.impart.buddies.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@GetMapping(path = "/")
	public String helloWorld() {
		return "{\"message\":\"Hello World Java v1\"}";
	}
}

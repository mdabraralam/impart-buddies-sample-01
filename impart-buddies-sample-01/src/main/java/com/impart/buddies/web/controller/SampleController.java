package com.impart.buddies.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.impart.buddies.web.service.SampleService;

@RestController
public class SampleController {
	
	private final SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getUserById(@PathVariable Long id) {
        try {
            String sample = sampleService.getSampleById(id);
            return ResponseEntity.ok(sample);  // Properly returning non-null response
        } catch (RuntimeException e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Sample not found");
        }
    }
    
	@GetMapping(path = "/")
	public String helloWorld() {
		return "{\"message\":\"Hello World Java v1\"}";
	}
}

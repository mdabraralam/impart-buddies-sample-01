package com.impart.buddies.web.service;

import org.springframework.stereotype.Service;

@Service
public class SampleService {

    public String getSampleById(Long id) {
        if (id == 1L) {
            return "Abrar Alam";
        } else {
            throw new RuntimeException("User not found");
        }
    }
}
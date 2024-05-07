package com.demo.controller;

import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class Controller {
    public ResponseEntity<Map<String, String>> successResponse(String resultFromOtherClass) 
    {
        return ResponseEntity.status(HttpStatus.OK).body(
            Map.of(
                "status", "true",
                "data", resultFromOtherClass,
                "message", "Data has been retrieved successfully!"
            )
        );
    }
    public String errorResponse() 
    {
        return "Error";
    }
}
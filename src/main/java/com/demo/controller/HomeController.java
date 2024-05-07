package com.demo.controller;

import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.service.HomeService;
@RestController
@RequestMapping("/api/home")

public class HomeController extends Controller 
{
    private final HomeService homeService;
    
    public HomeController(HomeService homeService) 
    {
        this.homeService = homeService;
    }
    @GetMapping
    public ResponseEntity<Map<String, String>> index() 
    {
        String resultFromOtherClass = homeService.someMethod();
        return this.successResponse(resultFromOtherClass);
    }
    // @PostMapping
    // public ResponseEntity<Map<String, String>> store()
    // {
    //     return this.successResponse("Post");
    // }
}
package com.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.service.HomeService;

@RestController
@RequestMapping("/api/home")

public class HomeController extends Controller
{   
    private final  HomeService homeService;
    
    public HomeController(HomeService homeService) 
    {
        this.homeService = homeService;
    }
    @GetMapping
    public String home() 
    {
        String resultFromOtherClass = homeService.someMethod();
        return this.successResponse(resultFromOtherClass);
    }
}


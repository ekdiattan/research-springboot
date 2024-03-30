package com.demo.service;
import org.springframework.stereotype.Service;
@Service
public class HomeService 
{
    public String someMethod() 
    {
        String nama = "Rizki Anjayy Mabar";
        return "Hello " + nama;
    }
}

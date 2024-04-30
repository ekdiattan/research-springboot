package com.demo.service;
import org.springframework.stereotype.Service;
@Service
public class HomeService 
{
    public String someMethod() 
    {
        int i = 1;
        int j = 3;

        String counter = String.valueOf(i - j);
        
        return counter;
    }
    public String update()
    {
        return "Update";
    }
    public String stores()
    {
        return "Test";   
    }
}

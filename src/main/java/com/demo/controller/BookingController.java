package com.demo.controller;

import com.demo.model.Booking;
import com.demo.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController
{
    @Autowired
    private BookingRepository bookingRepository;

    @GetMapping
    public List<Booking> get() {
        return bookingRepository.findAll();
    }
}

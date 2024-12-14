package com.busreservation.controllers;

import com.busreservation.models.Booking;
import com.busreservation.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping
    public ResponseEntity<Booking> bookTicket(@RequestBody Booking booking) {
        Booking newBooking = bookingService.makeBooking(booking);
        return ResponseEntity.ok(newBooking);
    }
}

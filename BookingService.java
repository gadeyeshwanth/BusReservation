package com.busreservation.services;

import com.busreservation.models.Booking;
import com.busreservation.repositories.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    public Booking makeBooking(Booking booking) {
        return bookingRepository.save(booking);
    }
}

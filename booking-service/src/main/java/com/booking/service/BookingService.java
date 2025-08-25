package com.booking.service;

import com.booking.entity.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();
    Booking createBooking(Booking booking);
}

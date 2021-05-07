package com.clickfit.services;

import java.util.HashMap;
import java.util.UUID;

import com.clickfit.model.Activity;
import com.clickfit.model.Booking;
import com.clickfit.model.Slot;
import com.clickfit.model.User;

public class BookingService {
	
	private HashMap<String, Booking> bookings = new HashMap<>();
	
	public Booking createBooking(User user,Activity activity,Slot slot) {
		String bookingId = UUID.randomUUID().toString();
		Booking booking = new Booking(bookingId, user, activity, slot);
		bookings.put(bookingId, booking);
		return booking;
	}
}

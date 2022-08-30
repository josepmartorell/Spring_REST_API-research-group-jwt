package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Booking;

public interface IBookingService {
	//CRUD methods
	public List<Booking> listBookings();	
	public Booking saveBooking(Booking booking);	
	public Booking bookingXID(int id);
	public Booking updateBooking(Booking booking);	
	public void eliminateBooking(int id);

}

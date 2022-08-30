package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IBookingDAO;
import com.crud.sql.dto.Booking;

@Service
public class BookingServiceImpl implements IBookingService{
	
	@Autowired
	IBookingDAO iBookingDAO;

	@Override
	public List<Booking> listBookings() {
		// TODO Auto-generated method stub
		return iBookingDAO.findAll();
	}

	@Override
	public Booking saveBooking(Booking booking) {
		// TODO Auto-generated method stub
		return iBookingDAO.save(booking);
	}

	@Override
	public Booking bookingXID(int id) {
		// TODO Auto-generated method stub
		return iBookingDAO.findById(id).get();
	}

	@Override
	public Booking updateBooking(Booking booking) {
		// TODO Auto-generated method stub
		return iBookingDAO.save(booking);
	}

	@Override
	public void eliminateBooking(int id) {
		// TODO Auto-generated method stub
		iBookingDAO.deleteById(id);
	}

}

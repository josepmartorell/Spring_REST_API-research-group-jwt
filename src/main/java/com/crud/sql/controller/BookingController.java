package com.crud.sql.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.sql.dto.Booking;
import com.crud.sql.service.BookingServiceImpl;


@RestController
@RequestMapping("/api")
public class BookingController {
	
	@Autowired
	BookingServiceImpl bookingServiceImpl;
	
	@GetMapping("/bookings")
	public List<Booking> listTeams(){
		return bookingServiceImpl.listBookings();		
	}
	
	@PostMapping("/bookings")
	public Booking saveBooking(@RequestBody Booking booking) {
		return bookingServiceImpl.saveBooking(booking);
	}
	
	@GetMapping("/bookings/{id}")
	public Booking bookingXID(@PathVariable(name="id") int id) {
		Booking booking_xid = new Booking();
		booking_xid = bookingServiceImpl.bookingXID(id);
		return booking_xid;
	}
	
	@PutMapping("/bookings/{id}")
	public Booking updateBooking(@PathVariable(name="id")int id,@RequestBody Booking booking) {
		Booking booking_selected = new Booking();
		Booking booking_updated = new Booking();
		
		booking_selected = bookingServiceImpl.bookingXID(id);
		booking_selected.setResearcher(booking.getResearcher());
		booking_selected.setTeam(booking.getTeam());
		booking_selected.setStartAt(booking.getStartAt());
		booking_selected.setFinalAt(booking.getFinalAt());
		
		booking_updated = bookingServiceImpl.updateBooking(booking_selected);
		return booking_updated;
	}
	
	@DeleteMapping("/bookings/{id}")
	public void eliminateBooking(@PathVariable(name="id") int id) {
		bookingServiceImpl.eliminateBooking(id);
	}

}

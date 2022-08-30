package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Booking;

public interface IBookingDAO extends JpaRepository<Booking, Integer>{

}

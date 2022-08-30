package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Faculty;

public interface IFacultyDAO extends JpaRepository<Faculty, Integer> {

}

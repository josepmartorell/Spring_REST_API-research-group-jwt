package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Researcher;

public interface IResearcherDAO extends JpaRepository<Researcher, String>{

}

package com.crud.sql.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.sql.dto.Team;

public interface ITeamDAO extends JpaRepository<Team, String>{

}

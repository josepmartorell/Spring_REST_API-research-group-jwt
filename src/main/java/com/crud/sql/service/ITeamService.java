package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Team;

public interface ITeamService {
	//CRUD methods
	public List<Team> listTeams();	
	public Team saveTeam(Team team);	
	public Team teamXID(String serialNumber);
	public Team updateTeam(Team team);	
	public void eliminateTeam(String serialNumber);

}

package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.ITeamDAO;
import com.crud.sql.dto.Team;

@Service
public class TeamServiceImpl implements ITeamService{
	
	@Autowired
	ITeamDAO iTeamDAO;

	@Override
	public List<Team> listTeams() {
		// TODO Auto-generated method stub
		return iTeamDAO.findAll();
	}

	@Override
	public Team saveTeam(Team team) {
		// TODO Auto-generated method stub
		return iTeamDAO.save(team);
	}

	@Override
	public Team teamXID(String serialNumber) {
		// TODO Auto-generated method stub
		return iTeamDAO.findById(serialNumber).get();
	}

	@Override
	public Team updateTeam(Team team) {
		// TODO Auto-generated method stub
		return iTeamDAO.save(team);
	}

	@Override
	public void eliminateTeam(String serialNumber) {
		// TODO Auto-generated method stub
		iTeamDAO.deleteById(serialNumber);
	}
	

}

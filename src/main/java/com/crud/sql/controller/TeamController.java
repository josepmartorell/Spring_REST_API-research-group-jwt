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

import com.crud.sql.dto.Team;
import com.crud.sql.service.TeamServiceImpl;

@RestController
@RequestMapping("/api")
public class TeamController {
	
	@Autowired
	TeamServiceImpl teamServiceImpl;
	
	@GetMapping("/teams")
	public List<Team> listTeams(){
		return teamServiceImpl.listTeams();		
	}
	
	@PostMapping("/teams")
	public Team saveTeam(@RequestBody Team team) {
		return teamServiceImpl.saveTeam(team);
	}
	
	@GetMapping("/teams/{serial_number}")
	public Team pieceXID(@PathVariable(name="serial_number") String serial_number) {
		Team team_xid = new Team();
		team_xid = teamServiceImpl.teamXID(serial_number);
		return team_xid;
	}
	
	@PutMapping("/teams/{serial_number}")
	public Team updateTeam(@PathVariable(name="serial_number")String serial_number,@RequestBody Team team) {
		Team team_selected = new Team();
		Team team_updated = new Team();
		
		team_selected = teamServiceImpl.teamXID(serial_number);
		team_selected.setSerialNumber(team.getSerialNumber());
		team_selected.setName(team.getName());
		team_selected.setFaculty(team.getFaculty());
		
		team_updated = teamServiceImpl.updateTeam(team_selected);
		return team_updated;
	}
	
	@DeleteMapping("/teams/{serial_number}")
	public void eliminateTeam(@PathVariable(name="serial_number") String serial_number) {
		teamServiceImpl.eliminateTeam(serial_number);
	}
	
	

}

package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IResearcherDAO;
import com.crud.sql.dto.Researcher;

@Service
public class ResearcherServiceImpl implements IResearcherService{
	
	@Autowired
	IResearcherDAO iResearcherDAO;

	@Override
	public List<Researcher> listResearchers() {
		// TODO Auto-generated method stub
		return iResearcherDAO.findAll();
	}

	@Override
	public Researcher saveResearcher(Researcher research) {
		// TODO Auto-generated method stub
		return iResearcherDAO.save(research);
	}

	@Override
	public Researcher researcherXID(String dni) {
		// TODO Auto-generated method stub
		return iResearcherDAO.findById(dni).get();
	}

	@Override
	public Researcher updateResearcher(Researcher research) {
		// TODO Auto-generated method stub
		return iResearcherDAO.save(research);
	}

	@Override
	public void eliminateResearcher(String dni) {
		// TODO Auto-generated method stub
		iResearcherDAO.deleteById(dni);
		
	}

}

package com.crud.sql.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.sql.dao.IFacultyDAO;
import com.crud.sql.dto.Faculty;

@Service
public class FacultyServiceImpl implements IFacultyService{
	
	@Autowired
	IFacultyDAO iFacultyDAO;

	@Override
	public List<Faculty> listFaculties() {
		// TODO Auto-generated method stub
		return iFacultyDAO.findAll();
	}

	@Override
	public Faculty saveFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return iFacultyDAO.save(faculty);
	}

	@Override
	public Faculty facultyXID(int code) {
		// TODO Auto-generated method stub
		return iFacultyDAO.findById(code).get();
	}

	@Override
	public Faculty updateFaculty(Faculty faculty) {
		// TODO Auto-generated method stub
		return iFacultyDAO.save(faculty);
	}

	@Override
	public void eliminateFaculty(int code) {
		// TODO Auto-generated method stub
		iFacultyDAO.deleteById(code);
	}
	
	

}

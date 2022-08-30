package com.crud.sql.service;

import java.util.List;

import com.crud.sql.dto.Faculty;

public interface IFacultyService {
	//CRUD methods
	public List<Faculty> listFaculties();	
	public Faculty saveFaculty(Faculty faculty);	
	public Faculty facultyXID(int code);
	public Faculty updateFaculty(Faculty faculty);	
	public void eliminateFaculty(int code);

}

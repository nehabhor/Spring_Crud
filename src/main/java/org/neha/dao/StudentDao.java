package org.neha.dao;

import java.util.List;

import org.neha.model.StudentForm;

public interface StudentDao {
	List<StudentForm> getStudList(); 
	StudentForm getStudBySno(int sno);
	void insertStud(StudentForm studentForm);
	void updateStud(StudentForm studentForm);
	void deleteStud(int sno);
}

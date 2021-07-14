package org.neha.service;

import java.util.List;

import org.neha.model.StudentForm;

public interface StudentService {
	List<StudentForm> getStudListService();
	StudentForm getStudBySnoService(int sno);
	void insertStudService(StudentForm studentForm);
	void updateStudService(StudentForm studentForm);
	void deleteStudService(int sno);
}

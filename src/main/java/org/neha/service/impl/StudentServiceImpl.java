package org.neha.service.impl;

import java.util.List;

import org.neha.dao.StudentDao;
import org.neha.model.StudentForm;
import org.neha.service.StudentService;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

	private StudentDao studentDao;

	@Override
	public List<StudentForm> getStudListService() {
		return studentDao.getStudList();
	}

	@Override
	public StudentForm getStudBySnoService(int sno) {
		// TODO Auto-generated method stub
		return studentDao.getStudBySno(sno);
	}

	@Override
	public void insertStudService(StudentForm studentForm) {
     studentDao.insertStud(studentForm);	
	}

	@Override
	public void updateStudService(StudentForm studentForm) {
      studentDao.updateStud(studentForm);		
	}

	@Override
	public void deleteStudService(int sno) {
     studentDao.deleteStud(sno);		
	}
	
}

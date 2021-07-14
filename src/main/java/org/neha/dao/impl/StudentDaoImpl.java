package org.neha.dao.impl;

import java.util.List;

import org.neha.dao.StudentDao;
import org.neha.dao.extractor.StudentExtractor;
import org.neha.dao.extractor.StudentListExtractor;
import org.neha.model.StudentForm;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import lombok.AllArgsConstructor;

@Repository
@AllArgsConstructor
public class StudentDaoImpl implements StudentDao {
	private JdbcTemplate jdbcTemplate;
	private StudentListExtractor studentListExtractor;
	private StudentExtractor studentExtractor; 

	@Override
	public List<StudentForm> getStudList() {
		return jdbcTemplate.query("select * from student order by sno", studentListExtractor::extractData);
	}

	@Override
	public StudentForm getStudBySno(int sno) {
		// TODO Auto-generated method stub
		return jdbcTemplate.query("Select * from student where sno=" + sno, studentExtractor::extractData);
	}

	@Override
	public void insertStud(StudentForm studentForm) {
		String query="Insert into student values(" + studentForm.getSno() + ",'" + studentForm.getSname() + "'," + studentForm.getAge() + ")";
		jdbcTemplate.update(query);		
	}

	@Override
	public void updateStud(StudentForm studentForm) {
     String query="Update student set sname='" + studentForm.getSname() + "', age=" + studentForm.getAge() + " where sno=" + studentForm.getSno();
     jdbcTemplate.update(query);
	}

	@Override
	public void deleteStud(int sno) {
     String query="Delete from student where sno=" + sno;
     jdbcTemplate.update(query);
	}
	
}

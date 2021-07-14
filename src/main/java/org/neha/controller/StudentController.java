package org.neha.controller;

import java.util.List;

import org.neha.model.StudentForm;
import org.neha.service.StudentService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping(value = "/students")
public class StudentController {

	private StudentService studentService;
	
	@GetMapping
	List<StudentForm> getStudListCtrl()
	{
		return studentService.getStudListService();
	}
	
	@GetMapping("/{sno}")
	public StudentForm getStudBySnoCtrl(@PathVariable(name = "sno") int sno) {
	  return studentService.getStudBySnoService(sno);
	}
	
	@PostMapping
	public void insertStudCtrl(@RequestBody StudentForm studentForm) {
		studentService.insertStudService(studentForm);
	}
	
	@PutMapping
	public void updateStudCtrl(@RequestBody StudentForm studentForm) {
		studentService.updateStudService(studentForm);
	}
	
	@DeleteMapping("/{sno}")
	void deleteStudCtrl(@PathVariable(name = "sno") int sno)
	{
		studentService.deleteStudService(sno);
	}
}

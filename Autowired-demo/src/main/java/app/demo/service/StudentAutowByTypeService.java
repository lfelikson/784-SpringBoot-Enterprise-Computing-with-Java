package app.demo.service;

import org.springframework.beans.factory.annotation.Autowired;

import app.demo.model.Student;

public class StudentAutowByTypeService {

	//Autowired annotation on variable/setters is equivalent to autowire="byType"
	@Autowired
	private Student student;
	
	@Autowired
	public void setStudent(Student stud){
		this.student = stud;
	}
	
	public Student getStudent(){
		return this.student;
	}
}

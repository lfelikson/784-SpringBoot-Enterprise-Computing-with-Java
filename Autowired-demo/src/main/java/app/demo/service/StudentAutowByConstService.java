package app.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import app.demo.model.Student;

public class StudentAutowByConstService {

	private Student student;

	//Autowired annotation on Constructor is equivalent to autowire="constructor"
	@Autowired(required=false)
	public StudentAutowByConstService(@Qualifier("student") Student stud){
		this.student = stud;
	}

	public Student getStudent () {
		return this.student;
	}
}

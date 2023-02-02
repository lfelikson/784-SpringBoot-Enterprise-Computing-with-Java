package app.demo.service;

import app.demo.model.Student;

public class StudentService {

	private Student student;

	// constructor is used for autowiring by constructor
	public StudentService(Student stud) {

		System.out.println("Autowiring by constructor used");

		this.student = stud;
	}

	// default constructor to avoid BeanInstantiationException for autowiring
	// byName or byType
	public StudentService() {
		System.out.println("Default Constructor used");
	}

	// used for autowire byName and byType
	public void setStudent(Student stud) {
		this.student = stud;
	}

	public Student getStudent() {
		return this.student;
	}
}

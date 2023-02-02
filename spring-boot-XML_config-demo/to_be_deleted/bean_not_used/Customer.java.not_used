package app.demo.bean;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

@Component
public class Customer {

    @Lazy
	@Autowired
	private Student student;

	public Customer() {
		System.out.println("Customer Instance Created");
	}

	public Student getStudent() {
		System.out.println("From getStudent() in Custoner");
		return student;
	}

}

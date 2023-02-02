package app.demo.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Student {

	public Student() {
		System.out.println("Student Instance Created");
	}
	
	private String name = "EN.605.784.81 class ????!!!!!";

	public String getName() {
		return name;
	}
}

package app.demo.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Lazy
@Component
public class Student {

	public Student() {
		System.out.println("Student instance created thru default constrator");
	}
	
	private String name = "605.784 class";

	public String getName() {
		return name;
	}
}

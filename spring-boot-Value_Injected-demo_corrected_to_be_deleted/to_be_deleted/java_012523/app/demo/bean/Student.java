package app.demo.bean;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;
// import org.springframework.beans.factory.annotation.Autowired;

@Lazy
@Component
public class Student {
 
	private String name = "EN.605.784.81 class ????!!!!!?????";
	
	public Student() {
		System.out.println("Student Instance Created");
//		name = "EN.605.784.81 class ????!!!!!?????";
	}

/* 
	@Autowired
	public void setName() {
		name = "EN.605.784.81 class ????!!!!!?????";
	}
*/
	public String getName() {
		return name;	
	}
}

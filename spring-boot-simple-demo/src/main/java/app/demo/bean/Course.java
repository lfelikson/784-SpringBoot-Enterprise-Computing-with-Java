package app.demo.bean;

import org.springframework.stereotype.Component;

@Component ("app.demo.bean.Course")

public class Course {

	public Course() {
		System.out.println("New course instance created !!!!!");
	}

    public String register() {
		System.out.println("You are registered to new course !!!");
		return "REGISTERED TO NEW COURSE, THANKS!";
    }
}

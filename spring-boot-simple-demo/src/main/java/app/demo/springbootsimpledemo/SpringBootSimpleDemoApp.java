package app.demo.springbootsimpledemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
// import org.springframework.beans.factory.annotation.Autowired;


//import com.javabydeveloper.spring.config.AppConfigForLazy;
// import app.demo.bean.Customer;
// import app.demo.bean.Employee;
// import app.demo.bean.Student;
// import app.demo.bean.User;

import app.demo.bean.Course;
import app.demo.bean.Student;


@SpringBootApplication
public class SpringBootSimpleDemoApp {

	public static void main(String[] args) {
	
	SpringApplication.run(SpringBootSimpleDemoApp.class, args).close();

	// ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfigForLazy.class);

	    var ctx = new AnnotationConfigApplicationContext();
        ctx.scan("app.demo.bean");

		System.out.println("After ctx.scan executed ................................");
        
		ctx.refresh();
/* 
			Customer customer = ctx.getBean(Customer.class);

			User user = ctx.getBean(User.class);
		
			System.out.println(user.getStudent().getName());
*/
			Course course = ctx.getBean(Course.class);

			System.out.println("++++++++++++++++++++++" + course.register());

			Student student = ctx.getBean(Student.class);

			System.out.println("Here is student name = " + student.getName());

//			System.out.println("Here is student name = " + course.getStudent().getName());
				
	}
}
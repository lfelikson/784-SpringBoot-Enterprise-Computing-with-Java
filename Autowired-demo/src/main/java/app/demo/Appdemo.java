package app.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import app.demo.service.StudentAutowByConstService;
import app.demo.service.StudentAutowByTypeService;
import app.demo.service.StudentService;

public class Appdemo {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		StudentService serviceByName = ctx.getBean("studentServiceByName", StudentService.class);
		
		System.out.println("After autowiring by Name, student Name=" + serviceByName.getStudent().getName());
		
		StudentService serviceByType = ctx.getBean("studentServiceByType", StudentService.class);
		
		System.out.println("Autowiring byType. Employee Name="+serviceByType.getStudent().getName());
		
		StudentService serviceByConstructor = ctx.getBean("studentServiceConstructor", StudentService.class);
		
		System.out.println("After autowiring by Constructor. Student Name=" + serviceByConstructor.getStudent().getName());
		
		//printing hashcode to confirm all the objects are of different type
		System.out.println(serviceByName.hashCode()+"::" + serviceByType.hashCode() + "::" + serviceByConstructor.hashCode());
		
		//Testing @Autowired annotations
		StudentAutowByTypeService autowiredByTypeService = ctx.getBean("studentAutowByTypeService",StudentAutowByTypeService.class);
		
		System.out.println("@Autowired byType - Student Name=" + autowiredByTypeService.getStudent().getName());

		StudentAutowByConstService autowiredByConstService = ctx.getBean("studentAutowByConstService",StudentAutowByConstService.class);
		
		System.out.println("@Autowired by Constructor - Student Name=" + autowiredByConstService.getStudent().getName());

		ctx.close();
	}

}

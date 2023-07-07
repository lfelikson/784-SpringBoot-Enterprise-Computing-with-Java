package app.demo;

// import java.sql.SQLException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PropertyPlaceholderDemo {

	public static void main(String[] args) throws Exception {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();

	    ctx.register(AppConfig.class);

	    ctx.refresh();
	    
    //    VillageDAO villageDAO = ctx.getBean(VillageDAO.class);
	//    villageDAO.save();
	//    villageDAO.selectFirstRow();
    	
        ctx.registerShutdownHook();
	}

} 
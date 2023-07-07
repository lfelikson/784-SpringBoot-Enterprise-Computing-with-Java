package app.demo;

import app.demo.School;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommand implements CommandLineRunner {

    private final School school;
    private final String message;

   @Value("${app.post:Default World??????}")
    private String postOut;

    public AppCommand(School school, @Value("${app.message}") String message) {
        this.school = school;
        this.message = message;
//        this.postOut  = postIn;
            this.school.toString();
            System.out.println(">>>>>>>>>>>>>>>>>>>>> " + message );
    }

    public void run(String... args) throws Exception {        
        school.toString();
    }
}


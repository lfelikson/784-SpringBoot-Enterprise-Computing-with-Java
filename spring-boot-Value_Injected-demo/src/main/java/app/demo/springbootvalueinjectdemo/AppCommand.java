package app.demo.springbootvalueinjectdemo;

import app.demo.Hello;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommand implements CommandLineRunner {

    private final Hello greeter;
    private final String message;

//   @Value("${app.post:Default World??????}")
//    private String postOut;

    public AppCommand(Hello greeter, 
    
    // String postIn, 

    //    audience variable can be set either by @Value annotation with value or  
    //                      @Value("${app.audience:Default World}") String audience) {
    //                           by using application.properties file

                        @Value("${app.message}") String message) {
        this.greeter = greeter;
        this.message = message;
//        this.postOut  = postIn;
    }

    public void run(String... args) throws Exception {        
        greeter.sayHello("message ...   =  " + message);
//        greeter.sayHello("postOut    =  " + postOut);
    }
}


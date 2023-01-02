package app.demo.beanfactory;

import app.demo.Hello;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommand implements CommandLineRunner {
    private final Hello greeter;

    public AppCommand(Hello greeter) {
        this.greeter = greeter;
    }
    
    public void run(String... args) throws Exception {        
        greeter.sayHello("World 2023 and 605.784 class ");
    }
}


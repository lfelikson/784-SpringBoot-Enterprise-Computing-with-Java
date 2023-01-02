package app.demo;

import app.demo.Hello;
import app.demo.stdout.StdOutHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SelfConfiguredApp {
    public static final void main(String...args) {
        SpringApplication.run(SelfConfiguredApp.class, args);
    }
    
    @Bean
    public Hello hello() {
        return new StdOutHello("Application @Bean says Happy New 2023!");
    }
}

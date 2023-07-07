package app.demo.springbootvalueinjectdemo;

import app.demo.Hello;
import app.demo.StdOutHello;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ValueInjectedApp {
    public static final void main(String...args) {
        SpringApplication.run(ValueInjectedApp.class, args).close();
    }
    
    @Bean
    public Hello hello() {
        return new StdOutHello ("Hello ................ : ");
    }
    

}

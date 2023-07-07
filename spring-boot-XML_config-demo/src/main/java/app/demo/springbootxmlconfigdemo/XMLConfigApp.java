package app.demo.springbootxmlconfigdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:contexts/applicationContext.xml"})
public class XMLConfigApp {
    public static final void main(String...args) {
        SpringApplication.run(XMLConfigApp.class, args).close();
    }
}


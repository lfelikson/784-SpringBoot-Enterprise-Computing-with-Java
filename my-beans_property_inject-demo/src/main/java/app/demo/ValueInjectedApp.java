package app.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootApplication
public class ValueInjectedApp {
    public static final void main(String...args) {
        SpringApplication.run(ValueInjectedApp.class, args).close();
    }

/*
	private final static Logger LOGGER = LoggerFactory.getLogger(ValueInjectedApp.class);

    private final School school;
    @Autowired
    ValueInjectedApp() {
        this.school = new School();
    }

*/

}

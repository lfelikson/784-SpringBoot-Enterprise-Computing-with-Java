package app.lang;

import app.lang.Language;
import app.lang.ProgLanguage;

// import app.lang.Language;
// import app.lang.ProgLanguage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SelfConfiguredApp {
    public static final void main(String...args) {
        SpringApplication.run(SelfConfiguredApp.class, args);
    }
    
    @Bean
    public Language language() {
        return new ProgLanguage("Application @Bean says Hey");
    }
}


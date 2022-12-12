package app.lang;

// import app.lang.Language;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AppCommand implements CommandLineRunner {
    private final Language myLang;

    public AppCommand(Language lang) {
        this.myLang = lang;
    }

    public void run(String... args) throws Exception {        
        myLang.getType("Python");
        myLang.getVersion("9.8.7.6.5.4");
    }
}
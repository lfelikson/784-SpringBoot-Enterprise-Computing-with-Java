package app.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import app.demo.Hello;

@Component
public class AppCommand implements CommandLineRunner {
  private final Hello greeter;

  public AppCommand(Hello greeter) { 

    System.out.println("????????????????????????????????????????????????");

  this.greeter = greeter;
  }

  public void run(String... args) throws Exception {

    System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

  greeter.sayHello("New 2023");
  }
}
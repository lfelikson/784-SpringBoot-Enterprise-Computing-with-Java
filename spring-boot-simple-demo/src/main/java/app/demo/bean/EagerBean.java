package app.demo.bean;
import org.springframework.stereotype.Component;
@Component
public class EagerBean {
	public EagerBean() {
		System.out.println("New EagerBean is instantiated !!!!!");
    }
}
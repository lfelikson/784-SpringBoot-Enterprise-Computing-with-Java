package app.demo.bean;
import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Lazy;

@Lazy
@Component
public class LazyBean {
	public LazyBean() {
		System.out.println("New LazyBean is instantiated !!!!!");
    }
}
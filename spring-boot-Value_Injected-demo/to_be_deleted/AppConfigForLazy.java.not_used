package app.demo.springbootsimpledemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import app.demo.bean.Company;
import app.demo.bean.Customer;
import app.demo.bean.Employee;

//import lombok.val;

@Lazy
@Configuration
@ComponentScan("app.demo.bean")
public class AppConfigForLazy {

	@Bean
    public Company companyBean(){
        return new Company();
    }

    @Bean
    public Employee employeeBean(){
        return new Employee();
    }
    
    @Lazy(value = false)
    @Bean
    public Customer customerBean(){
        return new Customer();
    }
}

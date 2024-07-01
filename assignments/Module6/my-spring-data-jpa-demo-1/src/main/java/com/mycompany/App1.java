package com.mycompany;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.context.annotation.Bean;
import java.util.*;
import com.mycompany.Student;

// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App1
{
  public static void main(String[] args) {
    SpringApplication.run(App1.class, args);
  }

  @Bean
  CommandLineRunner runner(StudentRepository repository) {
    return args -> {

      Student student = new Student();
      student.setName("John");

      repository.save(student);
      Student saved = repository.findById(student.getId()).orElseThrow(NoSuchElementException::new);
    };
   }
}   
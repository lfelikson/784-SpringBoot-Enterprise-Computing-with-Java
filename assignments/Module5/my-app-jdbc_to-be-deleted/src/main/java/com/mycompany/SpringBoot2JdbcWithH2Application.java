package com.mycompany;

import com.mycompany.student.Student;
import com.mycompany.student.StudentJdbcRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot2JdbcWithH2Application implements CommandLineRunner {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    StudentJdbcRepository repository;

    public static ConfigurableApplicationContext ctx;

    public static void main(String[] args) {
        ctx=SpringApplication.run(SpringBoot2JdbcWithH2Application.class, args);
        ctx.close();

    }

    @Override
    public void run(String... args) {

        logger.info("ALL USERS AT START -> {}", repository.findAll());
        
        logger.info("COUNT OF ROWS IN STUDENT TABLE AT START -> {}", repository.countRows());

        logger.info("STUDENT ID=11 -> {}", repository.findById(11L));

        logger.info("INSERTING -> {}", repository.insert(new Student(21L, "new-student", "new_email@email.com")));

        logger.info("COUNT OF ROWS IN STUDENT TABLE AFTER INSERT -> {}", repository.countRows());

        logger.info("ALL USERS -> {}", repository.findAll());

        logger.info("UPDATING STUDENT ID=21 -> {}", repository.update(new Student(21L, "new-student-UPDATED", "New-Email")));

        logger.info("ALL USERS AFTER  UPDATE -> {}", repository.findAll());

        repository.deleteById(21L);

        logger.info("ALL USERS AFTER DELETE -> {}", repository.findAll());

        logger.info("COUNT OF ROWS IN STUDENT TABLE AFTER DELETE -> {}", repository.countRows());

    }
}
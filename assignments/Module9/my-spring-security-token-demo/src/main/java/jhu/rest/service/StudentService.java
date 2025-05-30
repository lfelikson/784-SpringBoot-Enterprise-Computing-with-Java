package jhu.rest.service;

import jhu.rest.jpa.Student;
import org.springframework.security.core.userdetails.User;

import java.util.Optional; 

public interface StudentService {

    String login(String username, String password);
    Optional<User> findByToken(String token);
    Student findById(Long id);
}

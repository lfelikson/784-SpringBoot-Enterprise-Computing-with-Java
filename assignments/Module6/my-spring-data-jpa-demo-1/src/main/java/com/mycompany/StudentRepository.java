package com.mycompany;

import org.springframework.data.repository.*;
import java.util.*;

interface StudentRepository extends Repository<Student, Long> {

    Student save(Student student);
  
    Optional<Student> findById(long id);
  }
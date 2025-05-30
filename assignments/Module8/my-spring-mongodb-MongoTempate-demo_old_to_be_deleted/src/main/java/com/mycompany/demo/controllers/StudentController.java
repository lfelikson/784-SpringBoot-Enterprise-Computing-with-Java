package com.mycompany.demo.controllers;

import com.mycompany.demo.dtos.CreateStudentDto;
import com.mycompany.demo.dtos.CreateCourseDto;
import com.mycompany.demo.models.Student;
import com.mycompany.demo.models.Course;
import com.mycompany.demo.repositories.StudentRepository;
import com.mycompany.demo.repositories.CourseRepository;
import com.mycompany.demo.dals.StudentDAL;
import com.mycompany.demo.dals.StudentDALImpl;
import java.util.List;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/studentTest")
public class StudentController {

    CourseRepository courseRepository;
    StudentRepository studentRepository;

    //define Data Access Layer object
    private final StudentDAL studentDAL;

    //initialize DAL object via constructor autowiring
    public StudentController (StudentRepository studentRepository, StudentDAL studentDAL) {
	this.studentRepository = studentRepository;
	this.studentDAL = studentDAL;
    }

    //change method implementation to use DAL and hence MongoTemplate
    @RequestMapping("/studentName/{studName}")
    public Object getAllStudentSettings(@PathVariable String studName) {
        Student student = studentRepository.findById(studName);
        if (student != null) {
            return studentDAL.getStudentByName(studName);
        } else {
            return "User not found.";
        }
    }
    /*

    //change method implementation to use DAL and hence MongoTemplate
    @RequestMapping(value = "/settings/{userId}/{key}", method = RequestMethod.GET)
    public String getUserSetting(
        @PathVariable String userId, @PathVariable String key) {
        return userDAL.getUserSetting(userId, key);
    }
  */  
}
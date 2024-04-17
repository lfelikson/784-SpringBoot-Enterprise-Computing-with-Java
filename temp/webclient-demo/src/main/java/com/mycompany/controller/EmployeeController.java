package com.mycompany.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.mycompany.model.Employee;
import com.mycompany.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
 
@RestController
@RequestMapping("/employees")
public class EmployeeController 
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(path="/leonid")
    @ResponseStatus(HttpStatus.OK)
    public String findMe() {
        System.out.println("in findMe");
    	return "from....findMe";
    }
    
    @GetMapping(produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public Flux<Employee> findAll() {
        System.out.println("???????????????????????????????????????????++++++++=============");
    	return employeeService.findAll();
    }
    
    @GetMapping(value = "/{id}")
    public Mono<Employee> findById(@PathVariable("id") Integer id) {
        return employeeService.findById(id);
    }
 
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<Employee> create(@RequestBody Employee e) {
    	return employeeService.create(e);
    }
 
    @PutMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Employee> update(@RequestBody Employee e, @PathVariable("id") Integer id) {
    	e.setId(id);
        return employeeService.update(e);
    }
 
    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Mono<Void> delete(@PathVariable("id") Integer id) {
    	return employeeService.delete(id);
    }
}
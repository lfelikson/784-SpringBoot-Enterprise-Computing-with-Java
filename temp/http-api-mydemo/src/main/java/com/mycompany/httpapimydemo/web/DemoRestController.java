package com.mycompany.httpapimydemo.web;

import org.springframework.web.bind.annotation.RestController;
//import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class DemoRestController {

// @RestController is a specialized version of the controller. 
// It includes the @Controller and @ResponseBody annotations, 
// and as a result, simplifies the controller implementation:==> wraps @Controller
// It also wraps @Component
//
// @RequestMapping: This is used to map to the Spring MVC controller method.
// @ResponseBody: Used to bind the HTTP response body with a domain object in the return type.

@GetMapping("/demo1")
public String do1() {
    return "demo1";
}

@GetMapping("/demo2")
public String do2() {
    return "demo2";
}

@GetMapping("/demo3")
public String do3() {
    return "demo3";
}

@GetMapping("/message")
public MyOutputResource getMessage() {
    return new MyOutputResource("Hello from getMessage, 605.784 class!");
}

}
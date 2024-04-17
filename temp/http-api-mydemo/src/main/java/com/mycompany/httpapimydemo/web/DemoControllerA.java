package com.mycompany.httpapimydemo.web;

//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping ("rpc/demo")
public class DemoControllerA {

//    @Controller: This is used to specify the controller.
//    @RequestMapping: This is used to map to the Spring MVC controller method.
//    @ResponseBody: Used to bind the HTTP response body with a domain object in the return type.

	@RequestMapping("/hello")
    @ResponseBody
  
    // Method
    public String hello784Class()
    {

        // return "<html><h1>Hello, 605.784 class!</h1></html>"; <!-- or HTML -->
        return "Hello, 605.784 class!";
    }

    @RequestMapping(path="doIt/{greeting}",  method=RequestMethod.GET )
    @ResponseBody
    public String getFooById(@PathVariable ("greeting") String greeting,
    @RequestParam(value = "name", defaultValue = "happy life!") String name){
        return name + ", " + greeting;
    }
}
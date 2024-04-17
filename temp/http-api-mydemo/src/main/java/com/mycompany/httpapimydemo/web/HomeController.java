package com.mycompany.httpapimydemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    public String homePage(Model model ) {

            System.out.println("???????????????????????????????????????");

//        Map<String, String> model = new HashMap<>();
//        model.put("firstName", "Sergey");
//        model.put("lastName", "Kargopolov");

        model.addAttribute ("firstName", "Leonid");
        model.addAttribute ("lastName", "Felikson");

//       ModelAndView modelAndView = new ModelAndView("home", model);
       return "home";  
//       return modelAndView;
    }

}
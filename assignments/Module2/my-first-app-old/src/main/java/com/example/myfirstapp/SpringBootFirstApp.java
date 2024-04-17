package com.example.myfirstapp;

import app.demo.bean.School;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootFirstApp {

    public static void main(String[] args) {

//        NotificationService ntf = getSchoolFromXml();
//        System.out.println("\n" + jhu + "\n");

        NotificationService ntf = getNotifFromJavaConfig();

        System.out.println("\n" + ntf + "\n");
    }

    private static NotificationService getNotifFromJavaConfig() {
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        return context.getBean(Notification.class);
    }

/*
    private static School getSchoolFromXml() {
        ApplicationContext context = new ClassPathXmlApplicationContext("DIconstructor.xml");

        return context.getBean(School.class);
    }
*/

}
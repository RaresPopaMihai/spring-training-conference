package com.tutorials.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tutorials.spring.services.SpeakerService;
import com.tutorials.spring.services.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        SpeakerService service = appContext.getBean("speakerService",SpeakerService.class);

        System.out.println(service.findAll().get(0).getFirstName());

    }

}

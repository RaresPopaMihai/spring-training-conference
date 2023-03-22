package com.tutorials.spring;

import com.tutorials.spring.services.SpeakerService;
import com.tutorials.spring.services.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {

        SpeakerService service = new SpeakerServiceImpl();

        System.out.println(service.findAll().get(0).getFirstName());

    }

}

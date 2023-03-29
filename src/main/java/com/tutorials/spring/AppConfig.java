package com.tutorials.spring;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.tutorials.spring.repositories.HibernateSpeakerRepositoryImpl;
import com.tutorials.spring.repositories.SpeakerRepository;
import com.tutorials.spring.services.SpeakerService;
import com.tutorials.spring.services.SpeakerServiceImpl;

@Configuration
@ComponentScan({"com.tutorials.spring"})
public class AppConfig {

//    @Bean( name = "speakerService")
//    @Scope( value = BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        // SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        //service.setRepository(getSpeakerRepository());
//
//        return service;
//    }

//    @Bean ( name ="speakerRepository")
//    public SpeakerRepository getSpeakerRepository(){
//        return new HibernateSpeakerRepositoryImpl();
//    }

}

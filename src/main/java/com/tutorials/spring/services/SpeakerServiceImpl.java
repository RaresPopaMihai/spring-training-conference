package com.tutorials.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.tutorials.spring.models.Speaker;
import com.tutorials.spring.repositories.HibernateSpeakerRepositoryImpl;
import com.tutorials.spring.repositories.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository ;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    @Autowired
    public void setRepository(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl setter ");
        this.repository = repository;
    }

}

package com.tutorials.spring.services;

import java.util.List;

import com.tutorials.spring.models.Speaker;
import com.tutorials.spring.repositories.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository ;

    public SpeakerServiceImpl(){
        System.out.println("constructor with no arg called");
    }

    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("constructor with arg called");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("setter called");
        this.repository = repository;
    }

}

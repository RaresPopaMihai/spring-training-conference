package com.tutorials.spring.services;

import java.util.List;

import com.tutorials.spring.models.Speaker;
import com.tutorials.spring.repositories.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository ;

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

    public void setSpeakerRepository(SpeakerRepository repository) {
        System.out.println("setter called");
        this.repository = repository;
    }

}

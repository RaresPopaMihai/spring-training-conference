package com.tutorials.spring.services;

import java.util.List;

import com.tutorials.spring.models.Speaker;
import com.tutorials.spring.repositories.HibernateSpeakerRepositoryImpl;
import com.tutorials.spring.repositories.SpeakerRepository;

public class SpeakerServiceImpl implements SpeakerService {
    
    private SpeakerRepository repository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }
    
}

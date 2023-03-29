package com.tutorials.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorials.spring.models.Speaker;
import com.tutorials.spring.repositories.SpeakerRepository;

@Service("speakerService")
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    private SpeakerRepository repository ;

    public SpeakerServiceImpl(){
        System.out.println("SpeakerServiceImpl no args constructor");
    }

    //@Autowired
    public SpeakerServiceImpl(SpeakerRepository repository) {
        System.out.println("SpeakerServiceImpl repository constructor");
        this.repository = repository;
    }

    @Override
    public List<Speaker> findAll(){
        return repository.findAll();
    }

//    @Autowired
//    public void setRepository(SpeakerRepository repository) {
//        System.out.println("SpeakerServiceImpl setter ");
//        this.repository = repository;
//    }

}

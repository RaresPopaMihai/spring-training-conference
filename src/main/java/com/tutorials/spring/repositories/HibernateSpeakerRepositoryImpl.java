package com.tutorials.spring.repositories;

import java.util.ArrayList;
import java.util.List;

import com.tutorials.spring.models.Speaker;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {

    @Override
    public List<Speaker> findAll(){
        List<Speaker> speakers = new ArrayList<>();

        Speaker speaker = new Speaker();
        speaker.setFirstName("Jon");
        speaker.setLastName("Jones");

        speakers.add(speaker);

        return speakers;
    }

}

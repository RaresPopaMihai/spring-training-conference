package com.tutorials.spring.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutorials.spring.models.Speaker;


@Repository("speakerRepository")
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

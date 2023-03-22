package com.tutorials.spring.repositories;

import java.util.List;

import com.tutorials.spring.models.Speaker;

public interface SpeakerRepository {

    List<Speaker> findAll();

}

package com.tutorials.spring.services;

import java.util.List;

import com.tutorials.spring.models.Speaker;

public interface SpeakerService {

    List<Speaker> findAll();

}

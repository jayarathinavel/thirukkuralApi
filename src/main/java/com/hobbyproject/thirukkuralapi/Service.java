package com.hobbyproject.thirukkuralapi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;

    public Optional<Entity> getAllByVerseNumber(int verseNumber){
        return repository.findById(verseNumber);
    }
}

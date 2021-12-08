package com.hobbyproject.thirukkuralapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    Service service;

    @GetMapping("/getByVerseNumber")
    public Optional<Entity> getAllByVerseNumber(@RequestParam int verseNumber){
        return service.getAllByVerseNumber(verseNumber);
    }

}

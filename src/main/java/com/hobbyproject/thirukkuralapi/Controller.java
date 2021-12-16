package com.hobbyproject.thirukkuralapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class Controller {
    @Autowired
    Service service;

    @GetMapping("/getAllByVerseNumber")
    public Optional<Entity> getAllByVerseNumber(@RequestParam int verseNumber){
        return service.getAllByVerseNumber(verseNumber);
    }

    @GetMapping("/getVerseByVerseNumber")
    public String getVerseByVerseNumber(@RequestParam int verseNumber){
        return service.getVerseByVerseNumber(verseNumber);
    }

    @GetMapping("/getChapterNames")
    public List<String> getChapterNames(){
        return service.getChapterNames();
    }

    @GetMapping("/getSectionNames")
    public List<String> getSectionNamesOfChapterName(String chapterName){
        return service.getSectionNamesOfChapterName(chapterName);
    }

    @GetMapping("/getSectionNamesByChapterNumber")
    public List<String> getSectionNamesOfChapterName(int chapterNumber){
        return service.getSectionNamesByChapterNumber(chapterNumber);
    }

    @GetMapping("/getAllByChapterName")
    public List<Entity> getAllByChapterName(@RequestParam String chapterName){
        return service.getAllByChapterName(chapterName);
    }

    @GetMapping("/getAllByChapterNumber")
    public List<Entity> getAllByChapterNumber(@RequestParam int chapterNumber){
        return service.getAllByChapterNumber(chapterNumber);
    }

    @GetMapping("/getAllBySectionName")
    public List<Entity> getAllBySectioName(@RequestParam String sectionName){
        return service.getAllBySectionName(sectionName);
    }

    @GetMapping("/getAllBySectionNumber")
    public List<Entity> getAllBySectioNumber(@RequestParam int sectionNumber){
        sectionNumber = sectionNumber-1;
        return service.getAllBySectionNumber(sectionNumber);
    }

    @GetMapping("/getSectionNameByNumber")
    public String getSectioNameByNumber(@RequestParam int sectionNumber){
        sectionNumber = sectionNumber-1;
        return service.sectionNameByNumber().get(sectionNumber);
    }

    @GetMapping("/getAll")
    public List<Entity> getAll(){
        return service.getAll();
    }

    @GetMapping("/getRandom")
    public Optional<Entity> getRandom(){
        return service.getRandom();
    }

}

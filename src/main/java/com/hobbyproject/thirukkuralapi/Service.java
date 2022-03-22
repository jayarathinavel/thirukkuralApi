package com.hobbyproject.thirukkuralapi;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.*;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    Repository repository;

    Random random = new Random();

    public Optional<Entity> getAllByVerseNumber(int verseNumber){
        return repository.findById(verseNumber);
    }

    public String getVerseByVerseNumber(int verseNumber){
       List<Entity> getAll = repository.findAllById(Collections.singleton(verseNumber));
       return getAll.get(0).getVerse();
    }

    public List<String> getChapterNames(){
        return repository.getChapterNames();
    }

    public List<String> getSectionNamesOfChapterName(String chapterName){
        return repository.getSectionNamesOfChapterName(chapterName);
    }

    public List<String> getSectionNamesByChapterNumber(int chapterNumber){
        String chapterName = chapterNameByNumber().get(chapterNumber);
        return repository.getSectionNamesOfChapterName(chapterName);
    }

    public List<Entity> getAllByChapterName(String chapterName) {
        return  repository.getAllByChapterName(chapterName);
    }

    public List<Entity> getAllByChapterNumber(int chapterNumber) {
        String chapterName = chapterNameByNumber().get(chapterNumber);
        return  repository.getAllByChapterName(chapterName);
    }

    public List<Entity> getAllBySectionName(String sectionName) {
        return repository.getAllBySectionName(sectionName);
    }

    public List<Entity> getAllBySectionNumber(int sectionNumber) {
        String sectionName = sectionNameByNumber().get(sectionNumber);
        return repository.getAllBySectionName(sectionName);
    }

    public Map<Integer, String> chapterNameByNumber(){
        HashMap<Integer, String> chapterNameByNumber = new HashMap<>();
        chapterNameByNumber.put(1, "அறத்துப்பால் ");
        chapterNameByNumber.put(2, "பொருட்பால்");
        chapterNameByNumber.put(3, "காமத்துப்பால்");
        return chapterNameByNumber;
    }

    public Map<Integer, String> sectionNameByNumber(){
        HashMap<Integer, String> sectionNameByNumber = new HashMap<>();
        List<String> sectionNames = repository.getSectionNames();
        for (int i = 0; i<sectionNames.size(); i++){
            sectionNameByNumber.put(i,sectionNames.get(i));
        }
        return sectionNameByNumber;
    }

    public Optional<Entity> getRandom(){
        int verseNumber = random.nextInt(1331);
        return repository.findById(verseNumber+1);
    }

    public List<Entity> getAll() {
        return repository.findAll();
    }
}

package com.hobbyproject.thirukkuralapi;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name="thirukkural")
public class Entity {
    @Id
    @Column(name = "VerseNumber")
    private int verseNumber;
    @Column(name = "ChapterName")
    private String chapterName;
    @Column(name = "SectionName")
    private String sectionName;
    @Column(name = "Verse")
    private String verse;
    @Column(name = "Translation")
    private String translation;
    @Column(name = "Explanation")
    private String explanation;

    public int getVerseNumber() {
        return verseNumber;
    }

    public void setVerseNumber(int verseNumber) {
        this.verseNumber = verseNumber;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getVerse() {
        return verse;
    }

    public void setVerse(String verse) {
        this.verse = verse;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getExplanation() {
        return explanation;
    }

    public void setExplanation(String explanation) {
        this.explanation = explanation;
    }
}

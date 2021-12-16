package com.hobbyproject.thirukkuralapi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity, Integer> {
    @Query(value = "SELECT DISTINCT(ChapterName) FROM thirukkural", nativeQuery = true)
    List<String> getChapterNames();

    @Query(value = "SELECT DISTINCT(SectionName) FROM thirukkural", nativeQuery = true)
    List<String> getSectionNames();

    @Query(value = "SELECT DISTINCT(SectionName) FROM thirukkural WHERE ChapterName = ?1 ", nativeQuery = true)
    List<String> getSectionNamesOfChapterName(String chapterName);

    @Query(value = "SELECT * FROM thirukkural WHERE ChapterName = ?1", nativeQuery = true)
    List<Entity> getAllByChapterName(String chapterName);

    @Query(value = "SELECT * FROM thirukkural WHERE SectionName = ?1", nativeQuery = true)
    List<Entity> getAllBySectionName(String chapterName);

}

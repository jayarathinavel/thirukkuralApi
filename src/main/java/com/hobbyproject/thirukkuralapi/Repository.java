package com.hobbyproject.thirukkuralapi;

import org.springframework.data.jpa.repository.JpaRepository;

@org.springframework.stereotype.Repository
public interface Repository extends JpaRepository<Entity, Integer> {
}

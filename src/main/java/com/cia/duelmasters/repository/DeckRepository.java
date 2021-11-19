package com.cia.duelmasters.repository;

import com.cia.duelmasters.entity.Deck;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeckRepository extends JpaRepository<Deck,Long> {
    Deck getByDeckName(String name);
}

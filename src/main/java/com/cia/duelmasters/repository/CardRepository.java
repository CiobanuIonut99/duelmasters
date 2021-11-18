package com.cia.duelmasters.repository;

import com.cia.duelmasters.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CardRepository extends JpaRepository<Card,Long> {

}

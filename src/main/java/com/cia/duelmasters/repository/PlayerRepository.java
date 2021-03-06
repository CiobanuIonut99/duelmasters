package com.cia.duelmasters.repository;

import com.cia.duelmasters.entity.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends JpaRepository<Player,Long> {
     Player getPlayerByUsername(String username);
}

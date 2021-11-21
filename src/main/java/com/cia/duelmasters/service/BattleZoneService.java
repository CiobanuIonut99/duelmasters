package com.cia.duelmasters.service;

import com.cia.duelmasters.entity.Player;
import com.cia.duelmasters.repository.PlayerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BattleZoneService {
    PlayerRepository playerRepository;

    public BattleZoneService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public void startGame(List<Player> players) {


    }
}

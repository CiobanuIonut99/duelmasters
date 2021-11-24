package com.cia.duelmasters.service;

import com.cia.duelmasters.DTO.PlayerDTO;
import com.cia.duelmasters.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class BattleZoneService {
    PlayerRepository playerRepository;
    PlayerService playerService;

    @Autowired
    public BattleZoneService(PlayerRepository playerRepository, PlayerService playerService) {
        this.playerRepository = playerRepository;
        this.playerService = playerService;
    }

    public ResponseEntity<HttpStatus> startGame(List<PlayerDTO> players) {
        decideWhoStarts(players);
        System.out.println(players.get(0).isMyTurn());
        System.out.println(players.get(1).isMyTurn());

        var player1 = players.get(0);
        var player2 = players.get(1);

        return ResponseEntity.ok(HttpStatus.OK);
    }



    private List<PlayerDTO> decideWhoStarts(List<PlayerDTO> players) {
        var random = new Random();
        var player1 = players.get(0);
        var player2 = players.get(1);

        int oneOrTwo = random.nextInt(2);
        if (oneOrTwo == 1) {
            player1.setMyTurn(true);
        } else {
            player2.setMyTurn(true);
        }

        return players;
    }
}

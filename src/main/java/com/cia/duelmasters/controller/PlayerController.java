package com.cia.duelmasters.controller;

import com.cia.duelmasters.DTO.CardDTO;
import com.cia.duelmasters.DTO.DeckDTO;
import com.cia.duelmasters.DTO.PlayerDTO;
import com.cia.duelmasters.entity.Player;
import com.cia.duelmasters.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/players")
@CrossOrigin(origins = "*")
public class PlayerController {
    private PlayerService playerService;

    @Autowired
    public PlayerController(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping("random-deck")
    public DeckDTO generateRandomDeck() {
        return playerService.generateRandomDeck();
    }

    @PostMapping
    public ResponseEntity<HttpStatus> saveNewPlayer(@RequestBody PlayerDTO playerDTO) {
        return playerService.saveNewPlayer(playerDTO);
    }

    @PutMapping
    public Player setDeckForPlayer(@RequestBody PlayerDTO playerDTO) {
        return playerService.setDeckForPlayer(playerDTO);
    }

    @GetMapping("shields")
    public List<CardDTO> generateShields(@RequestBody PlayerDTO playerDTO) {
        return playerService.generateShields(playerDTO);
    }

}

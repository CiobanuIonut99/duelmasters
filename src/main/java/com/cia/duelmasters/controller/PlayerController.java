package com.cia.duelmasters.controller;

import com.cia.duelmasters.DTO.PlayerDTO;
import com.cia.duelmasters.entity.Deck;
import com.cia.duelmasters.entity.Player;
import com.cia.duelmasters.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public Deck generateRandomDeck() {
        return playerService.generateRandomDeck();
    }

    @GetMapping("my-deck/{username}")
    public PlayerDTO getMyDeck(@PathVariable(name = "username") String username) {
        return playerService.getMyDeck(username);
    }

    @PostMapping
    public ResponseEntity<HttpStatus> saveNewPlayer(@RequestBody PlayerDTO playerDTO) {
        return playerService.saveNewPlayer(playerDTO);
    }

    @PutMapping
    public Player setDeckForPlayer(@RequestBody PlayerDTO playerDTO) {
        return playerService.setDeckForPlayer(playerDTO);
    }

    @PutMapping("tap")
    public PlayerDTO updateTappedCard(@RequestBody PlayerDTO playerDTO) {
        return playerService.updateTappedCard(playerDTO);
    }

    @GetMapping("shields-hand")
    public PlayerDTO generateShieldsAndHand(@RequestBody PlayerDTO playerDTO) {
         return playerService.generateShieldsAndHand(playerDTO);
    }

    @PutMapping("draw-card")
    public PlayerDTO drawACard(@RequestBody PlayerDTO playerDTO) {
          return playerService.drawACard(playerDTO);
    }

    @PutMapping("card-to-manazone")
    public PlayerDTO addCardInManaZone(@RequestBody PlayerDTO playerDTO) {
          return playerService.addCardInManaZone(playerDTO);
    }

    @PutMapping("card-to-attackzone")
    public PlayerDTO addCardInAttackZone(@RequestBody PlayerDTO playerDTO) {
        return playerService.addCardInAttackZone(playerDTO);
    }

}

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

    @PostMapping
    public ResponseEntity<HttpStatus> saveNewPlayer(@RequestBody PlayerDTO playerDTO) {
        return playerService.saveNewPlayer(playerDTO);
    }

    @PutMapping
    public Player setDeckForPlayer(@RequestBody PlayerDTO playerDTO) {
        return playerService.setDeckForPlayer(playerDTO);
    }

    @GetMapping("shields-hand")
    public PlayerDTO generateShieldsAndHand(@RequestBody PlayerDTO playerDTO) {
         return playerService.generateShieldsAndHand(playerDTO);
    }

    @GetMapping("draw-card")
    public PlayerDTO drawACard(@RequestBody PlayerDTO playerDTO) {
          return playerService.drawACard(playerDTO);
    }

    @GetMapping("card-to-manazone/{cardId}")
    public PlayerDTO addCardInManaZone(@RequestBody PlayerDTO playerDTO,@PathVariable(value = "cardId") Integer cardId) {
          return playerService.addCardInManaZone(playerDTO,cardId);
    }

}

package com.cia.duelmasters.controller;

import com.cia.duelmasters.DTO.PlayerDTO;
import com.cia.duelmasters.service.BattleZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/battlezone")
@CrossOrigin(origins = "*")
public class BattleZoneController {
    BattleZoneService battleZoneService;

    @Autowired
    public BattleZoneController(BattleZoneService battleZoneService) {
        this.battleZoneService = battleZoneService;
    }

    @GetMapping("start-game")
    public ResponseEntity<HttpStatus> startGame(@RequestBody  List<PlayerDTO> players) {
        return battleZoneService.startGame(players);
    }
}

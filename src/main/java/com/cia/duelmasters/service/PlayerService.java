package com.cia.duelmasters.service;

import com.cia.duelmasters.DTO.CardDTO;
import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.entity.Player;
import com.cia.duelmasters.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

@Service
public class PlayerService {
    private PlayerRepository playerRepository;
    private CardService cardService;

    @Autowired
    public PlayerService(PlayerRepository playerRepository, CardService cardService) {
        this.playerRepository = playerRepository;
        this.cardService = cardService;
    }

    public List<CardDTO> generateRandomDeck() {
        Random random = new Random();
        List<CardDTO> allCards = cardService.getCardDTOList();
        List<CardDTO> allCards4Times = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            allCards4Times.addAll(allCards);
        }
        List<CardDTO> deck = new ArrayList<>();

        Collections.shuffle(allCards4Times);

        for (int i = 0; i < 40; i++) {
            deck.add(allCards4Times.get(i));
        }
        return deck;
    }

}

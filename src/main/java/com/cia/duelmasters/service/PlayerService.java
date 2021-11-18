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
        List<CardDTO> deck = new ArrayList<>();

        Collections.shuffle(allCards);

        for (int i = 0; i < allCards.size(); i++) {
            deck.add(allCards.get(i));
        }
        return deck;
    }

}

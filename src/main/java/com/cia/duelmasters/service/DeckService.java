package com.cia.duelmasters.service;

import org.springframework.stereotype.Service;

@Service
public class DeckService {
    CardService cardService;

    public DeckService(CardService cardService) {
        this.cardService = cardService;
    }
}

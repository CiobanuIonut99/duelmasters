package com.cia.duelmasters.service;

import com.cia.duelmasters.DTO.DeckDTO;
import com.cia.duelmasters.entity.Deck;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@Service
public class DeckService {
    CardService cardService;

    public DeckService(CardService cardService) {
        this.cardService = cardService;
    }

    public DeckDTO mapDeckToDeckDTO(Deck deck) {
        return DeckDTO.builder()
                .cards(deck.getCards().stream().map(card -> cardService.mapEntityToDTO(card)).collect(Collectors.toList()))
                .deckName(deck.getDeckName())
                .id(deck.getId())
                .build();

    }
}

package com.cia.duelmasters.service;

import com.cia.duelmasters.DTO.CardDTO;
import com.cia.duelmasters.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

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
        List<CardDTO> allCards = cardService.getCardDTOList();
        List<CardDTO> deck = new ArrayList<>();
        Map<CardDTO, Integer> longIntegerMap = new HashMap<>();
        return getCardDTOS(allCards, deck, longIntegerMap);
    }

    private List<CardDTO> getCardDTOS(List<CardDTO> allCards, List<CardDTO> deck, Map<CardDTO, Integer> longIntegerMap) {
        int count;
        Random random = new Random();
        for (int i = 0; i < 40; i++) {
            int randomNr = random.nextInt(allCards.size());
            if (longIntegerMap.get(allCards.get(randomNr)) != null) {
                count = longIntegerMap.get(allCards.get(randomNr));
                if ((longIntegerMap.get(allCards.get(randomNr)) < 4)) {
                    deck.add(allCards.get(randomNr));
                    count++;
                    longIntegerMap.put(allCards.get(randomNr), count);
                }
            } else {
                deck.add(allCards.get(randomNr));
                longIntegerMap.put(allCards.get(randomNr), 1);
            }

        }
        System.out.println(deck.size());
        deck.forEach(System.out::println);
        return deck;
    }

}

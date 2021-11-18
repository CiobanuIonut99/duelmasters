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
        Collections.shuffle(allCards);
        return getCardDTOS(allCards, deck, longIntegerMap);
    }

    private List<CardDTO> getCardDTOS(List<CardDTO> allCards, List<CardDTO> deck, Map<CardDTO, Integer> longIntegerMap) {
        int count;
        for (int i = 0; i < allCards.size(); i++) {
            if (longIntegerMap.get(allCards.get(i)) != null) {
                count = longIntegerMap.get(allCards.get(i));
                if ((longIntegerMap.get(allCards.get(i)) <= 4)) {
                    deck.add(allCards.get(i));
                    count++;
                    longIntegerMap.put(allCards.get(i), count);
                }
            } else {
                deck.add(allCards.get(i));
                longIntegerMap.put(allCards.get(i), 1);
            }

        }
        return deck;
    }

}

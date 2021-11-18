package com.cia.duelmasters.service;

import com.cia.duelmasters.DTO.CardDTO;
import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.entity.Player;
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
        Random random = new Random();
        List<CardDTO> allCards = cardService.getCardDTOList();
        List<CardDTO> deck = new ArrayList<>();
        Map<CardDTO, Integer> longIntegerMap = new HashMap<>();
        Collections.shuffle(allCards);

        deck.add(allCards.get(0));
        longIntegerMap.put(allCards.get(0), 1);
        int count;

        Collections.shuffle(allCards);
        for (int i = 0; i < allCards.size(); i++) {
            if(longIntegerMap.get(allCards.get(i)) != null){
                count = longIntegerMap.get(allCards.get(i));
                if ((longIntegerMap.get(allCards.get(i)) <= 4)) {
                    deck.add(allCards.get(i));
                    count++;
                    longIntegerMap.put(allCards.get(i), count);
                }
            }else{
                deck.add(allCards.get(i));
            }

        }
        return deck;
    }

}

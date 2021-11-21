package com.cia.duelmasters.service;

import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardService {
    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    public List<Card> getCardList() {
        return cardRepository
                .findAll();
    }

}

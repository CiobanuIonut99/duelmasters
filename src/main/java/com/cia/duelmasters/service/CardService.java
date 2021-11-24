package com.cia.duelmasters.service;

import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public void saveAll(List<Card> cards) {
        cardRepository.saveAll(cards);
    }

    public Optional<Card> getById(Long id) {
        return cardRepository.findById(id);
    }

    public void save(Card card) {
        cardRepository.save(card);
    }

}

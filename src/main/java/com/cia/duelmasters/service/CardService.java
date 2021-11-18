package com.cia.duelmasters.service;

import com.cia.duelmasters.DTO.CardDTO;
import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.repository.CardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.stream.Collectors.toList;

@Service
public class CardService {
    private CardRepository cardRepository;

    @Autowired
    public CardService(CardRepository cardRepository) {
        this.cardRepository = cardRepository;
    }

    private CardDTO mapEntityToDTO(Card card) {
        return CardDTO
                .builder()
                .id(card.getId())
                .cardName(card.getCardName())
                .cardType(card.getCardType())
                .civilization(card.getCivilization())
                .race(card.getRace())
                .manaCost(card.getManaCost())
                .manaNumber(card.getManaNumber())
                .power(card.getPower())
                .abilityText(card.getAbilityText())
                .build();
    }

    public CardDTO getCardDTOByID(Long id) {
        return mapEntityToDTO(cardRepository.getById(id));
    }

    public List<CardDTO> getCardDTOList() {
       return cardRepository
               .findAll()
               .stream()
               .map(this::mapEntityToDTO)
               .collect(toList());
    }

}

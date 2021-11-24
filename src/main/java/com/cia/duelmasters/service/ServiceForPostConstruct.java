package com.cia.duelmasters.service;

import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.repository.CardRepository;
import liquibase.util.file.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.transaction.Transactional;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;

@Component
public class ServiceForPostConstruct {
    CardRepository cardRepository;
    CardService cardService;


    @Autowired
    public ServiceForPostConstruct(CardService cardService, CardRepository cardRepository) {
        this.cardService = cardService;
        this.cardRepository = cardRepository;
    }

    @PostConstruct
    public void updateIsTappedForCards() {
        List<Card> cards = cardService.getCardList();
        for (int i = 0; i < cards.size(); i++) {
            cards.get(i).setIsTapped(false);
        }
        cardService.saveAll(cards);
    }

    @PostConstruct
    public void addInDataBaseForEachCard() throws IOException {
        var p = Paths.get("src/main/resources/cards.images/HanusaRadianceElemental.jpg");
        Long x = 1L;
        Card card = cardService.getById(x).get();
        System.out.println(card);
        String cardName = card.getCardName().replaceAll("[^a-zA-Z]+", "");
        if(cardName.equals(FilenameUtils.removeExtension(p.getFileName().toString())))
        {
            File image = new File(p.toString());
            FileInputStream inputStream = new FileInputStream(image);
            byte[] cardImage =inputStream.readAllBytes();
            card.setCardImage(cardImage);
            cardService.save(card);
            System.out.println("aceeasi carte");
        }
        System.out.println(cardName);
    }
}

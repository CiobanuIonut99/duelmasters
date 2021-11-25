package com.cia.duelmasters.service;

import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.repository.CardRepository;
import liquibase.util.file.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
        List<Card> cards =
                cardService
                        .getCardList()
                        .stream()
                        .sorted(Comparator.comparing(Card::getCardName))
                        .collect(Collectors.toList());

        List<String> pathsOfCards =
                Files.list(Paths.get("src/main/resources/cards.images"))
                        .filter(file -> !Files.isDirectory(file))
                        .map(Path::getFileName)
                        .map(Path::toString)
                        .filter(name -> name.endsWith(".jpg"))
                        .sorted()
                        .collect(Collectors.toList());

        for (int i = 0; i < pathsOfCards.size(); i++) {
            Card card = cards.get(i);
            String fileNameWithoutExtension = FilenameUtils.removeExtension(pathsOfCards.get(i));
            String cardName = cards.get(i).getCardName();
            if (fileNameWithoutExtension.equalsIgnoreCase(cardName.replaceAll("[^a-zA-Z]+", ""))) {
                    File image = new File("src/main/resources/cards.images/".concat(pathsOfCards.get(i)));
                    FileInputStream inputStream = new FileInputStream(image);
                    byte[] cardImage =inputStream.readAllBytes();
                    card.setCardImage(cardImage);
                    cardService.save(card);
            }
        }
    }
}

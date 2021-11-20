package com.cia.duelmasters.service;

import com.cia.duelmasters.DTO.CardDTO;
import com.cia.duelmasters.DTO.DeckDTO;
import com.cia.duelmasters.DTO.PlayerDTO;
import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.entity.Deck;
import com.cia.duelmasters.entity.Player;
import com.cia.duelmasters.repository.DeckRepository;
import com.cia.duelmasters.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

import static java.util.stream.Collectors.toList;

@Service
public class PlayerService {
    private PlayerRepository playerRepository;
    private DeckRepository deckRepository;
    private CardService cardService;

    @Autowired
    public PlayerService(PlayerRepository playerRepository,
                         DeckRepository deckRepository,
                         CardService cardService) {
        this.playerRepository = playerRepository;
        this.deckRepository = deckRepository;
        this.cardService = cardService;
    }

    public DeckDTO generateRandomDeck() {
        List<CardDTO> allCards = cardService.getCardDTOList();
        List<CardDTO> deck = new ArrayList<>();
        Map<CardDTO, Integer> longIntegerMap = new HashMap<>();
        return getCardDTOS(allCards, deck, longIntegerMap);
    }

    private DeckDTO getCardDTOS(List<CardDTO> allCards, List<CardDTO> deck, Map<CardDTO, Integer> longIntegerMap) {
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

        return DeckDTO.builder().cards(deck).build();
    }

    public ResponseEntity<HttpStatus> saveNewPlayer(PlayerDTO playerDTO) {
        playerRepository.save(mapDTOToEntity(playerDTO));
        return ResponseEntity.ok(HttpStatus.CREATED);
    }

    private Player mapDTOToEntity(PlayerDTO playerDTO) {
        return Player
                .builder()
                .username(playerDTO.getUsername())
                .email(playerDTO.getEmail())
                .password(playerDTO.getPassword())
                .build();
    }

    public Player getPlayerByUsername(String username) {
        return playerRepository.getPlayerByUsername(username);
    }

    public Player setDeckForPlayer(PlayerDTO playerDTO) {
        Deck deck = saveNewDeckAndGetIt(playerDTO);

        long deckId = deck.getId();
        System.out.println(deckId);

        Player player = getPlayerByUsername(playerDTO.getUsername());
        deck.setDeckName(playerDTO.getDeckName());
        player.setDeck(deck);

        return playerRepository.save(player);
    }

    private Deck saveNewDeckAndGetIt(PlayerDTO playerDTO) {
        DeckDTO cardDTOGeneratedList = generateRandomDeck();
        List<Card> cardsList = mapCardsDtoToCardsEntity(cardDTOGeneratedList);

        Deck deck = Deck
                .builder()
                .deckName(playerDTO.getDeckName())
                .cards(cardsList).build();
        deckRepository.save(deck);

        return deck;
    }

    private List<Card> mapCardsDtoToCardsEntity(DeckDTO deckDto) {
        return deckDto
                .getCards()
                .stream()
                .map(cardDto -> cardService.mapToEntity(cardDto))
                .collect(toList());
    }
}

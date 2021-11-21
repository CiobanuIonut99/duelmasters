package com.cia.duelmasters.service;

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
    public static final int CARDS_IN_DECK = 40;
    public static final int CARDS_TO_REMOVE = 5;
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

    public Deck generateRandomDeck() {
        List<Card> allCards = cardService.getCardList();
        List<Card> deck = new ArrayList<>();
        Map<Card, Integer> longIntegerMap = new HashMap<>();
        return getCards(allCards, deck, longIntegerMap);
    }

    private Deck getCards(List<Card> allCards, List<Card> deck, Map<Card, Integer> longIntegerMap) {
        int count;
        var random = new Random();
        for (int i = 0; i < CARDS_IN_DECK; i++) {
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

        return Deck.builder().cards(deck).build();
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
        Player player = getPlayerByUsername(playerDTO.getUsername());
        Deck deck = saveNewDeckAndGetIt(playerDTO);
        deck.setDeckName(playerDTO.getDeckName());
        player.setDeck(deck);
        return playerRepository.save(player);
    }

    private Deck saveNewDeckAndGetIt(PlayerDTO playerDTO) {
        List<Card> cardsList = generateRandomDeck().getCards();

        return deckRepository
                .save(Deck.builder()
                        .deckName(playerDTO.getDeckName())
                        .cards(cardsList).build());
    }

    private Deck reverseDeck(Deck deck) {
        List<Card> cardsFromDeck = deck.getCards();
        List<Card> cards = new ArrayList<>();
        for (int i = cardsFromDeck.size() - 1; i >= 0; i--) {
            cards.add(cardsFromDeck.get(i));
        }
        return Deck.builder().cards(cards).build();
    }

    private Deck removeEach5Cards(Deck deck) {
        List<Card> cards = deck.getCards();
        for (int i = 0,j = 0; j < CARDS_TO_REMOVE; j++) {
            cards.remove(i);
        }
        deck.setCards(cards);
        return deck;
    }

    public PlayerDTO generateShieldsAndHand(PlayerDTO playerDTO) {
        Player player = playerRepository.getPlayerByUsername(playerDTO.getUsername());
        Collections.shuffle(player.getDeck().getCards());
        var reversedDeck = reverseDeck(player.getDeck());
        player.setDeck(reversedDeck);
        playerDTO.setShieldZone(getFirst5Cards(player));
        Deck deckWithout5Cards = removeEach5Cards(reversedDeck);

        playerDTO.setDeck(deckWithout5Cards);
        playerDTO.setHand(getFirst5Cards(player));
        deckWithout5Cards = removeEach5Cards(playerDTO.getDeck());
        playerDTO.setDeck(deckWithout5Cards);

        return playerDTO;
    }

    private List<Card> getFirst5Cards(Player player) {
        return player
                .getDeck()
                .getCards()
                .stream()
                .limit(5)
                .peek(System.out::println)
                .collect(toList());
    }
}

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
    private final PlayerRepository playerRepository;
    private final DeckRepository deckRepository;
    private final CardService cardService;

    @Autowired
    public PlayerService(PlayerRepository playerRepository,
                         DeckRepository deckRepository,
                         CardService cardService) {
        this.playerRepository = playerRepository;
        this.deckRepository = deckRepository;
        this.cardService = cardService;
    }

    public PlayerDTO drawACard(PlayerDTO playerDTO) {
        List<Card> deck = playerDTO.getDeck().getCards();
        List<Card> hand = playerDTO.getHand();
        hand.add(deck.get(0));
        deck.remove(0);
        return playerDTO;
    }

    public PlayerDTO updateTappedCard(PlayerDTO playerDTO) {
        //de schimbat getHand in getAttackZone cand avansez la partea de front end :)
        List<Card> cards = new ArrayList<>();
        if (playerDTO.getDeck() != null)
            cards.addAll(playerDTO.getDeck().getCards());
        if (playerDTO.getManaZone() != null)
            cards.addAll(playerDTO.getManaZone());
        if (playerDTO.getHand() != null)
            cards.addAll(playerDTO.getHand());
        changeTap(cards, playerDTO.getIdToChangeForTapping());

        return playerDTO;
    }

    private List<Card> changeTap(List<Card> cards, Integer id) {
        Card card;
        for (int i = 0; i < cards.size(); i++) {
            card = cards.get(i);
            if (Objects.equals(id, card.getPositionInList())) {
                card.setIsTapped(!card.getIsTapped());
                cards.set(i, card);
            }
        }
        return cards;
    }

    public PlayerDTO addCardInManaZone(PlayerDTO playerDTO) {

        List<Card> hand = playerDTO.getHand();
        List<Card> manaZone = playerDTO.getManaZone() == null ? new ArrayList<>() : playerDTO.getManaZone();

        for (int i = 0; i < hand.size(); i++) {
            if (Objects.equals(hand.get(i).getPositionInList().longValue(), playerDTO.getCardIdToPutInManaZone())) {
                manaZone.add(hand.get(i));
                hand.remove(hand.get(i));
            }
        }
        playerDTO.setManaZone(manaZone);

        return playerDTO;
    }

    public PlayerDTO addCardInAttackZone(PlayerDTO playerDTO) {

        List<Card> hand = playerDTO.getHand();
        List<Card> attackZone = playerDTO.getAttackZone() == null ? new ArrayList<>() : playerDTO.getAttackZone();

        for (int i = 0; i < hand.size(); i++) {
            if (Objects.equals(hand.get(i).getId(), playerDTO.getCardIdToPutInAttackZone())) {
                attackZone.add(hand.get(i));
                hand.remove(hand.get(i));
            }
        }
        playerDTO.setAttackZone(attackZone);

        return playerDTO;
    }

    public Deck generateRandomDeck() {
        List<Card> allCards = cardService.getCardList();
        List<Card> deck = new ArrayList<>();
        Map<Card, Integer> longIntegerMap = new HashMap<>();
        return getCards(allCards, deck, longIntegerMap);
    }

    public PlayerDTO getMyDeck(String username) {
        var player = playerRepository.getPlayerByUsername(username);
        var playerDTO = mapEntityToDTO(player);
        playerDTO = generateShieldsAndHand(playerDTO);
        return playerDTO;
    }

    private Deck getCards(List<Card> allCards, List<Card> deck, Map<Card, Integer> longIntegerMap) {
        int count;
        var random = new Random();
        Card card;
        for (int i = 0; i < CARDS_IN_DECK; i++) {
            int randomNr = random.nextInt(allCards.size());
            card = allCards.get(randomNr);
            card.setPositionInList(random.nextInt(2147483647));
            if (longIntegerMap.get(allCards.get(randomNr)) != null) {
                count = longIntegerMap.get(card);
                if ((longIntegerMap.get(card) < 4)) {
                    deck.add(card);
                    count++;
                    longIntegerMap.put(card, count);
                }
            } else {
                deck.add(card);
                longIntegerMap.put(card, 1);
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

    private PlayerDTO mapEntityToDTO(Player player) {
        return PlayerDTO
                .builder()
                .username(player.getUsername())
                .email(player.getEmail())
                .password(player.getPassword())
                .id(player.getId())
                .deck(player.getDeck())
                .manaZone(new ArrayList<>())
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
        for (int i = 0, j = 0; j < CARDS_TO_REMOVE; j++) {
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
                .collect(toList());
    }
}

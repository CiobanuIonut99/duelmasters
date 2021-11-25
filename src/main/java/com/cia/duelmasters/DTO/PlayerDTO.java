package com.cia.duelmasters.DTO;

import com.cia.duelmasters.entity.Card;
import com.cia.duelmasters.entity.Deck;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {
    //proprietes of player
    private Long id;
    private String username;
    private String deckName;
    private String email;
    private String password;
    private Deck deck;
    private List<Card> shieldZone = new ArrayList<>();
    private List<Card> hand = new ArrayList<>();
    private List<Card> manaZone = new ArrayList<>();
    private List<Card> attackZone = new ArrayList<>();
    private List<Card> graveYard = new ArrayList<>();
    private byte[] cardImage;

    //checks for actions
    private boolean myTurn;
    private Long cardIdToPutInManaZone;
    private Long cardIdToPutInAttackZone;
    private String location;
    private Integer idToChangeForTapping;
}

package com.cia.duelmasters.DTO;

import com.cia.duelmasters.entity.BattleZone;
import com.cia.duelmasters.entity.Card;
import lombok.*;

import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PlayerDTO {
    private Long id;
    private String username;
    private String deckName;
    private String email;
    private String password;
    private List<Card> cardIdDeck;
    private List<Card> cardIdShieldZone;
    private List<Card> cardIdCardsInHand;
    private List<Card> cardIdManaZone;
    private List<Card> cardIdGraveYard;
    private BattleZone battleZone;
}

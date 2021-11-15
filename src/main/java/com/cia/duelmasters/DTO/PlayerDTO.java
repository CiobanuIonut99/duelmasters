package com.cia.duelmasters.DTO;

import com.cia.duelmasters.entity.BattleZone;
import com.cia.duelmasters.entity.Card;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class PlayerDTO {

    private Long id;
    private String username;
    private List<Card> cardIdDeck;
    private List<Card> cardIdShieldZone;
    private List<Card> cardIdCardsInHand;
    private List<Card> cardIdManaZone;
    private List<Card> cardIdGraveYard;
    private BattleZone battleZone;


}

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
    private DeckDTO deckDTO;
    private List<Card> shieldZone;
    private List<Card> hand;
    private List<Card> manaZone;
    private List<Card> graveYard;
    private BattleZone battleZone;
}

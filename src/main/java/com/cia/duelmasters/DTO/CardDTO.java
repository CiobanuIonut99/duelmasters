package com.cia.duelmasters.DTO;

import com.cia.duelmasters.entity.Player;
import com.cia.duelmasters.enums.Civilization;
import com.cia.duelmasters.enums.SpecialAbility;
import lombok.*;

@Builder
@Data
public class CardDTO {
    private Long id;
    private String cardName;
    private String cardType;
    private Civilization civilization;
    private Integer manaCost;
    private Integer manaNumber;
    private Integer power;
    private String abilityText;
    private Player player;
    private SpecialAbility specialAbility;
}

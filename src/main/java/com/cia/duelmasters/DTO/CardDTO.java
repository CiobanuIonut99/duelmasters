package com.cia.duelmasters.DTO;

import com.cia.duelmasters.entity.Player;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class CardDTO {

private Long id;
private String cardName;
    private String cardType;
    private String civilization;
    private String race;
    private int manaCost;
    private int manaNumber;
    private int power;
    private String abilityText;
    private Player player;
}

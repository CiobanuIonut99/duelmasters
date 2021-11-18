package com.cia.duelmasters.DTO;

import com.cia.duelmasters.entity.Player;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CardDTO {
    private Long id;
    private String cardName;
    private String cardType;
    private String civilization;
    private Integer manaCost;
    private Integer manaNumber;
    private Integer power;
    private String abilityText;
    private Player player;
}

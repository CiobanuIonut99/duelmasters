package com.cia.duelmasters.DTO;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DeckDTO {
    private Long id;
    private String deckName;
    private List<CardDTO> cards;
}

package com.cia.duelmasters.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "deck_card", schema = "duel_masters")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class DeckCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(name = "card_id")
    private Integer cardId;

    @Column(name = "deck_id")
    private Integer deckId;


}

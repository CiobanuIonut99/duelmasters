package com.cia.duelmasters.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "deck", schema = "duel_masters")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String deckName;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Card> cardId;
}

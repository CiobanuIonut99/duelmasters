package com.cia.duelmasters.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private Long id;

    @Column
    private String deckName;

    @ManyToMany
    @JoinTable(
            name = "deck_card",
            schema = "duel_masters",
            joinColumns = @JoinColumn(name = "deck_id"),
            inverseJoinColumns = @JoinColumn(name = "card_id")
    )
    @JsonIgnore
    private List<Card> cards;

}

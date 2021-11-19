package com.cia.duelmasters.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
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

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "deck")
    private List<Card> cards;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
}

package com.cia.duelmasters.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "card", schema = "duel_masters")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String cardName;

    @Column
    private String cardType;

    @Column
    private String civilization;

    @Column
    private String race;

    @Column
    private int manaCost;

    @Column
    private int manaNumber;

    @Column
    private int power;

    @Column
    private String abilityText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
    private Player player;
}

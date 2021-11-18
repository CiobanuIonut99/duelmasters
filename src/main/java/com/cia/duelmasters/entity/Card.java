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
    private Integer manaCost;

    @Column
    private Integer manaNumber;

    @Column
    private Integer power;

    @Column
    private String abilityText;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAYER_ID")
    private Player player;
}

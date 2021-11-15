package com.cia.duelmasters.entity;


import liquibase.pro.packaged.C;
import liquibase.pro.packaged.S;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "player", schema = "duel_masters")
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String username;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> deck;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> shieldZone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> drag5Cards;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> manaZone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> graveYard;


}

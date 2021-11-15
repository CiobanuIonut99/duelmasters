package com.cia.duelmasters.entity;


import liquibase.pro.packaged.C;
import liquibase.pro.packaged.F;
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
    private List<Card> cardIdDeck;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> cardIdShieldZone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> cardIdCardsInHand;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> cardIdManaZone;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player")
    private List<Card> cardIdGraveYard;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "card_id")
    private BattleZone battleZone;

}

package com.cia.duelmasters.entity;

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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "battlezone_id")
    private BattleZone battleZone;

}

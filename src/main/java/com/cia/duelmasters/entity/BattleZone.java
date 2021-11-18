package com.cia.duelmasters.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "battlezone", schema = "duel_masters")
public class BattleZone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @OneToMany(fetch = FetchType.LAZY, mappedBy ="battleZone")
    private List<Player> player;

}

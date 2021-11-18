package com.cia.duelmasters.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "player", schema = "duel_masters")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Data
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "player",cascade = CascadeType.PERSIST)
    private List<Card> deck;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BATTLEZONE_ID")
    private BattleZone battleZone;

}

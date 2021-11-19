package com.cia.duelmasters.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "player", schema = "duel_masters")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String username;

    @Column
    private String email;

    @Column
    private String password;

    @OneToMany(mappedBy = "player",
            cascade = CascadeType.MERGE)
    private List<Deck> decks;

    @ManyToOne
    @JoinColumn(name = "battlezone_id")
    private BattleZone battleZone;

}

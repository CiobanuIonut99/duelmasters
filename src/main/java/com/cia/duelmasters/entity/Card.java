package com.cia.duelmasters.entity;

import com.cia.duelmasters.enums.Civilization;
import com.cia.duelmasters.enums.Race;
import com.cia.duelmasters.enums.SpecialAbility;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
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
    @Enumerated(EnumType.STRING)
    private Civilization civilization;

    @Column
    @Enumerated(EnumType.STRING)
    private Race race;

    @Column
    private Integer manaCost;

    @Column
    private Integer manaNumber;

    @Column
    private Integer power;

    @Column
    private String abilityText;

    @Column
    @Enumerated(EnumType.STRING)
    private SpecialAbility specialAbility;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLAYER_ID")
    private Player player;
}

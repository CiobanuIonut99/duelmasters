package com.cia.duelmasters.entity;

import com.cia.duelmasters.enums.Civilization;
import com.cia.duelmasters.enums.Race;
import com.cia.duelmasters.enums.SpecialAbility;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "card", schema = "duel_masters")
@Getter
@Setter
@ToString
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

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
    private Boolean isTapped;

    @Column
    @Enumerated(EnumType.STRING)
    private SpecialAbility specialAbility;

    @ManyToMany(mappedBy = "cards")
    @JsonIgnore
    private List<Deck> decks;

}

package com.cia.duelmasters.entity;

import lombok.*;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@Entity
@Table(name = "deck", schema = "duel_masters")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
public class Deck {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String deckName;

    @OneToMany(mappedBy = "deck",
            cascade = CascadeType.MERGE)
    private List<Card> cards;

    @ManyToOne
    @JoinColumn(name = "player_id")
    private Player player;
}

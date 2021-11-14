--changeset INSERT_INTO_TABLE_CARD

INSERT INTO duel_masters.card(CARDNAME, CARDTYPE, CIVILIZATION, RACE, MANACOST, MANANUMBER, POWER, ABILITYTEXT)
VALUES ('Bolshack Dragon', 'Creature', 'Fire', 'Armored Dragon', 6, 1, 6000,
        'While attacking this creature gets +1000 power for each fire card in your graveyard.');
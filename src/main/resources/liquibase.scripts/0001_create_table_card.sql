--changeset CREATE_TABLE_CARD

DROP TABLE IF EXISTS duel_masters.card cascade;
CREATE TABLE IF NOT EXISTS duel_masters.card(

    ID SERIAL unique,
    CARDNAME character varying (255),
    CARDTYPE character varying (255),
    CIVILIZATION char varying (255),
    RACE character varying (255),
    MANACOST int,
    MANANUMBER int,
    POWER int,
    ABILITYTEXT character varying (255)

);
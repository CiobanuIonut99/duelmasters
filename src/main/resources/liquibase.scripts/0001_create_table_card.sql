--changeset CREATE_TABLE_CARD

DROP TABLE IF EXISTS duel_masters.card cascade;
CREATE TABLE IF NOT EXISTS duel_masters.card(

    ID SERIAL unique,
    CARD_NAME character varying (255),
    CARD_TYPE character varying (255),
    CIVILIZATION char varying (255),
    RACE char varying (255),
    MANA_COST integer,
    MANA_NUMBER integer,
    DECK_CARD integer,
    POWER integer,
    DECK_ID integer,
    ABILITY_TEXT character varying (255),
    SPECIAL_ABILITY character varying (255)

    );
--changeset CREATE_TABLE_CARD

DROP TABLE IF EXISTS duel_masters.card cascade;
CREATE TABLE IF NOT EXISTS duel_masters.card(

    ID SERIAL unique,
    CARD_NAME character varying (255),
    CARD_TYPE character varying (255),
    CIVILIZATION char varying (255),
    RACE character varying (255),
    MANA_COST int,
    MANA_NUMBER int,
    POWER int,
    ABILITY_TEXT character varying (255),
    PLAYER_ID integer

    );
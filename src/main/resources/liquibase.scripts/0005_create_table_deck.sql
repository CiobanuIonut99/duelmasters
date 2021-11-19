--changeset CREATE_TABLE_DECK

DROP TABLE IF EXISTS duel_masters.deck cascade;
CREATE TABLE IF NOT EXISTS duel_masters.deck(

    ID SERIAL unique,
    DECK_NAME character varying (255),
    CARD_ID integer,
    CONSTRAINT CARD_ID  FOREIGN KEY (CARD_ID) REFERENCES duel_masters.card (ID)
    );
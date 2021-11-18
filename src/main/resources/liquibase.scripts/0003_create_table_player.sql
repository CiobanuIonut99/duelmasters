--changeset CREATE_TABLE_PLAYER

DROP TABLE IF EXISTS duel_masters.player cascade;
CREATE TABLE IF NOT EXISTS duel_masters.player(
    ID SERIAL unique,
    USERNAME character varying (255),
    CARD_ID_DECK integer,
    CONSTRAINT CARD_ID_DECK FOREIGN KEY (CARD_ID_DECK) REFERENCES duel_masters.CARD (ID)
);
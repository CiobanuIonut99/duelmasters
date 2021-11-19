--changeset CREATE_TABLE_PLAYER

DROP TABLE IF EXISTS duel_masters.player cascade;
CREATE TABLE IF NOT EXISTS duel_masters.player(
    ID SERIAL unique,
    USERNAME character varying (255),
    DECK_NAME character varying (255),
    EMAIL character varying (255),
    PASSWORD character varying (255),
    BATTLEZONE_ID integer,
    DECK_ID integer,
    CONSTRAINT DECK_ID FOREIGN KEY (DECK_ID) REFERENCES duel_masters.DECK (ID)
);
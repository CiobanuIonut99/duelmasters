--changeset CREATE_TABLE_BATTLEZONE

DROP TABLE IF EXISTS duel_masters.battlezone cascade;
CREATE TABLE IF NOT EXISTS duel_masters.battlezone(

    ID SERIAL unique,
    PLAYER_ID integer,
    CONSTRAINT PLAYER_ID  FOREIGN KEY (PLAYER_ID) REFERENCES duel_masters.player (ID)
);
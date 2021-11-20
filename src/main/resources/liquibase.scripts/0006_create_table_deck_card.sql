--changeset CREATE_TABLE_BATTLEZONE

DROP TABLE IF EXISTS duel_masters.deck_card cascade;
CREATE TABLE IF NOT EXISTS duel_masters.deck_card(

    ID SERIAL unique,
    DECK_ID integer,
    CARD_ID integer,

     CONSTRAINT DECK_ID FOREIGN KEY (DECK_ID) REFERENCES duel_masters.DECK (ID),
     CONSTRAINT CARD_ID FOREIGN KEY (CARD_ID) REFERENCES duel_masters.CARD (ID)

);
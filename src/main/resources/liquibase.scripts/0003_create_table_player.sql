--changeset CREATE_TABLE_PLAYER

DROP TABLE IF EXISTS duel_masters.player cascade;
CREATE TABLE IF NOT EXISTS duel_masters.player(

    ID SERIAL unique,

    USERNAME character varying (255),

    CARD_ID_DECK integer,
    CARD_ID_SHIELDZONE integer,
    CARD_ID_CARDSINHAND integer,
    CARD_ID_MANAZONE integer,
    CARD_ID_GRAVEYARD integer,


    CONSTRAINT CARD_ID_DECK FOREIGN KEY (CARD_ID_DECK) REFERENCES duel_masters.CARD (ID),
    CONSTRAINT CARD_ID_SHIELDZONE FOREIGN KEY (CARD_ID_SHIELDZONE) REFERENCES duel_masters.CARD (ID),
    CONSTRAINT CARD_ID_CARDSINHAND FOREIGN KEY (CARD_ID_CARDSINHAND) REFERENCES duel_masters.CARD (ID),
    CONSTRAINT CARD_ID_MANZONE FOREIGN KEY (CARD_ID_MANAZONE) REFERENCES duel_masters.CARD (ID),
    CONSTRAINT CARD_ID_GRAVEYARD FOREIGN KEY (CARD_ID_GRAVEYARD) REFERENCES duel_masters.CARD (ID)
);
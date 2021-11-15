--changeset CREATE_TABLE_PLAYER

DROP TABLE IF EXISTS duel_masters.player;
CREATE TABLE IF NOT EXISTS duel_masters.player(

    ID SERIAL unique,

    USERNAME character varying (255),

    DECK character varying (255),
    SHIELDZONE character varying (255),
    DRAG5CARDS character varying (255),
    MANAZONE character varying (255),
    GRAVEYARD character varying (255)

)
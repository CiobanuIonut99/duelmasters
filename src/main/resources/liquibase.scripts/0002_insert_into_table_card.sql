--changeset INSERT_INTO_TABLE_CARD

INSERT INTO duel_masters.card(CARD_NAME, CARD_TYPE, CIVILIZATION, RACE, MANA_COST, MANA_NUMBER, POWER, ABILITY_TEXT)
VALUES ('Bolshack Dragon', 'Creature', 'Fire', 'Armored Dragon', 6, 1, 6000,
        'While attacking this creature gets +1000 power for each fire card in your graveyard.'),
       ('Aqua Hulcus','Creature','Water','Liquid People',3,1,2000,
        'When you put this creature into the battle zone, you may draw a card'),
       ('Urth, Purifiying Elemental','Creature','Light','Angel Command',6,1,6000,
        'At the end of each of your turns, you may untap this creature'),
       ('Death Smoke','Spell','Dark',null,4,1,null,
        'Destroy 1 of your oppnent.s untapped creatures'),
       ('Natural Snare','Spell','Nature',null,6,1,null,
        'Shield trigger');

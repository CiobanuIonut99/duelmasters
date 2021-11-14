--changeset INSERT_INTO_TABLE_CARD

INSERT INTO duel_masters.card(CARDNAME, CARDTYPE, CIVILIZATION, RACE, MANACOST, MANANUMBER, POWER, ABILITYTEXT)
VALUES ('Bolshack Dragon', 'Creature', 'Fire', 'Armored Dragon', 6, 1, 6000,
        'While attacking this creature gets +1000 power for each fire card in your graveyard.'),
       ('Aqua Hulcus','Creature','Water','Liquid People',3,1,2000,'When you put this creature into the battle zone, you may draw a card'),
       ('Urth, Purifiying Elemental','Creature','Light','Angel Command',6,1,6000,'At the end of each of your turns, you may untap this creature'),
       ('Death Smoke','Spell','Dark',,4,1,,'Destroy 1 of your oppnent.s untapped creatures'),
       ('Natural Snare','Spell','Nature',,6,1,,'Shield trigger');

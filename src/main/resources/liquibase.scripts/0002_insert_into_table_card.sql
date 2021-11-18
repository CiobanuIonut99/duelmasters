--changeset INSERT_INTO_TABLE_CARD

INSERT INTO duel_masters.card(CARD_NAME, CARD_TYPE, CIVILIZATION,  MANA_COST, MANA_NUMBER, POWER, SPECIAL_ABILITY,ABILITY_TEXT )
VALUES
       ('Hanusa, Radiance Elemental','CREATURE','LIGHT',7,1,9500,'DOUBLE_BREAKER',null),
       ('Urth, Purifying Elemental','CREATURE','LIGHT',8,1,6000,'DOUBLE_BREAKER','At the end of each of your turns, you may untap this creature'),
       ('Aqua Sniper','CREATURE','WATER',8,1,5000,null,' When you put this creature into the battle zone,choose up to 2 creatures in the battle zone and return them to their owners hands'),
       ('king Depthcon','CREATURE','WATER',7,1,6000,'DOUBLE_BREAKER','This creature cant be blocked'),
       ('Deathliger, Lion of Chaos','CREATURE','DARK',7,1,9000,'DOUBLE_BREAKER',null),
       ('Zagaan, Knight of Darkness','CREATURE','DARK',6,1,7000,'DOUBLE_BREAKER',null),
       ('Scarlet Skyterror','CREATURE','FIRE',8,1,3000,null,'When you put this creature into the battle zone, destroys all creature that have "blocker"'),
       ('Astrocomet Dragon','CREATURE','FIRE',7,1,6000,'DOUBLE_BREAKER','Power attacker +4000 (While attacking, this creature gets +4000 power.'),
       ('Roaring Great-Horn','CREATURE','NATURE',7,1,8000,'DOUBLE_BREAKER','Power attacker +2000 (While attacking, this creature gets +2000 power.'),
       ('Deathblade Beetle','CREATURE','NATURE',5,1,3000,'DOUBLE_BREAKER','Power attacker +4000 (While attacking, this creature gets +4000 power.'),
       ('Chilias, the Oracle','CREATURE','LIGHT',4,1,2500,null,'When this creature would be destroyed, put into your hand instead'),
       ('Dia Nork, Moonlight Guardian','CREATURE','LIGHT',4,1,5000,'BLOCKER','This creature cant attack players.'),
       ('Emerald Grass','CREATURE','LIGHT',2,1,3000,'BLOCKER','This creature cant attack players.'),
       ('Frei, Vizier of Air','CREATURE','LIGHT',4,1,3000,null,'At the end of each of your turns, you may untap this creature.'),
       ('Gran Gure, Space Guardian','CREATURE','LIGHT',6,1,9000,'BLOCKER','This creature cant attack players'),
       ('Holy Awe','SPELL','LIGHT',6,1,9000,'SHIELD_TRIGGER','Tap all your opponnents creatures in the battle zone');


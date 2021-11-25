--changeset INSERT_INTO_TABLE_CARD
INSERT INTO duel_masters.card(CARD_NAME, CARD_TYPE, CIVILIZATION, RACE, MANA_COST, MANA_NUMBER, POWER, SPECIAL_ABILITY,ABILITY_TEXT )
VALUES
('Hanusa, Radiance Elemental','CREATURE','LIGHT','ANGEL_COMMAND',7,1,9500,'DOUBLE_BREAKER',null),
('Urth, Purifying Elemental','CREATURE','LIGHT','ANGEL_COMMAND',8,1,6000,'DOUBLE_BREAKER','At the end of each of your turns, you may untap this creature'),
('Aqua Sniper','CREATURE','WATER','LIQUID_PEOPLE',8,1,5000,null,' When you put this creature into the battle zone,choose up to 2 creatures in the battle zone and return them to their owners hands'),
('King Depthcon','CREATURE','WATER','LEVIATHAN',7,1,6000,'DOUBLE_BREAKER','This creature cant be blocked'),
('Deathliger, Lion of Chaos','CREATURE','DARK','DEMON_COMMAND',7,1,9000,'DOUBLE_BREAKER',null),
('Zagaan, Knight of Darkness','CREATURE','DARK','DEMON_COMMAND',6,1,7000,'DOUBLE_BREAKER',null),
('Scarlet Skyterror','CREATURE','FIRE','ARMORED_WYVERN',8,1,3000,null,'When you put this creature into the battle zone, destroys all creature that have "blocker"'),
('Astrocomet Dragon','CREATURE','FIRE','ARMORED_DRAGON',7,1,6000,'DOUBLE_BREAKER','Power attacker +4000 (While attacking, this creature gets +4000 power.'),
('Roaring Great-Horn','CREATURE','NATURE','HORNED_BEAST',7,1,8000,'DOUBLE_BREAKER','Power attacker +2000 (While attacking, this creature gets +2000 power.'),
('Deathblade Beetle','CREATURE','NATURE','GIANT_INSECT',5,1,3000,'DOUBLE_BREAKER','Power attacker +4000 (While attacking, this creature gets +4000 power.'),
('Chilias, the Oracle','CREATURE','LIGHT','LIGHT_BRINGER',4,1,2500,null,'When this creature would be destroyed, put into your hand instead'),
('Dia Nork, Moonlight Guardian','CREATURE','LIGHT','GUARDIAN',4,1,5000,'BLOCKER','This creature cant attack players.'),
('Emerald Grass','CREATURE','LIGHT','STARLIGHT_TREE',2,1,3000,'BLOCKER','This creature cant attack players.'),
('Frei, Vizier of Air','CREATURE','LIGHT','INITIATE',4,1,3000,null,'At the end of each of your turns, you may untap this creature.'),
('Gran Gure, Space Guardian','CREATURE','LIGHT','GUARDIAN',6,1,9000,'BLOCKER','This creature cant attack players'),
('Holy Awe','SPELL','LIGHT',null,6,1,9000,'SHIELD_TRIGGER','Tap all your opponnents creatures in the battle zone'),
('Iere, Vizier of Bullets','CREATURE','LIGHT','INITIATE',3,1,3000,null,null),
('Iocant, the Oracle','CREATURE','LIGHT','LIGHT_BRINGER',2,1,2000,'BLOCKER','1. While you have at least 1 Angel Command in the battle zone, this creature gets +2000 power. 2. This creature cant attack players'),
('La Ura Giga, Sky Guardian','CREATURE','LIGHT','GUARDIAN',1,1,2000,'BLOCKER','This creature cant attack players.'),
('Lah, Purification Enforcer','CREATURE','LIGHT','BERSERKER',5,1,5500,null,null),
('Laser Wing','SPELL','LIGHT',null,5,1,0,null,'Choose up to 2 of your creatures in the battlezone. They cant be blocked this turn'),
('Lok, Vizier of Hunting','CREATURE','LIGHT','INITIATE',4,1,4000,null,null),
('Miele, Vizier of Lightning','CREATURE','LIGHT','INITIATE',3,1,1000,null,'When you put this creature into the battlezone you may choose one of your opponnents creatures in the battlezone and tap it'),
('Moonlight Flash','SPELL','LIGHT',null,4,1,0,null,'Choose up to 2 of your opponnents creature in the battlezone and tap them'),
('Rayla, Truth Enforcer','CREATURE','LIGHT','BERSERKER',6,1,3000,null,'When you put this creature into the battlezone, search your deck. You may take a spell from your deck, show it to your opponnent and put it into your hand, then shuffle your deck.'),
('Reusol, the Oracle','CREATURE','LIGHT','LIGHT_BRINGER',2,1,2000,null,null),
('Ruby Grass','CREATURE','LIGHT','STARLIGHT_TREE',3,1,3000,'BLOCKER','1. This creature cant attack players. 2. At the end of each of your turns you may untap this creature'),
('Senatine, Jade Tree','CREATURE','LIGHT','STARLIGHT_TREE',3,1,4000,'BLOCKER','1. This creature cant attack players.'),
('Solar Ray','SPELL','LIGHT',null,2,1,0,'SHIELD_TRIGGER','Choose 1 of your opponents creatures in the battlezone and tap it'),
('Sonic Wing','SPELL','LIGHT',null,3,1,0,null,'Choose 1 of your creatures in the battlezone. It cant be blocked this turn'),
('Szubs Kin, Twilight Guardian','CREATURE','LIGHT','GUARDIAN',5,1,6000,'BLOCKER','This creature cant attack players'),
('Toel, Vizier of Hope','CREATURE','LIGHT','INITIATE',5,1,2000,null,'At the end of each of your turns, you may untap all your creatures in the battlezone'),
('Aqua Hulcus','CREATURE','WATER','LIQUID_PEOPLE',3,1,2000,null,'When you put this creature into the batlezone, you may draw a card'),
('Aqua Knight','CREATURE','WATER','LIQUID_PEOPLE',5,1,4000,null,'When this creature would be destroyed, return it to your hand instead'),
('Aqua Soldier','CREATURE','WATER','LIQUID_PEOPLE',3,1,1000,null,'When this creature would be destroyed, return it to your hand instead'),
('Aqua Vehicle','CREATURE','WATER','LIQUID_PEOPLE',2,1,1000,null,null),
('Brain Serum','SPELL','WATER',null,4,1,0,'SHIELD_TRIGGER','Draw up to 2 cards'),
('Candy Drop','CREATURE','WATER','CYBER_VIRUS',3,1,1000,null,'This creature cant be blocked'),
('Crystal Memory','SPELL','WATER',null,4,1,0,'SHIELD_TRIGGER','Search your deck, you may take a card from your deck and put it in your hand, then shuffle your deck'),
('Faerie Child','CREATURE','WATER','CYBER_VIRUS',4,1,2000,null,'This creature cant be blocked'),
('Hunter Fish','CREATURE','WATER','FISH',2,1,3000,'BLOCKER','This creature cant attack'),
('Illusionary Merfolk','CREATURE','WATER','GEL_FISH',5,1,4000,null,'When you put this creature into the battle zone, if you have a Cyber Lord in the battle zone, draw up to 3 cards'),
('King Coral','CREATURE','WATER','LEVIATHAN',3,1,1000,'BLOCKER',null),
('King Ripped-Hide','CREATURE','WATER','LEVIATHAN',7,1,5000,null,'When you put this creature into the battle zone, draw up to 2 cards'),
('Marine Flower','CREATURE','WATER','CYBER_VIRUS',1,1,2000,'BLOCKER','This creature cant attack'),
('Phantom Fish','CREATURE','WATER','GEL_FISH',3,1,4000,'BLOCKER','This creature cant attack'),
('Revolver Fish','CREATURE','WATER','GEL_FISH',4,1,5000,'BLOCKER','This creature cant attack'),
('Saucer-Head Shark','CREATURE','WATER','GEL_FISH',4,1,5000,null,'When you put this creature into the battle zone, return each creature in the battle zone that has power 2000 or less to its owners hand'),
('Seamine','CREATURE','WATER','FISH',6,1,4000,'BLOCKER',null),
('Spiral Gate','SPELL','WATER',null,2,1,0,'SHIELD_TRIGGER','Choose 1 creature in the battle zone and return it to its owners hand'),
('Teleportation','SPELL','WATER',null,5,1,0,null,'Choose up to 2 creatures in the battle zone and return them to their owners hands'),
('Tropico','CREATURE','WATER','CYBER_LORD',5,1,3000,null,'This creature cant be blocked while you have at least 2 other creatures in the battle zone'),
('Unicorn Fish','CREATURE','WATER','FISH',4,1,1000,null,'When you put this creature into the battle zone, you may choose 1 creature in the battle zone and return it to its owners hand'),
('Virtual Tripwire','SPELL','WATER',null,3,1,0,null,'Choose 1 of your opponent.s creature in the battle zone and tap it'),
('Black Feather, Shadow of Rage','CREATURE','DARK','GHOST',1,1,3000,null,'When you put this creature into the battle zone, destroy 1 of your creatures'),
('Bloody Squito','CREATURE','DARK','BRAIN_JACKER',2,1,4000,'BLOCKER','1. This creature cant attack. 2. When this creature wins a battle, destroy it'),
('Bone Assassin, the Ripper','CREATURE','DARK','LIVING_DEAD',4,1,2000,null ,'Slayer (When this creature loses a battle, destroy the other creature)'),
('Bone Spider','CREATURE','DARK','LIVING_DEAD',3,1,5000,null ,'When this creature wins a battle, destroy it'),
('Creeping Plague','SPELL','DARK',null ,1,1,0,null ,'Whenever any of your creatures becomes blocked this turn, it gets "slayer" until the end of the turn.(When a creature that has "slayer" loses a battle, destroy the other creature)'),
('Dark Clown','CREATURE','DARK','BRAIN_JACKER' ,4,1,6000,'BLOCKER' ,'1. This creature cant attack. 2. When this creature wins a battle, destroy it'),
('Dark Raven, Shadow of Grief','CREATURE','DARK','GHOST' ,4,1,1000,'BLOCKER' ,null),
('Dark Reversal','SPELL','DARK',null ,2,1,0,'SHIELD_TRIGGER' ,'Return a creature from your graveyard to your hand'),
('Death Smoke','SPELL','DARK',null ,4,1,0,null ,'Destroy 1 of your opponent.s untapped creatures'),
('Ghost Touch','SPELL','DARK',null ,2,1,0,'SHIELD_TRIGGER' ,'Your opponent discards a card at random from his hand'),
('Gigaberos','CREATURE','DARK','CHIMERA' ,5,1,8000,'DOUBLE_BREAKER' ,'When you put this creature into the battle zone, destroy 2 of your other creatures or destroy this creature'),
('Gigagiele','CREATURE','DARK','CHIMERA' ,5,1,3000,null ,'Slayer (When this creature loses a battle, destroy the other creature)'),
('Gigargon','CREATURE','DARK','CHIMERA' ,8,1,3000,null ,'When you put this creature into the batlle zone, return up to 2 creatures from your graveyard to your hand'),
('Masked Horror, Shadow of Scorn','CREATURE','DARK','GHOST' ,5,1,1000,null ,'When you put this creature into the batlle zone, your opponent discards a card at random from his hand'),
('Night Master, Shadow of Decay','CREATURE','DARK','GHOST' ,6,1,3000,'BLOCKER' ,null),
('Skeleton Soldier, the Defiled','CREATURE','DARK','LIVING_DEAD' ,4,1,3000,null ,null),
('Stinger Worm','CREATURE','DARK','PARASITE_WORM' ,3,1,5000,null ,'When you put this creature into the battle zone, destroy 1 of your creatures'),
('Swamp Worm','CREATURE','DARK','PARASITE_WORM' ,7,1,2000,null ,'When you put this creature into the battle zone, your opponent chooses 1 of his creatures and destroys it'),
('Terror Pit','SPELL','DARK',null ,6,1,0,'SHIELD_TRIGGER' ,'Destroy 1 of your opponent.s creatures'),
('Vampire Silphy','CREATURE','DARK','DARK_LORD' ,8,1,4000,null ,'When you put this creature into the battle zone, destroy all creatures that have power 3000 or less'),
('Wandering Braineater','CREATURE','DARK','LIVING_DEAD' ,2,1,2000,'BLOCKER' ,'This creature cant attack'),
('Writhing Bone Ghoul','CREATURE','DARK','LIVING_DEAD' ,2,1,2000,null ,null),
('Armored Walker Urherion','CREATURE','FIRE','ARMORLOID' ,4,1,3000,null ,'While you have at least 1 Human in the battle zone, this creature gets +2000 power during its attacks'),
('Artisan Picora','CREATURE','FIRE','MACHINE_EATER' ,1,1,2000,null ,'When you put this creature into the battle zone, put 1 card from your mana zone into your graveyard'),
('Bolshack Dragon','CREATURE','FIRE','ARMORED_DRAGON' ,6,1,6000,'DOUBLE_BREAKER' ,'While attacking, this creature gets +1000 power for each fire card in your graveyard'),
('Brawler Zyler','CREATURE','FIRE','HUMAN' ,2,1,1000,null ,'Power attacker +2000 (While attacking, this creature gets +2000 power)'),
('Burning Power','SPELL','FIRE',null ,1,1,0,null ,'One of your creature gets "power attacker +2000" until the end of the turn. (While attacking, a creature that has "power attacker +2000" gets + 2000 power'),
('Chaos Strike','SPELL','FIRE',null ,2,1,0,null ,'Choose one of your opponent.s untapped creatures in the battle zone. Your creatures can attack it this turn as though it were tapped'),
('Crimson Hammer','SPELL','FIRE',null ,2,1,0,null ,'Destroy 1 of your opponent.s creatures that has power 2000 or less'),
('Deadly Fighter Braid Claw','CREATURE','FIRE','DRAGONOID' ,1,1,1000,null ,'This creature attacks each turn if able'),
('Draglide','CREATURE','FIRE','ARMORED_WYVERN' ,5,1,5000,null ,'This creature attacks each turn if able'),
('Explosive Fighter Ucarn','CREATURE','FIRE','DRAGONOID' ,5,1,9000,'DOUBLE_BREAKER' ,'When you put this creature into the battle zone, put 2 cards from your mana zone into your graveyard'),
('Fatal Attacker Horvath','CREATURE','FIRE','HUMAN' ,3,1,2000,null ,'While you have at least 1 Armorloid in the battle zone, this creature gets +2000 power during its attacks'),
('Fire Sweeper Burning Hellion','CREATURE','FIRE','DRAGONOID' ,4,1,3000,null ,'Power attacker +2000 (While attacking, this creature gets +2000 power)'),
('Gatling Skyterror','CREATURE','FIRE','ARMORED_WYVERN' ,7,1,7000,'DOUBLE_BREAKER' ,'This creature can attack untapped creatures'),
('Immortal Baron, Vorg','CREATURE','FIRE','HUMAN' ,2,1,2000,null ,null ),
('Magma Gazer','SPELL','FIRE',null ,3,1,0,null ,'One of your creatures gets "power attacker +4000" and "DOUBLE_BREAKER" until the end of the turn' ),
('Meteosaur','CREATURE','FIRE','ROCK_BEAST' ,5,1,2000,null ,'When you put this creature into the battle zone, you may destroy 1 of your opponent.s creatures that has power 2000 or less' ),
('Nomad Hero Gigio','CREATURE','FIRE','MACHINE_EATER' ,5,1,3000,null ,'This creature can attack untapped creatures' ),
('Onslaughter Triceps','CREATURE','FIRE','DRAGONOID' ,3,1,5000,null ,'When you put this creature into the battle zone, put 1 card from your mana zone into your graveyard' ),
('Rothus, the Traveler','CREATURE','FIRE','ARMORLOID' ,4,1,4000,null ,'When you put this creature into the battle zone, destroy 1 of your creatures. Then your opponent chooses 1 of his creatures and destroys it' ),
('Stonesaur','CREATURE','FIRE','ROCK_BEAST' ,5,1,4000,null ,'Power attacker +2000 (While attacking, this creature gets +2000 power.' ),
('Super Explosive Volcanodon','CREATURE','FIRE','DRAGONOID' ,4,1,2000,null ,'Power attacker +4000 (While attacking, this creature gets +4000 power.' ),
('Tornado Flame','SPELL','FIRE',null ,5,1,0,'SHIELD_TRIGGER' ,'Destroy 1 of your opponent.s creatures that has power 4000 or less' ),
('Aura Blast','SPELL','NATURE',null ,4,1,0,null ,'Each of your creatures in the battle zone gets "power attacker +2000" until the end of the turn. (While attacking, a creature that has "power attacker +2000" gets +2000 power)' ),
('Bronze-Arm Tribe','CREATURE','NATURE','BEAST_FOLK' ,3,1,1000,null ,'When you put this creature into the battle zone, put the top card of your deck into your mana zone.' ),
('Burning Mane','CREATURE','NATURE','BEAST_FOLK' ,2,1,2000,null ,null),
('Coiling Vines','CREATURE','NATURE','TREE_FOLK' ,4,1,3000,null ,'When this creature would be destroyed, put it into your mana zone instead.'),
('Dimension Gate','SPELL','NATURE',null ,3,1,0,'SHIELD_TRIGGER' ,'Search your deck. You may take a creature from your deck, show that creature to your opponent, and put it into your hand. Then shuffle your deck.'),
('Dome SHell','CREATURE','NATURE','COLONY_BEETLE' ,4,1,3000,null ,'Power attacker +2000 (While attacking, this creature gets +2000 power.'),
('Fear Fang','CREATURE','NATURE','BEAST_FOLK' ,3,1,3000,null ,null ),
('Forest Hornet','CREATURE','NATURE','GIANT_INSECT' ,4,1,4000,null ,null ),
('Golden Wing Striker','CREATURE','NATURE','BEAST_FOLK' ,4,1,4000,null ,'Power attacker +2000 (While attacking, this creature gets +2000 power.' ),
('Mighty Shouter','CREATURE','NATURE','BEAST_FOLK' ,3,1,2000,null ,'When this creature would be destroyed, put it into your mana zone instead' ),
('Natural Snare','SPELL','NATURE',null ,6,1,0,'SHIELD_TRIGGER' ,'Choose one of your opponent.s creatures in the battle zone and put it into his mana zone' ),
('Pangaea.s Song','SPELL','NATURE',null ,1,1,0,null ,'Put 1 of your creatures from the battle zone into your mana zone.' ),
('Poisonous Dahlia','CREATURE','NATURE','TREE_FOLK' ,4,1,5000,null ,'This creature can.t attack players' ),
('Poisonous Mushroom','CREATURE','NATURE','BALLOON_MUSHROOM' ,2,1,1000,null ,'When you put this creature into the battle zone, you may put 1 card from your hand into your mana zone' ),
('Red-Eye Scorpion','CREATURE','NATURE','GIANT_INSECT' ,5,1,4000,null ,'When this creature would be destroyed, put it into your mana zone instead.' ),
('Stampeding Longhorn','CREATURE','NATURE','HORNED_BEAST' ,5,1,4000,null ,'This creature can.t be blocked by any creature that has power 3000 or less.' ),
('Steel Smasher','CREATURE','NATURE','BEAST_FOLK' ,2,1,3000,null ,'This creature can.t attack players.' ),
('Storm Shell','CREATURE','NATURE','COLONY_BEETLE' ,7,1,2000,null ,'When you put this creature into the battle zone, your opponent chooses 1 of his creatures in the battle zone and puts it into his mana zone.' ),
('Thorny Mandra','CREATURE','NATURE','TREE_FOLK' ,5,1,4000,null ,'When you put this creature into the battle zone, you may put 1 creature from your graveyard into your mana zone.' ),
('Tower Shell','CREATURE','NATURE','COLONY_BEETLE' ,6,1,5000,null ,'This creature can.t be blocked by any creature that has power 4000 or less' ),
('Tri-horn Shepherd','CREATURE','NATURE','HORNED_BEAST' ,5,1,5000,null ,null),
('Ultimate Force','SPELL','NATURE',null ,5,1,0,null ,'Put the top 2 cards of your deck into your mana zone.');






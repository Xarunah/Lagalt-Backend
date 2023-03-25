INSERT INTO users (user_name, user_email, user_description, user_portfolio, profile_visibility)
VALUES ('Frederikke Frederiksen','frederikkefrederiksen1998@gmail.com', 'Hej mit navn er Frederikke','github.com/FrederikkeFrederiksen',   false),
       ('Nadja Olsen', 'nadjasgmail@gmail.com', 'Hej jeg hedder Nadja og jeg elsker katte', 'github.com/Xarunah',  false),
       ('Admin', 'admin@email.com', 'I am admin', '...', false);

INSERT INTO user_skills (user_id, user_skill)
VALUES (1, 'Unity3D'),
       (1, 'C#'),
       (2, 'Tailwind'),
       (2, 'Sende kattememes'),
       (3, 'Being admin');

INSERT INTO project (title, owner_id, category, description, short_description, status, progress,  project_is_active)
VALUES ('Cat-Burrito Game', 1, 'Game', 'This the main game we are currently working on at Darling Games. The game will be delayed, since Frederik Darling will be busy with a new job as a software developer. The plan is still to eventually continue development of the game and release it. The plan right now is that a Demo will release in 2023 and that the final game will probably release in 2024. The game follows Cat-Burrito who loves to drink margaritas. The player gets to explore 3 differnt worlds with featuring varied missions that will give ingredients as rewards. These ingredients can then be brought to a bar to make drinks. These driknks act as the main collectables in the game that can be used to unlock new parts of the game. The player will also be able to upgrade their abillities throughout the game, adding new mechanics to the mix. To mix up the gameplay the player can also collect tokens that can be brought to the arcade to unlock classic arcade-style games that can be enjoyed when the player needs a break from the main game. The game is a 3D collectathon platformer that harkens back to platformers from the 90''s like Banjo-Kazooie and Super Mario 64. The player of those games will recognize some game elements like the main collectables that unlock new worlds and the many missions that is scattered throughout varied open worlds. This the main game we are currently working on at Darling Games. The game will be delayed, since Frederik Darling will be busy with a new job as a software developer. The plan is still to eventually continue development of the game and release it. The plan right now is that a Demo will release in 2023 and that the final game will probably release in 2024. The game follows Cat-Burrito who loves to drink margaritas. The player gets to explore 3 differnt worlds with featuring varied missions that will give ingredients as rewards. These ingredients can then be brought to a bar to make drinks. These driknks act as the main collectables in the game that can be used to unlock new parts of the game. The player will also be able to upgrade their abillities throughout the game, adding new mechanics to the mix. To mix up the gameplay the player can also collect tokens that can be brought to the arcade to unlock classic arcade-style games that can be enjoyed when the player needs a break from the main game. The game is a 3D collectathon platformer that harkens back to platformers from the 90''s like Banjo-Kazooie and Super Mario 64. The player of those games will recognize some game elements like the main collectables that unlock new worlds and the many missions that is scattered throughout varied open worlds. This the main game we are currently working on at Darling Games. The game will be delayed, since Frederik Darling will be busy with a new job as a software developer. The plan is still to eventually continue development of the game and release it. The plan right now is that a Demo will release in 2023 and that the final game will probably release in 2024. The game follows Cat-Burrito who loves to drink margaritas. The player gets to explore 3 differnt worlds with featuring varied missions that will give ingredients as rewards. These ingredients can then be brought to a bar to make drinks. These driknks act as the main collectables in the game that can be used to unlock new parts of the game. The player will also be able to upgrade their abillities throughout the game, adding new mechanics to the mix. To mix up the gameplay the player can also collect tokens that can be brought to the arcade to unlock classic arcade-style games that can be enjoyed when the player needs a break from the main game. The game is a 3D collectathon platformer that harkens back to platformers from the 90''s like Banjo-Kazooie and Super Mario 64. The player of those games will recognize some game elements like the main collectables that unlock new worlds and the many missions that is scattered throughout varied open worlds. This the main game we are currently working on at Darling Games. The game will be delayed, since Frederik Darling will be busy with a new job as a software developer. The plan is still to eventually continue development of the game and release it. The plan right now is that a Demo will release in 2023 and that the final game will probably release in 2024. The game follows Cat-Burrito who loves to drink margaritas. The player gets to explore 3 differnt worlds with featuring varied missions that will give ingredients as rewards. These ingredients can then be brought to a bar to make drinks. These driknks act as the main collectables in the game that can be used to unlock new parts of the game. The player will also be able to upgrade their abillities throughout the game, adding new mechanics to the mix. To mix up the gameplay the player can also collect tokens that can be brought to the arcade to unlock classic arcade-style games that can be enjoyed when the player needs a break from the main game. The game is a 3D collectathon platformer that harkens back to platformers from the 90''s like Banjo-Kazooie and Super Mario 64. The player of those games will recognize some game elements like the main collectables that unlock new worlds and the many missions that is scattered throughout varied open worlds.', 'A game about a cat who is also a burrito.', 'Started', 'Setting up Unity 3D project', true),
 ('Awesome song', 3, 'Music', 'An awesome song', '', '', '', true),
 ('Knowing The Way', 2, 'Film', 'An in depth documentary about Uganda Knuckles', 'Documentary about Uganda Knuckles', 'Funding', 'Still looking for a director',true),
 ('Website with Cat Memes', 2, 'Web', 'A website with lots of memes, with cats!', 'Nice website with cat memes.', 'Started', 'Setting up Angular',true),
 ('Lagalt App', 3, 'Web', 'A single page application where you can join projects created by other user','Website for nerds with crazy projects.', 'Done','Just deployed on Railway, because FUCK Azure!',true),
 ('Sonic Adventure 3 (Fan Game)',1, 'Game', 'A sequel to the popular Dreamcast game Sonic Adventure 2 created by the fans for the fans.','Fan-made sequel to Sonic Adventure 2.', 'Stalled','Development hell', true),
 ('Pokemon Trainer App',2, 'Web', 'A web application for pokemon fans to discover new pokemon and add them to their favorites', 'Add your favorite pokémon to your collection!','Done', 'Just deployed using vercel', true),
 ('Translation App', 1, 'Web', 'A single-page application created in React that can translate english words into sign language', 'Translate', '', '',true),
 ('RPG Heroes', 1,'Game', 'A Java application with four classes of heroes that can equip weapon and armor', '', '', '',true),
 ('Dobby: A Harry Potter Fan Film',3,'Film','The film centers around the Dobby the house elf from the Harry Potter series', '','', '',true),
 ('Spider-Man: No Way Home 2',2,'Film','Continues the story of the previous film. This time Harry Osbourne and Mary Jane shows up along with Tobey Magiures Spider-Man.', '','', '',true),
 ('Theme song for Experis Academy',3,'Music','A song to advertise for Experis Academy', '','', '',true);

INSERT INTO project_skills (project_id, skills)
VALUES (1, 'Unity3D'),
       (1, 'C#'),
       (1, 'Blender'),
       (2, 'Guitar'),
       (2, 'Vocals'),
       (3, 'Editing'),
       (3, 'Acting'),
       (4, 'Angular'),
       (4, 'Bootstrap'),
       (4, 'Spring Web'),
       (5, 'ReactJS'),
       (5, 'Tailwind'),
       (5, 'Hibernate'),
       (6, 'Unreal 5'),
       (6, 'C++'),
       (6, 'Sound Design'),
       (7, 'REST Api'),
       (7, 'Angular'),
       (8, 'ReactJS'),
       (8, 'Vercel'),
       (9, 'Java'),
       (9, 'JUnit'),
       (10, 'VFX'),
       (10, 'Costume Design'),
       (10, 'Acting'),
       (11, 'VFX'),
       (11, 'Audio Design'),
       (12, 'Vocals'),
       (12, 'Song writing'),
       (12, 'Guitar');

INSERT INTO project_tags (project_id, tags)
VALUES (1, 'Action'),
       (1, 'Adventure'),
       (1, 'Platformer'),
       (2, 'Pop/Rock'),
       (2, 'Comedy'),
       (3, 'Documentary'),
       (3, 'Comedy'),
       (3, 'Meme culture'),
       (4, 'Cute'),
       (4, 'Cats'),
       (4, 'Funny'),
       (5, 'Project management'),
       (5, 'Creativity'),
       (5, 'Social media'),
       (6, 'SEGA will sue us'),
       (6, 'Sonic The Hedgehog'),
       (6, 'Big The Cat'),
       (7, 'Nintendo will sue us'),
       (7, 'Pokedex'),
       (7, 'Pikachu'),
       (8, 'Translation'),
       (8, 'Accessibility'),
       (9, 'Java application'),
       (9, 'Unit testing'),
       (9, 'RPG'),
       (10, 'Wizarding World'),
       (10, 'Harry Potter'),
       (10, 'Fantasy'),
       (11, 'Disney will sue us'),
       (11, 'Sony will sue us'),
       (11, 'Marvel will sue us'),
       (12, 'Advertisement'),
       (12, 'Shilling'),
       (12, 'Simping');

INSERT INTO project_collaborators (project_project_id, collaborators_user_id)
VALUES (3, 1),
       (4, 1);

INSERT INTO project_application (project_id, user_id, reviewed, accepted, motivation)
VALUES (1,2,false,false,'Jeg elsker katte'),
       (4,1,false,false, 'Sejt jeg elsker også katte og memes');


INSERT INTO comment (project_project_id, user_id, message)
VALUES (1,3,'test1'),
       (1,2,'Awesome game!!!'),
       (1,1,'Hello World!');
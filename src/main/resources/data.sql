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

INSERT INTO project (title, owner_id, category, description, short_description, status, progress,  project_is_active, image_path)
VALUES ('Cat-Burrito Game', 1, 'Game', 'This the main game we are currently working on at Darling Games. The game will be delayed, since Frederik Darling will be busy with a new job as a software developer. The plan is still to eventually continue development of the game and release it. The plan right now is that a Demo will release in 2023 and that the final game will probably release in 2024. The game follows Cat-Burrito who loves to drink margaritas. The player gets to explore 3 differnt worlds with featuring varied missions that will give ingredients as rewards. These ingredients can then be brought to a bar to make drinks. These driknks act as the main collectables in the game that can be used to unlock new parts of the game. The player will also be able to upgrade their abillities throughout the game, adding new mechanics to the mix. To mix up the gameplay the player can also collect tokens that can be brought to the arcade to unlock classic arcade-style games that can be enjoyed when the player needs a break from the main game. The game is a 3D collectathon platformer that harkens back to platformers from the 90''s like Banjo-Kazooie and Super Mario 64. The player of those games will recognize some game elements like the main collectables that unlock new worlds and the many missions that is scattered throughout varied open worlds. This the main game we are currently working on at Darling Games. The game will be delayed, since Frederik Darling will be busy with a new job as a software developer. The plan is still to eventually continue development of the game and release it. The plan right now is that a Demo will release in 2023 and that the final game will probably release in 2024. The game follows Cat-Burrito who loves to drink margaritas. The player gets to explore 3 differnt worlds with featuring varied missions that will give ingredients as rewards. These ingredients can then be brought to a bar to make drinks. These driknks act as the main collectables in the game that can be used to unlock new parts of the game. The player will also be able to upgrade their abillities throughout the game, adding new mechanics to the mix. To mix up the gameplay the player can also collect tokens that can be brought to the arcade to unlock classic arcade-style games that can be enjoyed when the player needs a break from the main game. The game is a 3D collectathon platformer that harkens back to platformers from the 90''s like Banjo-Kazooie and Super Mario 64. The player of those games will recognize some game elements like the main collectables that unlock new worlds and the many missions that is scattered throughout varied open worlds. This the main game we are currently working on at Darling Games. The game will be delayed, since Frederik Darling will be busy with a new job as a software developer. The plan is still to eventually continue development of the game and release it. The plan right now is that a Demo will release in 2023 and that the final game will probably release in 2024. The game follows Cat-Burrito who loves to drink margaritas. The player gets to explore 3 differnt worlds with featuring varied missions that will give ingredients as rewards. These ingredients can then be brought to a bar to make drinks. These driknks act as the main collectables in the game that can be used to unlock new parts of the game. The player will also be able to upgrade their abillities throughout the game, adding new mechanics to the mix. To mix up the gameplay the player can also collect tokens that can be brought to the arcade to unlock classic arcade-style games that can be enjoyed when the player needs a break from the main game. The game is a 3D collectathon platformer that harkens back to platformers from the 90''s like Banjo-Kazooie and Super Mario 64. The player of those games will recognize some game elements like the main collectables that unlock new worlds and the many missions that is scattered throughout varied open worlds. This the main game we are currently working on at Darling Games. The game will be delayed, since Frederik Darling will be busy with a new job as a software developer. The plan is still to eventually continue development of the game and release it. The plan right now is that a Demo will release in 2023 and that the final game will probably release in 2024. The game follows Cat-Burrito who loves to drink margaritas. The player gets to explore 3 differnt worlds with featuring varied missions that will give ingredients as rewards. These ingredients can then be brought to a bar to make drinks. These driknks act as the main collectables in the game that can be used to unlock new parts of the game. The player will also be able to upgrade their abillities throughout the game, adding new mechanics to the mix. To mix up the gameplay the player can also collect tokens that can be brought to the arcade to unlock classic arcade-style games that can be enjoyed when the player needs a break from the main game. The game is a 3D collectathon platformer that harkens back to platformers from the 90''s like Banjo-Kazooie and Super Mario 64. The player of those games will recognize some game elements like the main collectables that unlock new worlds and the many missions that is scattered throughout varied open worlds.', 'A game about a cat who is also a burrito.', 'Started', 'Setting up Unity 3D project', true, 'https://i.ibb.co/MkZS26p/burrito.png'),
 ('Knowing The Way', 2, 'Film', 'An in depth documentary about Uganda Knuckles', 'Documentary about Uganda Knuckles', 'Funding', 'Still looking for a director',true, 'https://i.ibb.co/FWX2DdF/ugandan.png'),
 ('Website with Cat Memes', 2, 'Web', 'A website with lots of memes, with cats!', 'Nice website with cat memes.', 'Started', 'Setting up Angular',true, 'https://i.ibb.co/9pHGWVM/catMemes.png'),
 ('Lagalt App', 3, 'Web', 'A single page application where you can join projects created by other user','Website for nerds with crazy projects.', 'Done','Just deployed on Railway, because FUCK Azure!',true, 'https://i.ibb.co/DM7HWsg/lagalt.png'),
 ('Sonic Adventure 3 (Fan Game)',1, 'Game', 'A sequel to the popular Dreamcast game Sonic Adventure 2 created by the fans for the fans.','Fan-made sequel to Sonic Adventure 2.', 'Stalled','Development hell', true, 'https://i.ibb.co/RBC6jXf/sa3.jpg'),
 ('Pokemon Trainer App',2, 'Web', 'A web application for pokemon fans to discover new pokemon and add them to their favorites', 'Add your favorite pokemon to your collection!','Done', 'Just deployed using vercel', true, 'https://i.ibb.co/8BFNn6d/poke.png'),
 ('Translation App', 1, 'Web', 'A single-page application created in React that can translate english words into sign language', 'Translate english words into sign language', 'Done', 'Deployed to vercel',true, 'https://i.ibb.co/9ZcyF49/translation.png'),
 ('RPG Heroes', 1,'Game', 'A Java application with four classes of heroes that can equip weapon and armor', 'A Java application about heroes.', 'Done', 'GitHub Actions finally works!',true, 'https://i.ibb.co/mS2WPMx/rpg.png'),
 ('Dobby: A Harry Potter Fan Film',3,'Film','The film centers around the Dobby the house elf from the Harry Potter series', 'A Harry Potter Fan-Film about Dobby the house Elf','Funding', 'Looking fro main actor',true, 'https://i.ibb.co/hgcfFMh/dobby.jpg'),
 ('Theme song for Experis Academy',3,'Music','A song to advertise for Experis Academy', 'Advertisement for Experis Academy','Writing', 'Currently being written.',true, 'https://i.ibb.co/k4WtV9V/experis.png');

INSERT INTO project_skills (project_id, skills)
VALUES (1, 'Unity3D'),
       (1, 'C#'),
       (1, 'Blender'),
       (2, 'Editing'),
       (2, 'Acting'),
       (3, 'Angular'),
       (3, 'Bootstrap'),
       (3, 'Spring Web'),
       (4, 'ReactJS'),
       (4, 'Tailwind'),
       (4, 'Hibernate'),
       (5, 'Unreal 5'),
       (5, 'C++'),
       (5, 'Sound Design'),
       (6, 'REST Api'),
       (6, 'Angular'),
       (7, 'ReactJS'),
       (7, 'Vercel'),
       (8, 'Java'),
       (8, 'JUnit'),
       (9, 'VFX'),
       (9, 'Costume Design'),
       (9, 'Acting'),
       (10, 'Vocals'),
       (10, 'Song writing'),
       (10, 'Guitar');

INSERT INTO project_tags (project_id, tags)
VALUES (1, 'Action'),
       (1, 'Adventure'),
       (1, 'Platformer'),
       (2, 'Documentary'),
       (2, 'Comedy'),
       (2, 'Meme culture'),
       (3, 'Cute'),
       (3, 'Cats'),
       (3, 'Funny'),
       (4, 'Project management'),
       (4, 'Creativity'),
       (4, 'Social media'),
       (5, 'SEGA will sue us'),
       (5, 'Sonic The Hedgehog'),
       (5, 'Big The Cat'),
       (6, 'Nintendo will sue us'),
       (6, 'Pokedex'),
       (6, 'Pikachu'),
       (7, 'Translation'),
       (7, 'Accessibility'),
       (8, 'Java application'),
       (8, 'Unit testing'),
       (8, 'RPG'),
       (9, 'Wizarding World'),
       (9, 'Harry Potter'),
       (9, 'Fantasy'),
       (10, 'Advertisement'),
       (10, 'Shilling'),
       (10, 'Simping');

INSERT INTO project_collaborators (project_project_id, collaborators_user_id)
VALUES (3, 1),
       (4, 1);

INSERT INTO project_application (project_id, user_id, reviewed, accepted, motivation)
VALUES (1,2,false,false,'Jeg elsker katte'),
       (4,1,false,false, 'Sejt jeg elsker også katte og memes');


INSERT INTO comment (project_id, user_id, message, timestamp)
VALUES (1,3,'test1', '25-3-2023 at 13:04:15'),
       (1,2,'Awesome game!!!','22-3-2023 at 21:32:03'),
       (1,1,'Hello World!', '27-3-2023 at 18:04:40');
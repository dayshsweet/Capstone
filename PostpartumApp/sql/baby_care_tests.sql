-- Drop and recreate database
DROP DATABASE IF EXISTS postpartum_tests;
CREATE DATABASE postpartum_tests;

use postpartum_tests;

-- Users (parents or caregivers)
CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

-- Babies
CREATE TABLE Babies (
    baby_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    name VARCHAR(50) NOT NULL,
    birth_date DATE,
    gender VARCHAR(10),
    CONSTRAINT fk_babies_user FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
        ON DELETE CASCADE
);

-- Baby care logs (feeding, diaper, sleep, etc.)
CREATE TABLE BabyCareLogs (
    log_id INT PRIMARY KEY AUTO_INCREMENT,
    baby_id INT NOT NULL,
    user_id INT NOT NULL,
    type ENUM('feeding','pump','diaper_change','sleep','other') NOT NULL,
    details VARCHAR(250),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_carelogs_baby FOREIGN KEY (baby_id)
        REFERENCES Babies(baby_id)
        ON DELETE CASCADE,
    CONSTRAINT fk_carelogs_user FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
        ON DELETE CASCADE
);

-- Appointments / calendar events
CREATE TABLE Appointments (
    appointment_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    baby_id INT,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(250),
    start_time TIMESTAMP NOT NULL,
    end_time TIMESTAMP,
    CONSTRAINT fk_appointments_user FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
        ON DELETE CASCADE,
    CONSTRAINT fk_appointments_baby FOREIGN KEY (baby_id)
        REFERENCES Babies(baby_id)
        ON DELETE CASCADE
);

-- Forum posts
CREATE TABLE Posts (
    post_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT NOT NULL,
    title VARCHAR(150) NOT NULL,
    content VARCHAR(250),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_posts_user FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
        ON DELETE CASCADE
);

-- Forum comments
CREATE TABLE Comments (
    comment_id INT PRIMARY KEY AUTO_INCREMENT,
    post_id INT NOT NULL,
    user_id INT NOT NULL,
    content VARCHAR(250),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT fk_comments_post FOREIGN KEY (post_id)
        REFERENCES Posts(post_id)
        ON DELETE CASCADE,
    CONSTRAINT fk_comments_user FOREIGN KEY (user_id)
        REFERENCES Users(user_id)
        ON DELETE CASCADE
);

delimiter //

create procedure set_known_good_state()
begin
	delete from Users;
	alter table Users auto_increment = 1;
	delete from Babies;
	alter table Babies auto_increment = 1;
	delete from BabyCareLogs;
	alter table BabyCareLogs auto_increment = 1;
	delete from Appointments;
	alter table Appointments auto_increment = 1;
	delete from Posts;
	alter table Posts auto_increment = 1;
	delete from Comments;
	alter table Comments auto_increment = 1;

INSERT INTO Users (first_name, last_name, email, password)
		VALUES ('Jessica', 'Fleming', 'user1@example.com', ')qF&xXKvD1');
INSERT INTO Users (first_name, last_name, email, password) 
		VALUES ('Michelle', 'Knight', 'user2@example.com', '*ZKqQewCf8');   

INSERT INTO Babies (user_id, name, birth_date, gender) VALUES (2, 'Emily', '2025-05-02', 'male');
INSERT INTO Babies (user_id, name, birth_date, gender) VALUES (1, 'Theresa', '2024-04-26', 'female');

INSERT INTO BabyCareLogs (baby_id, user_id, type, details, timestamp) VALUES (1, 2, 'sleep', 'Management one not much school guess none.', '2025-09-27 22:46:49');
INSERT INTO BabyCareLogs (baby_id, user_id, type, details, timestamp) VALUES (2, 1, 'other', 'Significant act up same professor car learn growth.', '2025-09-27 22:46:44');
INSERT INTO BabyCareLogs (baby_id, user_id, type, details, timestamp) VALUES (1, 2, 'pump', 'Shoulder different put.', '2025-09-27 22:46:41');
		
INSERT INTO Appointments (user_id, baby_id, title, description, start_time) VALUES (2, 1, 'Rich thought figure.', 'Into contain perform material.', '2025-09-27 22:57:27');
INSERT INTO Appointments (user_id, baby_id, title, description, start_time) VALUES (2, 1, 'Why market win.', 'Outside rock step matter region.', '2025-09-27 22:56:53');
INSERT INTO Appointments (user_id, baby_id, title, description, start_time) VALUES (1, 2, 'Month raise.', 'Baby card visit financial small time himself.', '2025-09-27 22:55:55');

INSERT INTO Posts (user_id, title, content) VALUES (1, 'Live listen walk report.', 'Down only too issue eat option at. Deep after stock near scene especially.');
INSERT INTO Posts (user_id, title, content) VALUES (2, 'Institution office thus.', 'Region set in sign wrong arrive individual pattern. During option task several expect nice.');
INSERT INTO Posts (user_id, title, content) VALUES (1, 'Prevent with visit something.', 'Around author growth because thus. Behavior spring daughter opportunity financial nor.');
INSERT INTO Posts (user_id, title, content) VALUES (2, 'Wear because occur.', 'Picture method research gas. Parent film necessary near condition factor. Significant raise west hear.');

INSERT INTO Comments (post_id, user_id, content) VALUES (3, 2, 'Million sell choice challenge wife should especially.');
INSERT INTO Comments (post_id, user_id, content) VALUES (2, 2, 'Production likely throw fish.');
INSERT INTO Comments (post_id, user_id, content) VALUES (1, 2, 'Trip force compare discussion tax sit difficult.');

end //

delimiter ;

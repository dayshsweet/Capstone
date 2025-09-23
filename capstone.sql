-- Users (parents or caregivers)
CREATE TABLE Users (
    user_id SERIAL PRIMARY KEY,
    first_name VARCHAR(50),
    last_name VARCHAR(50),
    email VARCHAR(100) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL,
);

-- Babies
CREATE TABLE Babies (
    baby_id SERIAL PRIMARY KEY,
    user_id INT REFERENCES Users(user_id), -- primary parent
    name VARCHAR(50),
    birth_date DATE,
    gender VARCHAR(10)
);

-- Baby care logs (feeding, diaper, sleep, etc.)
CREATE TABLE BabyCareLogs (
    log_id SERIAL PRIMARY KEY,
    baby_id INT REFERENCES Babies(baby_id),
    user_id INT REFERENCES Users(user_id), -- who logged it
    type VARCHAR(20) CHECK (type IN ('feeding','diaper','sleep','pump','other')),
    details VARCHAR(250),
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Appointments / calendar events
CREATE TABLE Appointments (
    appointment_id SERIAL PRIMARY KEY,
    user_id INT REFERENCES Users(user_id),
    baby_id INT REFERENCES Babies(baby_id),
    title VARCHAR(100),
    description VARCHAR(250),
    start_time TIMESTAMP,
    end_time TIMESTAMP
);

-- Journal entries
CREATE TABLE JournalEntries (
    entry_id SERIAL PRIMARY KEY,
    user_id INT REFERENCES Users(user_id),
    title VARCHAR(100),
    content VARCHAR(250),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    visibility VARCHAR(10) CHECK (visibility IN ('private','shared'))
);

-- Forum posts
CREATE TABLE Posts (
    post_id SERIAL PRIMARY KEY,
    user_id INT REFERENCES Users(user_id),
    title VARCHAR(150),
    content VARCHAR(250),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Forum comments
CREATE TABLE Comments (
    comment_id SERIAL PRIMARY KEY,
    post_id INT REFERENCES Posts(post_id),
    user_id INT REFERENCES Users(user_id),
    content VARCHAR(250),
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

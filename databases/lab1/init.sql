CREATE TABLE IF NOT EXISTS compscience_type
(
    id          serial PRIMARY KEY,
    name        varchar(255),
    description text,
    level       int
);
CREATE TABLE IF NOT EXISTS users
(
    id             serial PRIMARY KEY,
    name           varchar(255),
    surname        varchar(255),
    gender         gendertype,
    birthdate      date,
    compscience_id int REFERENCES compscience_type (id)
);

CREATE TABLE IF NOT EXISTS programm
(
    id          serial PRIMARY KEY,
    name        varchar(255),
    description text
);

CREATE TABLE IF NOT EXISTS test_type
(
    id          serial PRIMARY KEY,
    name        varchar(255),
    description text
);

CREATE TABLE IF NOT EXISTS test
(
    id          serial PRIMARY KEY,
    name        varchar(255),
    description text,
    type_id     int REFERENCES test_type (id)
);

CREATE TABLE IF NOT EXISTS test_result
(
    id      serial PRIMARY KEY,
    test_id int REFERENCES test (id),
    date    timestamp,
    result  varchar(55),
    details text
);

CREATE TABLE IF NOT EXISTS computer
(
    id                   serial PRIMARY KEY,
    name                 varchar(255),
    location             varchar(255),
    communication_status boolean
);

CREATE TABLE IF NOT EXISTS consultation
(
    id         serial PRIMARY KEY,
    start_time timestamp,
    end_time   timestamp,
    success    boolean
);

CREATE TABLE IF NOT EXISTS computer_consultation
(
    PRIMARY KEY (computer_id, consultation_id),
    computer_id     int REFERENCES computer (id),
    consultation_id int REFERENCES consultation (id)
);

CREATE TABLE IF NOT EXISTS computer_programm
(
    PRIMARY KEY (computer_id, program_id),
    computer_id int REFERENCES computer (id),
    program_id  int REFERENCES programm (id)
);

CREATE TABLE IF NOT EXISTS user_programm
(
    PRIMARY KEY (user_id, programm_id),
    user_id     int REFERENCES users (id),
    programm_id int REFERENCES programm (id)
);

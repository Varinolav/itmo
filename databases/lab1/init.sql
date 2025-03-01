CREATE TABLE IF NOT EXISTS compscience_type
(
    id          serial PRIMARY KEY,
    name        varchar(255)            NOT NULL UNIQUE,
    description text,
    level       int CHECK (level <= 10) NOT NULL
);
CREATE TABLE IF NOT EXISTS users
(
    id             serial PRIMARY KEY,
    name           varchar(255)                         NOT NULL,
    surname        varchar(255)                         NOT NULL,
    gender         gendertype                           NOT NULL,
    birthdate      date,
    compscience_id int REFERENCES compscience_type (id) NOT NULL
);

CREATE TABLE IF NOT EXISTS programm
(
    id          serial PRIMARY KEY,
    name        varchar(255) NOT NULL UNIQUE,
    description text
);

CREATE TABLE IF NOT EXISTS test_type
(
    id          serial PRIMARY KEY,
    name        varchar(255) NOT NULL UNIQUE,
    description text
);

CREATE TABLE IF NOT EXISTS test
(
    id          serial PRIMARY KEY,
    name        varchar(255)                  NOT NULL UNIQUE,
    description text                          NOT NULL,
    type_id     int REFERENCES test_type (id) NOT NULL
);

CREATE TABLE IF NOT EXISTS test_result
(
    id      serial PRIMARY KEY,
    test_id int REFERENCES test (id) NOT NULL,
    date    timestamp,
    result  varchar(55)              NOT NULL,
    details text                     NOT NULL
);

CREATE TABLE IF NOT EXISTS computer
(
    id                   serial PRIMARY KEY,
    name                 varchar(255) NOT NULL UNIQUE,
    location             varchar(255) NOT NULL,
    communication_status boolean      NOT NULL
);

CREATE TABLE IF NOT EXISTS consultation
(
    id         serial PRIMARY KEY,
    start_time timestamp NOT NULL,
    end_time   timestamp CHECK ( end_time > start_time ),
    success    boolean
);

CREATE TABLE IF NOT EXISTS computer_consultation
(
    PRIMARY KEY (computer_id, consultation_id),
    computer_id     int REFERENCES computer (id)     NOT NULL,
    consultation_id int REFERENCES consultation (id) NOT NULL
);

CREATE TABLE IF NOT EXISTS computer_programm
(
    PRIMARY KEY (computer_id, program_id),
    computer_id int REFERENCES computer (id) NOT NULL,
    program_id  int REFERENCES programm (id) NOT NULL
);

CREATE TABLE IF NOT EXISTS user_programm
(
    PRIMARY KEY (user_id, programm_id),
    user_id     int REFERENCES users (id)    NOT NULL,
    programm_id int REFERENCES programm (id) NOT NULL
);
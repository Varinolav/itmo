INSERT INTO programm(name, description)
VALUES ('Электронный психоанализ', 'идет со скоростью, недоступной человеческому восприятию');

INSERT INTO computer (name, location, communication_status)
VALUES ('ЭАЛ', 'Космос', true),
       ('САЛ-9000', 'Земля', false);

INSERT INTO test_type (name, description)
VALUES ('диагностический', 'диагностирует'),
       ('восстановительный', 'восстанавливает');


INSERT INTO test (name, description, type_id)
VALUES ('тест1', 'проносится сквозь электронные клетки', 1),
       ('тест2', 'проносится сквозь электронные клетки', 2);

INSERT INTO consultation (start_time, end_time, success)
VALUES ('2025-02-13 00:00:00', '2025-02-13 01:00:00', true),
       ('2025-02-13 02:00:00', '2025-02-13 03:00:00', false);

INSERT INTO computer_consultation (computer_id, consultation_id)
VALUES (1, 1),
       (2, 1);

INSERT INTO test_result (test_id, date, result, details)
VALUES (1, now(), 'обнаружил источники нарушений', 'возможные'),
       (2, now(), 'устранил источники нарушений', 'возможные');

INSERT INTO compscience_type (name, description, level)
VALUES ('Нуб', 'Плохо владеет компьютером', 2),
       ('Норм', 'Нормально владеет компьютером', 5),
       ('Профи', 'Почти идеально владеет компьютером', 9);

INSERT INTO users (name, surname, gender, birthdate, compscience_id)
VALUES ('Серега', 'Сергеев', 'male', '1999-01-23', 3);

INSERT INTO user_programm (user_id, programm_id)
VALUES (1, 1);

INSERT INTO computer_programm (computer_id, program_id)
VALUES (1, 1)

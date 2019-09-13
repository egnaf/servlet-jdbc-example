CREATE DATABASE university;

CREATE TABLE students (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(20) NOT NULL,
    d_id INT
);

INSERT INTO students VALUES (null, 'Александр', 1);
INSERT INTO students VALUES (null, 'Михаил', 2);
INSERT INTO students VALUES (null, 'Владислав', 12);
INSERT INTO students VALUES (null, 'Ярослав', 21);
INSERT INTO students VALUES (null, 'Данил', 23);

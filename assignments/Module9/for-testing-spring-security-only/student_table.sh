DROP TABLE IF EXISTS student;
CREATE TABLE student (ID int, CREDITS INTEGER(10), FIRST_NAME varchar(255), LAST_NAME VARCHAR(255));
INSERT INTO student (ID, CREDITS, FIRST_NAME, LAST_NAME) VALUES(1, 8, 'John1', 'Doe1'),
(2, 7, 'John2', 'Doe2'),
(3, 6, 'John3', 'Doe3'),
(4, 5, 'John4', 'Doe4'),
(5, 4, 'John5', 'Doe5'),
(6, 3, 'John6', 'Doe6');
SELECT * FROM student;

Above lines are for H2 1.4.197

Next lines are for H2 2.2.224

DROP TABLE IF EXISTS student;
CREATE TABLE student (ID int, CREDITS INT, FIRST_NAME varchar(255), LAST_NAME VARCHAR(255));
INSERT INTO student (ID, CREDITS, FIRST_NAME, LAST_NAME) VALUES(1, 8, 'John1', 'Doe1'),
(2, 7, 'John2', 'Doe2'),
(3, 6, 'John3', 'Doe3'),
(4, 5, 'John4', 'Doe4'),
(5, 4, 'John5', 'Doe5'),
(6, 3, 'John6', 'Doe6');
SELECT * FROM student;

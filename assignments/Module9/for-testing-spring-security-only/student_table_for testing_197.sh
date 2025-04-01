DROP TABLE IF EXISTS student;

CREATE TABLE student (ID int, password varchar(255), token varchar(255), user_name VARCHAR(255));

INSERT INTO student VALUES 
   (1, 'pass1', '', 'user1'),
   (2, 'pass2', '', 'user2');

SELECT * FROM student;

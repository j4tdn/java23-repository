CREATE DATABASE exam;
use exam;

CREATE TABLE Class (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(10),
    teacher VARCHAR(50)
);

CREATE TABLE Student (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50),
    gender VARCHAR(10),
    class_id INT,
    FOREIGN KEY (class_id) REFERENCES Class(id)
);

CREATE TABLE Result (
    student_id INT,
    subject VARCHAR(20),
    score INT,
    PRIMARY KEY (student_id, subject),
    FOREIGN KEY (student_id) REFERENCES Student(id)
);

INSERT INTO Class (name, teacher) VALUES 
('12A', 'Ho Cong Trung'),
('12B', 'Dang Tu Anh'),
('12C', 'Nguyen Van Tam');

INSERT INTO Student (name, gender, class_id) VALUES 
('Dinh Thi Ngoc', 'Female', 2),
('Nguyen Thanh Hung', 'Male', 1),
('Tran Mai Hoa', 'Female', 2),
('Doan Quang Vinh', 'Male', 1),
('Cao Anh Dao', 'Female', 3),
('Tran Kim Tuyet', 'Male', 3);

INSERT INTO Result (student_id, subject, score) VALUES 
(1, 'Math', 8.0),
(2, 'Literature', 7.0),
(3, 'History', 9.5),
(4, 'Math', 6.8),
(5, 'Literature', 4.9),
(6, 'History', 8.2),
(7, 'Math', 9.8),
(8, 'Literature', 7.2),
(9, 'History', 8.8);

SELECT * FROM Class;
SELECT * FROM Student;
SELECT * FROM Result;



-- 1.Primary key of Result table is: student_id và subject .


-- 2.
	SELECT t01.name, t01.gender, t03.teacher
	FROM Student t01
	JOIN Class t03 ON t01.class_id = t03.id;
    
-- 3.
	SELECT t03.teacher, COUNT(t01.id) AS student_count
	FROM Class t03
	JOIN Student t01 ON t01.class_id = t03.id
	WHERE t03.name = '12C'
	GROUP BY t03.teacher;
    
-- 4.
	SELECT t03.name AS class_name, COUNT(DISTINCT t01.id) AS student_count
	FROM Class t03
	JOIN Student t01 ON t01.class_id = t03.id
	JOIN Result r1 ON r1.student_id = t01.id AND r1.subject = 'Math' AND r1.score >= 8
	JOIN Result r2 ON r2.student_id = t01.id AND r2.subject = 'Literature' AND r2.score >= 8
	GROUP BY t03.name;


Create DATABASE SchoolDB;
use SchoolDB;

-- Bảng lớp
CREATE TABLE Class (
  id      INT PRIMARY KEY,
  name    VARCHAR(20)  NOT NULL UNIQUE,
  teacher VARCHAR(100) NOT NULL
);

-- Bảng học sinh
CREATE TABLE Student (
  id       INT PRIMARY KEY,
  name     VARCHAR(100) NOT NULL,
  gender   VARCHAR (20) CHECK( gender IN ('Male','Female') )  NOT NULL,
  class_id INT NOT NULL,
  CONSTRAINT fk_student_class FOREIGN KEY (class_id) REFERENCES Class(id) 
	ON UPDATE CASCADE ON DELETE RESTRICT
);

-- Bảng kết quả học tập
CREATE TABLE Result (
  student_id INT NOT NULL,
  subject    VARCHAR(50) NOT NULL,
  score      DECIMAL(2,1) NOT NULL,
  CONSTRAINT pk_result PRIMARY KEY (student_id, subject),
  CONSTRAINT fk_result_student FOREIGN KEY (student_id) REFERENCES Student(id)
	ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT ck_result_score CHECK (score BETWEEN 0 AND 10)
);

-- Chèn dữ liệu
-- Class
INSERT INTO Class (id, name, teacher) VALUES
  (1, '12A', 'Ho Cong Trung'),
  (2, '12B', 'Dang Tu Anh'),
  (3, '12C', 'Nguyen Van Tam');

-- Student
INSERT INTO Student (id, name, gender, class_id) VALUES
  (1, 'Dinh Thi Ngoc',     'Female', 2),
  (2, 'Nguyen Thanh Hung', 'Male',   1),
  (3, 'Tran Mai Hoa',      'Female', 2),
  (4, 'Doan Quang Vinh',   'Male',   1),
  (5, 'Cao Anh Dao',       'Female', 3),
  (6, 'Tran Kim Tuyen',    'Male',   3);
  
-- Result
INSERT INTO Result (student_id, subject, score) VALUES
  (1, 'Math',       8.0),
  (2, 'Literature', 7.0),
  (3, 'History',    9.5),
  (4, 'Math',       6.8),
  (5, 'Literature', 4.9),
  (6, 'History',    8.2);
  
	-- Trả lời câu hỏi:
/*
Câu 1: Primary key của bảng Result là student_id và subject 
- Vì một học sinh có nhiều môn, và một môn chỉ có một điểm duy nhất cho một học sinh.
*/

-- Câu 2: Liệt kê name, gender và teacher name của tất cả học sinh
SELECT s.name AS student_name, 
       s.gender, 
       c.teacher AS teacher_name
FROM Student s
JOIN Class c ON s.class_id = c.id;

-- Câu 3: Liệt kê teacher name và số lượng tất cả học sinh trong lớp 12C
SELECT c.teacher AS teacher_name, 
       COUNT(s.id) AS total_students
FROM Class c
JOIN Student s ON c.id = s.class_id
WHERE c.name = '12C'
GROUP BY c.teacher;

-- Câu 4: Liệt kê class name và số lượng học sinh có Math >= 8 và Literature >= 8
SELECT c.name AS class_name,
       COUNT(DISTINCT s.id) AS total_students
FROM Class c
JOIN Student s ON s.class_id = c.id
JOIN Result rm ON rm.student_id = s.id 
	AND rm.subject = 'Math'
	AND rm.score   >= 8
JOIN Result rl ON rl.student_id = s.id
	AND rl.subject = 'Literature'
	AND rl.score   >= 8
GROUP BY c.name
ORDER BY c.name;

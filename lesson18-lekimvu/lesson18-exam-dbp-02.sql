INSERT INTO T01_Student(T01_Student_Id, T01_name,T01_gender,T01_class_id ) VALUES
(1,'Nguyen Van An', 'Male', 1),
(2,'Tran Thi Bich', 'Female', 1),
(3,'Le Van Cuong', 'Male', 2),
(4,'Pham Thi Dao', 'Female', 2),
(5,'Hoang Minh Duc', 'Male', 3),
(6,'Vo Thi Hoa', 'Female', 3);

select * from T01_Student;


INSERT INTO T03_Class (T03_Class_ID,T03_name,T03_teacher)
VALUES
(1,'12A', 'Nguyen Thi Lan'),
(2,'12B', 'Tran Van Minh'),
(3,'12C', 'Le Thi Hoa');


INSERT INTO T02_Result (T02_Student_Id, T02_subject, T02_score)
VALUES
(1, 'Math', 8),
(2, 'Literature', 7),
(3, 'History', 9),
(4, 'Math', 6),
(5, 'Literature', 8),
(6, 'History', 7);

select * from t02_result;
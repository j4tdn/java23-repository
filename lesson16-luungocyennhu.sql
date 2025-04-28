-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
CREATE DATABASE company_management CHAR SET utf8mb4;

DROP TABLE IF EXISTS T01_DEPARTMENT;
CREATE TABLE T01_DEPARTMENT (
	C01_DPM_ID INT PRIMARY KEY AUTO_INCREMENT,
    C01_DPM_NAME VARCHAR(255) NOT NULL UNIQUE,
    C01_INTAKE_DATE DATE NOT NULL,
    C01_MANAGER_ID INT NOT NULL UNIQUE
);

DROP TABLE IF EXISTS T02_EMPLOYEE;
CREATE TABLE T02_EMPLOYEE (
	C02_EMP_ID INT PRIMARY KEY AUTO_INCREMENT,
    C02_EMP_NAME VARCHAR(255) NOT NULL,
    C02_ADDRESS VARCHAR(255),
    C02_SALARY DOUBLE NOT NULL,
    C02_GENDER BIT NOT NULL,
    C02_DATE_OF_BIRTH DATE NOT NULL,
    C02_STARTED_DATE_AT DATE NOT NULL,
    C02_DPM_ID INT NOT NULL,
    C02_MANAGER_ID INT NOT NULL
);

ALTER TABLE t02_employee
ADD CONSTRAINT FK_T02_T02_MANAGER_ID FOREIGN KEY(C02_MANAGER_ID)
						  REFERENCES t02_employee(C02_EMP_ID);
                          
ALTER TABLE t01_department
ADD CONSTRAINT FK_T01_T02_MANAGER_ID FOREIGN KEY(C01_MANAGER_ID) 
						  REFERENCES t02_employee(C02_MANAGER_ID);

ALTER TABLE t02_employee
ADD CONSTRAINT FK_T02_T01_DPM_ID FOREIGN KEY(C02_DPM_ID) 
						  REFERENCES t01_department(C01_DPM_ID);
                          
DROP TABLE IF EXISTS T03_PROJECT;
CREATE TABLE T03_PROJECT (
	C03_PRJ_ID INT PRIMARY KEY AUTO_INCREMENT,
    C03_PRJ_NAME VARCHAR(255) NOT NULL UNIQUE,
    C03_START_DATE DATE NOT NULL,
    C03_END_DATE DATE NOT NULL,
    C03_REVENUE DOUBLE NOT NULL,
    C03_EMP_ID INT NOT NULL,
    CONSTRAINT FK_T03_T02_EMP_ID FOREIGN KEY (C03_EMP_ID) REFERENCES t02_employee(C02_EMP_ID)
);

DROP TABLE IF EXISTS T04_PROJECT_EMPLOYEE;
CREATE TABLE T04_PROJECT_EMPLOYEE (
	C04_PRJ_EMP_ID INT PRIMARY KEY AUTO_INCREMENT,
    C04_PRJ_ID INT NOT NULL,
    C04_EMP_ID INT NOT NULL,
    C04_WORK_HOURS INT NOT NULL,
    CONSTRAINT FK_T04_T03_PRJ_ID FOREIGN KEY (C04_PRJ_ID) REFERENCES t03_project(C03_PRJ_ID),
    CONSTRAINT FK_T04_T02_EMP_ID FOREIGN KEY (C04_EMP_ID) REFERENCES t02_employee(C02_EMP_ID),
    CONSTRAINT UNQ_C04_PRJ_EMP_ID UNIQUE (C04_PRJ_ID, C04_EMP_ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu

TRUNCATE TABLE t01_department; 
TRUNCATE TABLE t02_employee; 
TRUNCATE TABLE t03_project; 
TRUNCATE TABLE T04_PROJECT_EMPLOYEE; 

SET FOREIGN_KEY_CHECKS = 0;

-- t01_department
INSERT INTO t01_department (C01_DPM_ID, C01_DPM_NAME, C01_INTAKE_DATE, C01_MANAGER_ID) VALUES
(1, 'Department 1', str_to_date('22/02/2020', '%d/%m/%Y'), 1),
(2, 'Department 2', str_to_date('22/01/2019', '%d/%m/%Y'), 2),
(3, 'Department 3', str_to_date('02/02/2020', '%d/%m/%Y'), 3),
(4, 'Department 4', str_to_date('18/02/2018', '%d/%m/%Y'), 4),
(5, 'Department 5', str_to_date('22/10/2020', '%d/%m/%Y'), 5),
(6, 'Department 6', str_to_date('24/02/2022', '%d/%m/%Y'), 6),
(7, 'Department 7', str_to_date('12/09/2019', '%d/%m/%Y'), 7)

-- t02_employee
INSERT INTO t02_employee (C02_EMP_ID, C02_EMP_NAME, C02_ADDRESS, C02_SALARY, C02_GENDER, C02_DATE_OF_BIRTH, C02_STARTED_DATE_AT, C02_DPM_ID, C02_MANAGER_ID) VALUES
(1, 'Lưu Ngọc Yến Như', 'Đà Nẵng', 1500, 1, str_to_date('01/01/1990', '%d/%m/%Y'), str_to_date('01/02/2020', '%d/%m/%Y'), 1, 2),
(2, 'Trần Thị Bình', 'Hồ Chí Minh', 1600, 0, str_to_date('05/03/1992', '%d/%m/%Y'), str_to_date('03/04/2020', '%d/%m/%Y'), 2, 1),
(3, 'Lê Văn Cường', 'Đà Nẵng', 1700, 1, str_to_date('10/05/1988', '%d/%m/%Y'), str_to_date('10/06/2020', '%d/%m/%Y'), 3, 4),
(4, 'Phạm Thị Dung', 'Cần Thơ', 1550, 0, str_to_date('20/07/1991', '%d/%m/%Y'), str_to_date('15/08/2020', '%d/%m/%Y'), 4, 3),
(5, 'Hoàng Văn Dũng', 'Hải Phòng', 1650, 1, str_to_date('25/09/1993', '%d/%m/%Y'), str_to_date('20/10/2020', '%d/%m/%Y'), 5, 6),
(6, 'Đặng Thị Mai', 'Bình Dương', 1750, 0, str_to_date('30/11/1995', '%d/%m/%Y'), str_to_date('25/12/2020', '%d/%m/%Y'), 6, 7),
(7, 'Võ Văn Đạt', 'Quảng Ninh', 1800, 1, str_to_date('15/01/1990', '%d/%m/%Y'), str_to_date('10/02/2021', '%d/%m/%Y'), 7, 5);

SET FOREIGN_KEY_CHECKS = 1;

-- t03_project
INSERT INTO T03_PROJECT (C03_PRJ_ID, C03_PRJ_NAME, C03_START_DATE, C03_END_DATE, C03_REVENUE, C03_EMP_ID) 
VALUES
(1, 'Dự án 1', str_to_date('01/01/2022', '%d/%m/%Y'), str_to_date('01/07/2022', '%d/%m/%Y'), 50000, 1),
(2, 'Dự án 2', str_to_date('15/02/2020', '%d/%m/%Y'), str_to_date('15/08/2022', '%d/%m/%Y'), 75000, 2),
(3, 'Dự án 3', str_to_date('01/03/2022', '%d/%m/%Y'), str_to_date('01/09/2022', '%d/%m/%Y'), 60000, 3),
(4, 'Dự án 4', str_to_date('10/04/2021', '%d/%m/%Y'), str_to_date('10/10/2022', '%d/%m/%Y'), 85000, 4),
(5, 'Dự án 5', str_to_date('20/05/2022', '%d/%m/%Y'), str_to_date('20/11/2022', '%d/%m/%Y'), 90000, 5);

INSERT INTO T03_PROJECT (C03_PRJ_ID, C03_PRJ_NAME, C03_START_DATE, C03_END_DATE, C03_REVENUE, C03_EMP_ID) 
VALUES
(6, 'Dự án 6', str_to_date('01/06/2021', '%d/%m/%Y'), str_to_date('01/12/2022', '%d/%m/%Y'), 65000, 6),
(7, 'Dự án 7', str_to_date('10/07/2022', '%d/%m/%Y'), str_to_date('10/01/2023', '%d/%m/%Y'), 70000, 7),
(8, 'Dự án 8', str_to_date('01/08/2021', '%d/%m/%Y'), str_to_date('01/02/2023', '%d/%m/%Y'), 80000, 1),
(9, 'Dự án 9', str_to_date('15/09/2019', '%d/%m/%Y'), str_to_date('15/03/2023', '%d/%m/%Y'), 90000, 2),
(10, 'Dự án 10', str_to_date('20/10/2018', '%d/%m/%Y'), str_to_date('20/04/2023', '%d/%m/%Y'), 100000, 3),
(11, 'Dự án 11', str_to_date('05/11/2020', '%d/%m/%Y'), str_to_date('05/05/2023', '%d/%m/%Y'), 95000, 4),
(12, 'Dự án 12', str_to_date('25/12/2022', '%d/%m/%Y'), str_to_date('25/06/2023', '%d/%m/%Y'), 85000, 5);

-- T04_PROJECT_EMPLOYEE
 
INSERT INTO T04_PROJECT_EMPLOYEE (C04_PRJ_EMP_ID, C04_PRJ_ID, C04_EMP_ID, C04_WORK_HOURS)
VALUES
(1, 1, 1, 120),
(2, 2, 2, 150),
(3, 3, 3, 110),
(4, 4, 4, 130),
(5, 5, 5, 140);

INSERT INTO T04_PROJECT_EMPLOYEE (C04_PRJ_EMP_ID, C04_PRJ_ID, C04_EMP_ID, C04_WORK_HOURS)
VALUES
(6, 6, 6, 125),
(7, 7, 7, 130),
(8, 8, 1, 135),
(9, 9, 2, 140),
(10, 10, 3, 145),
(11, 11, 4, 150),
(12, 12, 5, 155);


-- Phần C. Thực hiện truy vấn

-- 1. Liệt kê các dự án diễn ra trong năm 2022 có số tiền thu được trên 50 triệu VND
SELECT *
  FROM t03_project
 WHERE YEAR(C03_START_DATE) = 2022
   AND C03_REVENUE > 50000

-- 2. Liệt kê các nhân viên đã tham gia hơn 130 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
SELECT t02.*,
	   t03.C03_PRJ_NAME,
       t04.C04_WORK_HOURS
  FROM t02_employee t02
  JOIN t04_project_employee t04 ON t02.C02_EMP_ID = t04.C04_EMP_ID
  JOIN t03_project t03 ON t04.C04_PRJ_ID = t03.C03_PRJ_ID
 WHERE t04.C04_WORK_HOURS > 130
 
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
SELECT e.C02_EMP_ID, 
       e.C02_EMP_NAME, 
       e.C02_SALARY, 
       m.C02_EMP_NAME AS MANAGER_NAME,
       m.C02_SALARY AS MANAGER_SALARY
FROM t02_employee e
JOIN t02_employee m ON e.C02_MANAGER_ID = m.C02_EMP_ID
WHERE e.C02_SALARY >= m.C02_SALARY;


-- 4. Liệt kê các phòng ban có số lượng nhân viên > 1

-- Thêm dữ liệu để test
INSERT INTO t02_employee (C02_EMP_ID, C02_EMP_NAME, C02_ADDRESS, C02_SALARY, C02_GENDER, C02_DATE_OF_BIRTH, C02_STARTED_DATE_AT, C02_DPM_ID, C02_MANAGER_ID) 
VALUES
(8, 'Yến Như', 'Đà Nẵng', 1500, 1, str_to_date('01/01/1990', '%d/%m/%Y'), str_to_date('01/02/2020', '%d/%m/%Y'), 2, 2);
-- 

SELECT T01.*,
       COUNT(T02.C02_EMP_ID) NUMBER_OF_EMP
  FROM t01_department T01
  JOIN t02_employee T02 ON T01.C01_DPM_ID = T02.C02_DPM_ID
 GROUP BY C02_DPM_ID
HAVING COUNT(T02.C02_EMP_ID) > 1

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 4 năm
SELECT C02_EMP_ID, C02_EMP_NAME, C02_STARTED_DATE_AT,
       TIMESTAMPDIFF(YEAR, C02_STARTED_DATE_AT, CURDATE()) AS NUMBER_OF_YEAR_WORKED
  FROM t02_employee
 WHERE TIMESTAMPDIFF(YEAR, C02_STARTED_DATE_AT, CURDATE()) > 4;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT DISTINCT E.*
  FROM t02_employee E
  JOIN t01_department D ON E.C02_EMP_ID = D.C01_MANAGER_ID
  JOIN t03_project P ON E.C02_EMP_ID = P.C03_EMP_ID
 WHERE E.C02_EMP_ID = D.C01_MANAGER_ID AND E.C02_EMP_ID = P.C03_EMP_ID;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT E.C02_EMP_ID, 
       E.C02_EMP_NAME,
       COUNT(C03_PRJ_ID) NUMBER_OF_PROJECTS
  FROM t02_employee E
  JOIN t03_project P ON E.C02_EMP_ID = P.C03_EMP_ID
 WHERE E.C02_EMP_ID = P.C03_EMP_ID
 GROUP BY P.C03_EMP_ID
HAVING NUMBER_OF_PROJECTS > 1

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật
DROP TABLE IF EXISTS t05_project_employee_log;
CREATE TABLE t05_project_employee_log (
    C05_LOG_ID INT PRIMARY KEY AUTO_INCREMENT,
    C05_EMP_ID INT NOT NULL,
    C05_PRJ_ID INT NOT NULL,
    C05_ACTION VARCHAR(255) NOT NULL,
    C05_OLD_WORK_HOURS INT,
    C05_NEW_WORK_HOURS INT,
    C05_TIMESTAMP DATETIME DEFAULT CURRENT_TIMESTAMP,
    CONSTRAINT FK_T05_T02_EMP_ID FOREIGN KEY (C05_EMP_ID) REFERENCES t02_employee(C02_EMP_ID),
    CONSTRAINT FK_T05_T03_PRJ_ID FOREIGN KEY (C05_PRJ_ID) REFERENCES t03_project(C03_PRJ_ID)
);

DROP TRIGGER IF EXISTS tg_after_employee_join_project;
DELIMITER $$
CREATE TRIGGER tg_after_employee_join_project
AFTER INSERT ON t04_project_employee
FOR EACH ROW
BEGIN
    INSERT INTO t05_project_employee_log (C05_EMP_ID, C05_PRJ_ID, C05_ACTION, C05_OLD_WORK_HOURS, C05_NEW_WORK_HOURS)
    VALUES (NEW.C04_EMP_ID, NEW.C04_PRJ_ID, 'Thêm mới', NULL, NEW.C04_WORK_HOURS);
END $$

DROP TRIGGER IF EXISTS tg_after_employee_update_work_hours;
DELIMITER $$
CREATE TRIGGER tg_after_employee_update_work_hours
AFTER UPDATE ON t04_project_employee
FOR EACH ROW
BEGIN
    INSERT INTO t05_project_employee_log (C05_EMP_ID, C05_PRJ_ID, C05_ACTION, C05_OLD_WORK_HOURS, C05_NEW_WORK_HOURS)
    VALUES (NEW.C04_EMP_ID, NEW.C04_PRJ_ID, 'Cập nhật', OLD.C04_WORK_HOURS, NEW.C04_WORK_HOURS);
END $$

-- TEST
TRUNCATE t05_project_employee_log;
SELECT * FROM t05_project_employee_log;

INSERT INTO t04_project_employee (C04_PRJ_ID, C04_EMP_ID, C04_WORK_HOURS)
VALUES
(2, 4, 25);

SELECT * FROM t05_project_employee_log;

UPDATE t04_project_employee
SET C04_WORK_HOURS = 180
WHERE C04_PRJ_ID = 1 AND C04_EMP_ID = 1;

SELECT * FROM t05_project_employee_log;



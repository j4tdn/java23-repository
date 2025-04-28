CREATE DATABASE COMPANY_DB;
USE COMPANY_DB;


DROP TABLE IF EXISTS T01_DEPARTMENT;
CREATE TABLE T01_DEPARTMENT (
	C01_DEPARTMENT_ID INT AUTO_INCREMENT,
	C01_DEPARTMENT_NAME VARCHAR(255) NOT NULL,
    C01_MANAGE_DATE DATE NOT NULL,
	C01_DEPARTMENT_MANAGER_ID INT NOT NULL,
    PRIMARY KEY (C01_DEPARTMENT_ID),
    CONSTRAINT UNQ_C01_DEPARTMENT_NAME UNIQUE(C01_DEPARTMENT_NAME)
);



DROP TABLE IF EXISTS T02_EMPLOYEE;
CREATE TABLE T02_EMPLOYEE (
	C02_EMPLOYEE_ID INT AUTO_INCREMENT,
	C02_EMPLOYEE_NAME VARCHAR(255) NOT NULL,
    C02_BIRTH_DATE DATE NOT NULL,
    C02_GENDER BIT(1) NOT NULL,
	C02_SALARY FLOAT NOT NULL,
    C02_START_DATE DATE NOT NULL,
	C02_ADDRESS VARCHAR(255) NOT NULL,
	C02_DEPARTMENT_ID INT NOT NULL,
	C02_EMPLOYEE_MANAGER_ID INT,

    PRIMARY KEY (C02_EMPLOYEE_ID),
    CONSTRAINT FK_T02_T01 FOREIGN KEY (C02_DEPARTMENT_ID) REFERENCES T01_DEPARTMENT(C01_DEPARTMENT_ID),
	CONSTRAINT FK_SELF_REFERENCE FOREIGN KEY (C02_EMPLOYEE_MANAGER_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID)
);

-- thêm khóa ngoại cho bảng department
ALTER TABLE T01_DEPARTMENT ADD  CONSTRAINT FK_T01_T02 FOREIGN KEY (C01_DEPARTMENT_MANAGER_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID);


CREATE TABLE T03_PROJECT (
	C03_PROJECT_ID INT AUTO_INCREMENT,
	C03_PROJECT_NAME VARCHAR(255) NOT NULL,
	C03_START_DATE DATE NOT NULL,
	C03_END_DATE DATE NOT NULL,
	C03_PROJECT_INCOME FLOAT,
	C03_PROJECT_MANAGER_ID INT NOT NULL,
	PRIMARY KEY (C03_PROJECT_ID),
    CONSTRAINT FK_T03_T02 FOREIGN KEY (C03_PROJECT_MANAGER_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID)
);

-- bảng nhiều nhiều project - employee
CREATE TABLE T04_PROJECT_EMPLOYEE
(
	C04_PROJECT_ID INT NOT NULL,
	C04_EMPLOYEE_ID INT NOT NULL,
	C04_WOKING_HOURS FLOAT NOT NULL,
    PRIMARY KEY(C04_PROJECT_ID, C04_EMPLOYEE_ID),
	CONSTRAINT FK_T04_T02 FOREIGN KEY (C04_EMPLOYEE_ID) REFERENCES T02_EMPLOYEE(C02_EMPLOYEE_ID),
	CONSTRAINT FK_T04_T03 FOREIGN KEY (C04_PROJECT_ID) REFERENCES T03_PROJECT(C03_PROJECT_ID)
);

-- set fk = 0 để add department manager

SET FOREIGN_KEY_CHECKS = 0; -- disable fk

INSERT INTO T01_DEPARTMENT(C01_DEPARTMENT_NAME, C01_DEPARTMENT_MANAGER_ID, C01_MANAGE_DATE) VALUES
('Research And Development Department', 1, TO_DATE('2024-04-18', 'YYYY-MM-DD')),
('IT Department', 2, TO_DATE('2024-04-20', 'YYYY-MM-DD')),
('Marketing Department', 3, TO_DATE('2024-04-22', 'YYYY-MM-DD')),
('Human Resource Department', 4, TO_DATE('2024-04-24', 'YYYY-MM-DD')),
('Customer Service Department', 5, TO_DATE('2024-04-26', 'YYYY-MM-DD')),
('Public Relation Department', 6, TO_DATE('2024-04-28', 'YYYY-MM-DD'));

SET GLOBAL log_bin_trust_function_creators = 1;

DROP FUNCTION IF EXISTS f_random;

DELIMITER $$

-- random a number from 1(inclusive) to maxInclusive

CREATE FUNCTION f_random(maxInclusive INT)
RETURNS INT
BEGIN
    RETURN floor(rand() * maxInclusive + 1);
END $$


DROP FUNCTION IF EXISTS f_cast_to_bit;

DELIMITER $$

CREATE FUNCTION f_cast_to_bit (val INT) RETURNS BIT(1)
BEGIN
    RETURN val;
END

-- procedure thêm nahan viên
DROP PROCEDURE IF EXISTS p_insert_into_employee;

DELIMITER $$

CREATE PROCEDURE p_insert_into_employee()
BEGIN
    -- Khai báo biến
	DECLARE max INT DEFAULT 13;
    DECLARE running INT DEFAULT 1;

    WHILE running <= max DO
		
        INSERT INTO T02_EMPLOYEE(
			C02_EMPLOYEE_ID,
            C02_EMPLOYEE_NAME,
            C02_SALARY,
            C02_GENDER,
            C02_BIRTH_DATE,
            C02_START_DATE,
            C02_ADDRESS,
            C02_DEPARTMENT_ID
        )
        VALUES(
			running, -- id
            concat('Nhân viên ', running), -- name
            2000 + (FLOOR(RAND() * 7) * 500),
            f_cast_to_bit(elt(f_random(2), 0, 1)), 
            DATE_SUB(DATE_SUB(current_timestamp(), INTERVAL running YEAR), INTERVAL running DAY),
              DATE_SUB(DATE_SUB(current_timestamp(), INTERVAL running YEAR), INTERVAL running DAY),
              CONCAT('Địa chỉ ', CHAR(65 + FLOOR(RAND() * 7))),
              f_random(6)
		);
		SET running = running + 1;
    END WHILE;
END $$


CALL p_insert_into_employee();

SELECT * FROM T02_EMPLOYEE

UPDATE T02_EMPLOYEE
SET C02_EMPLOYEE_MANAGER_ID = 1
WHERE C02_SALARY = 2000

UPDATE T02_EMPLOYEE
SET C02_EMPLOYEE_MANAGER_ID = 10
WHERE C02_SALARY = 2500

-- procedure thêm dự án

DROP PROCEDURE IF EXISTS p_insert_into_projects;

DELIMITER $$

CREATE PROCEDURE p_insert_into_projects()
BEGIN
    -- Khai báo biến
	DECLARE max INT DEFAULT 13;
    DECLARE running INT DEFAULT 1;

    WHILE running <= max DO
		
        INSERT INTO T03_PROJECT(
			C03_PROJECT_ID,
            C03_PROJECT_NAME,
            C03_PROJECT_INCOME,
           C03_START_DATE,
            C03_END_DATE,
            C03_PROJECT_MANAGER_ID
        )
        VALUES(
			running, -- id
            concat('Dự án ', running), -- name
            10000 + (FLOOR(RAND() * 7) * 1000),
			DATE_SUB(DATE_SUB(current_timestamp(), INTERVAL running YEAR), INTERVAL running DAY),
			date_add(date_add(current_timestamp(), INTERVAL running YEAR), INTERVAL running DAY),
			f_random(13)
		);
		SET running = running + 1;
    END WHILE;
END $$

CALL p_insert_into_projects();


-- procedure thêm nahan viên - dự án

DROP PROCEDURE IF EXISTS p_insert_into_project_employee;

DELIMITER $$

CREATE PROCEDURE p_insert_into_project_employee()
BEGIN
    -- Khai báo biến
	DECLARE max INT DEFAULT 30;
    DECLARE running INT DEFAULT 1;

    WHILE running <= max DO
		
        INSERT IGNORE  INTO T04_PROJECT_EMPLOYEE(
			C04_PROJECT_ID,
            C04_EMPLOYEE_ID,
            C04_WOKING_HOURS
        )
        VALUES(
			f_random(13), -- project id
            f_random(13), -- employee id
            50 + (FLOOR(RAND() * 7) * 10)
		);
        IF ROW_COUNT() > 0 THEN
            SET running = running + 1;
        END IF;
		
    END WHILE;
END $$

CALL p_insert_into_project_employee();


SET FOREIGN_KEY_CHECKS = 1; 

-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
 -- diễn ra trong năm 2024 có income > 15k 
	SELECT * FROM T03_PROJECT
    WHERE YEAR(C03_START_DATE) <= 2024 AND YEAR(C03_END_DATE) > 2024
			AND C03_PROJECT_INCOME > 15000
 
 -- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
-- NHÂN VIÊN LÀM HƠN 100 TIẾNG
SELECT T02.C02_EMPLOYEE_NAME, T03.C03_PROJECT_NAME, T04.C04_WOKING_HOURS
	FROM t04_project_employee T04 
    JOIN t02_employee T02  ON T04.C04_EMPLOYEE_ID = T02.C02_EMPLOYEE_ID
	JOIN t03_project T03 ON T03.C03_PROJECT_ID = T04.C04_PROJECT_ID 
    WHERE T04.C04_WOKING_HOURS > 100

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó

UPDATE T02_EMPLOYEE
SET C02_EMPLOYEE_MANAGER_ID = 13
WHERE C02_SALARY = 4500

SELECT 
    EMPLOYEE.C02_EMPLOYEE_ID,
    EMPLOYEE.C02_EMPLOYEE_NAME,
    EMPLOYEE.C02_SALARY,
    MANAGER.C02_EMPLOYEE_NAME  MANAGER_NAME,
    MANAGER.C02_SALARY  MANAGER_SALARY
FROM 
    T02_EMPLOYEE EMPLOYEE
JOIN 
    T02_EMPLOYEE MANAGER ON EMPLOYEE.C02_EMPLOYEE_MANAGER_ID = MANAGER.C02_EMPLOYEE_ID
WHERE 
    EMPLOYEE.C02_SALARY >= MANAGER.C02_SALARY;


-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?* = 2

SELECT COUNT(*) AS NUMBER_OF_EMPLOYEES ,C01_DEPARTMENT_NAME  FROM t02_employee T02 
	JOIN t01_department T01 ON T01.C01_DEPARTMENT_ID = T02.C02_DEPARTMENT_ID
	GROUP BY C02_DEPARTMENT_ID, C01_DEPARTMENT_NAME
	HAVING NUMBER_OF_EMPLOYEES > 2

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm  = 10 
SELECT *, YEAR(CURRENT_TIMESTAMP)  - YEAR(C02_START_DATE) AS YEAR_OF_WORK FROM t02_employee
WHERE YEAR(CURRENT_TIMESTAMP)  - YEAR(C02_START_DATE) > 10

SELECT YEAR(CURRENT_TIMESTAMP)

-- Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án

SELECT * FROM t02_employee WHERE EXISTS (
	SELECT 1 FROM t03_project, t01_department
		WHERE C03_PROJECT_MANAGER_ID = C01_DEPARTMENT_MANAGER_ID
			AND t02_employee.C02_EMPLOYEE_ID = C01_DEPARTMENT_MANAGER_ID
	)
    
-- . Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
WITH cte_number_of_projects AS(
SELECT count(*) number_of_projects, C03_PROJECT_MANAGER_ID  
 FROM t03_project 
 GROUP BY C03_PROJECT_MANAGER_ID 
 HAVING number_of_projects >= 2
 ) SELECT * FROM t02_employee, cte_number_of_projects  WHERE C02_EMPLOYEE_ID = cte_number_of_projects.C03_PROJECT_MANAGER_ID
    
    
    -- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật

-- bangr log

DROP TABLE IF EXISTS T05_PROJECT_EMPLOYEE_LOG;
CREATE TABLE T05_PROJECT_EMPLOYEE_LOG (
    C05_LOG_ID INT AUTO_INCREMENT,
    C05_PROJECT_ID INT,
    C05_EMPLOYEE_ID INT,
    C05_ACTION_TYPE VARCHAR(10),
    C05_OLD_WORKING_HOURS FLOAT,
    C05_NEW_WORKING_HOURS FLOAT,
    C05_ACTION_TIME TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (C05_LOG_ID)
);

SELECT * FROM T05_PROJECT_EMPLOYEE_LOG


-- trigger inssert
DELIMITER $$
CREATE TRIGGER trgr_insert_project_employee
AFTER INSERT ON t04_project_employee
FOR EACH ROW
BEGIN
    INSERT INTO T05_PROJECT_EMPLOYEE_LOG (
        C05_PROJECT_ID,
        C05_EMPLOYEE_ID,
        C05_ACTION_TYPE,
        C05_OLD_WORKING_HOURS,
        C05_NEW_WORKING_HOURS
    ) VALUES (
        NEW.C04_PROJECT_ID,
        NEW.C04_EMPLOYEE_ID,
        'INSERT',
        NULL,
        NEW.C04_WOKING_HOURS
    );
END$$
DELIMITER ;

-- tesst 
    INSERT INTO T04_PROJECT_EMPLOYEE (C04_PROJECT_ID, C04_EMPLOYEE_ID, C04_WOKING_HOURS)
VALUES (10, 11, 60);
    
    SELECT * FROM T05_PROJECT_EMPLOYEE_LOG

-- trigger update
DELIMITER $$
CREATE TRIGGER trgr_after_update_project_employee
AFTER UPDATE ON T04_PROJECT_EMPLOYEE
FOR EACH ROW
BEGIN
    INSERT INTO T05_PROJECT_EMPLOYEE_LOG (
        C05_PROJECT_ID,
         C05_EMPLOYEE_ID,
        C05_ACTION_TYPE,
        C05_OLD_WORKING_HOURS,
        C05_NEW_WORKING_HOURS
    ) VALUES (
        NEW.C04_PROJECT_ID,
        NEW.C04_EMPLOYEE_ID,
        'UPDATE',
        OLD.C04_WOKING_HOURS,
        NEW.C04_WOKING_HOURS
    );
END$$
DELIMITER ;

-- tesst 
UPDATE T04_PROJECT_EMPLOYEE
SET C04_WOKING_HOURS = 120
WHERE C04_PROJECT_ID = 01 AND C04_EMPLOYEE_ID = 11;

    SELECT * FROM T05_PROJECT_EMPLOYEE_LOG


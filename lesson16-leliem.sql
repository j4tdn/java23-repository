-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
-- Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan đến nhân viên,
-- phòng ban và dự án, chi tiết được mô tả như sau:
CREATE DATABASE java23_company CHAR SET utf8mb4;
USE java23_company;
-- Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban sẽ có một tên duy nhất, một
-- mã số duy nhất và các nhân viên, trong đó có một nhân viên là người quản lý phòng ban đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
-- là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
CREATE TABLE T01_DEPARTMENT(
	C01_DEPT_ID INT PRIMARY KEY AUTO_INCREMENT,
	C01_DEPT_NAME VARCHAR(255) NOT NULL, 
	C01_DEPT_MANAGER_ID INT NOT NULL,
	C01_START_DATE DATE NOT NULL,
    CONSTRAINT UNQ_DEPT_NAME UNIQUE(C01_DEPT_NAME),
    CONSTRAINT UNQ_DEPT_MANAGER_ID UNIQUE(C01_DEPT_MANAGER_ID)

);

-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty
CREATE TABLE T02_EMPLOYEE (
    C02_EMP_ID INT PRIMARY KEY AUTO_INCREMENT,           
    C02_EMP_FULL_NAME VARCHAR(255) NOT NULL,            
    C02_ADDRESS VARCHAR(255),                            
    C02_SALARY DECIMAL(15,2),                           
    C02_GENDER ENUM('Nam', 'Nữ', 'Khác'),       
    C02_EMP_BIRTHDATE DATE,                             
    C02_EMP_JOINDATE DATE,                              
    C02_EMP_MANAGER_ID INT,                              
    C02_DEPT_ID INT NOT NULL,                          
    CONSTRAINT FK_T02_T01 FOREIGN KEY(C02_DEPT_ID) REFERENCES T01_DEPARTMENT(C01_DEPT_ID)
);

ALTER TABLE T02_EMPLOYEE
ADD CONSTRAINT FK_T02_MANAGER FOREIGN KEY (C02_EMP_MANAGER_ID) REFERENCES T02_EMPLOYEE(C02_EMP_ID);

ALTER TABLE T01_DEPARTMENT
ADD CONSTRAINT FK_T01_T02 FOREIGN KEY (C01_DEPT_MANAGER_ID) REFERENCES T02_EMPLOYEE(C02_EMP_ID);

-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
CREATE TABLE T03_PROJECT(
	C03_PROJECT_ID INT PRIMARY KEY AUTO_INCREMENT ,
	C03_PROJECT_NAME VARCHAR(255) NOT NULL,
	C03_BEGIN_DATE DATE NOT NULL,
	C03_END_DATE DATE NOT NULL,
	C03_REVENUE DECIMAL(20,2),
	C03_MANAGER_PROJECT_ID INT NOT NULL,
    CONSTRAINT UNQ_PROJECT_NAME UNIQUE(C03_PROJECT_NAME),
    CONSTRAINT FK_T03_T02 FOREIGN KEY (C03_MANAGER_PROJECT_ID) REFERENCES T02_EMPLOYEE(C02_EMP_ID)
);

-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi
-- nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
-- viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.
CREATE TABLE T04_WORKS_ON(
	C04_PROJECT_ID INT NOT NULL,
	C04_EMP_ID INT NOT NULL,
	C04_WORKING_HOURS INT NOT NULL

);
ALTER TABLE T04_WORKS_ON
ADD CONSTRAINT FK_T04_T03_ID_PROJECT FOREIGN KEY (C04_PROJECT_ID) REFERENCES T03_PROJECT(C03_PROJECT_ID);

ALTER TABLE T04_WORKS_ON
ADD CONSTRAINT FK_T04_T02_ID_EMP FOREIGN KEY (C04_EMP_ID) REFERENCES T02_EMPLOYEE(C02_EMP_ID);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu
SET FOREIGN_KEY_CHECKS = 0;
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO T01_DEPARTMENT (C01_DEPT_NAME, C01_DEPT_MANAGER_ID, C01_START_DATE)
VALUES 
('Phòng Kinh doanh', 1, '2020-01-01'),
('Phòng Kỹ thuật', 2, '2021-03-10'),
('Phòng Nhân sự', 3, '2019-06-15'),
('Phòng Marketing', 4, '2022-07-20'),
('Phòng Tài chính', 5, '2020-09-05');

INSERT INTO T02_EMPLOYEE (C02_EMP_FULL_NAME, C02_ADDRESS, C02_SALARY, C02_GENDER, C02_EMP_BIRTHDATE, C02_EMP_JOINDATE, C02_EMP_MANAGER_ID, C02_DEPT_ID)
VALUES 
('Nguyễn Văn A', 'Hà Nội', 10000000, 'Nam', '1990-05-15', '2020-01-10', 1, 1),
('Trần Thị B', 'TP. Hồ Chí Minh', 12000000, 'Nữ', '1992-08-25', '2021-03-15', 1, 2),
('Lê Minh C', 'Đà Nẵng', 15000000, 'Nam', '1988-11-05', '2019-09-30', 2, 3),
('Phạm Thị D', 'Cần Thơ', 8000000, 'Nữ', '1995-02-18', '2022-02-22', 3, 4),
('Nguyễn Thái E', 'Bình Dương', 9000000, 'Nam', '1993-03-12', '2020-07-11', 4, 5);

INSERT INTO T03_PROJECT (C03_PROJECT_NAME, C03_BEGIN_DATE, C03_END_DATE, C03_REVENUE, C03_MANAGER_PROJECT_ID)
VALUES 
('Dự án Xây dựng Website', '2021-02-01', '2022-05-15', 500000000, 1),
('Dự án Phát triển Ứng dụng', '2020-06-01', '2021-10-20', 1000000000, 2),
('Dự án Marketing Mới', '2022-01-01', '2022-12-31', 300000000, 3),
('Dự án Nâng cấp Hệ thống', '2021-03-01', '2022-06-30', 750000000, 4),
('Dự án Quản lý Tài chính', '2020-09-01', '2021-12-31', 800000000, 5);

INSERT INTO T04_WORKS_ON (C04_PROJECT_ID, C04_EMP_ID, C04_WORKING_HOURS)
VALUES 
(1, 1, 120),
(1, 2, 120),
(2, 2, 140),
(3, 3, 100),
(3, 2, 120),
(4, 4, 160),
(5, 5, 180);


SELECT * FROM T01_DEPARTMENT;
SELECT * FROM T02_EMPLOYEE;
SELECT * FROM T03_PROJECT;
SELECT * FROM T04_WORKS_ON;

TRUNCATE TABLE T04_WORKS_ON;
TRUNCATE TABLE T03_PROJECT;
TRUNCATE TABLE T02_EMPLOYEE;
TRUNCATE TABLE T01_DEPARTMENT;
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT C03_PROJECT_ID, C03_PROJECT_NAME, C03_BEGIN_DATE, C03_END_DATE, C03_REVENUE FROM T03_PROJECT
WHERE YEAR(C03_BEGIN_DATE) = 2021
  AND C03_REVENUE > 50000000;
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT T02_EMPLOYEE.C02_EMP_FULL_NAME,
       T03_PROJECT.C03_PROJECT_NAME,
       T04_WORKS_ON.C04_WORKING_HOURS
FROM T04_WORKS_ON
JOIN 
    T02_EMPLOYEE 
    ON T04_WORKS_ON.C04_EMP_ID = T02_EMPLOYEE.C02_EMP_ID
JOIN 
    T03_PROJECT 
    ON T04_WORKS_ON.C04_PROJECT_ID = T03_PROJECT.C03_PROJECT_ID
WHERE 
    T04_WORKS_ON.C04_WORKING_HOURS > 100;
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
SELECT 
    E1.C02_EMP_FULL_NAME AS Employee_Name,
    E1.C02_SALARY AS Employee_Salary,
    E2.C02_EMP_FULL_NAME AS Manager_Name,
    E2.C02_SALARY AS Manager_Salary
FROM 
    T02_EMPLOYEE E1
JOIN 
    T02_EMPLOYEE E2 ON E1.C02_EMP_MANAGER_ID = E2.C02_EMP_ID
WHERE 
    E1.C02_SALARY >= E2.C02_SALARY;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
--
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
--
-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT 
    E.C02_EMP_FULL_NAME
FROM 
    T02_EMPLOYEE E
JOIN 
    T01_DEPARTMENT D ON E.C02_EMP_ID = D.C01_DEPT_MANAGER_ID
JOIN 
    T03_PROJECT P ON E.C02_EMP_ID = P.C03_MANAGER_PROJECT_ID;
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật

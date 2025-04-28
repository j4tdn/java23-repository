-- exam
-- Đề bài: Xây dựng cơ sở dữ liệu quản lý công ty để theo dõi các thông tin liên quan đến nhân viên,
-- phòng ban và dự án, chi tiết được mô tả như sau:
-- Công ty được tổ chức thành các phòng ban chức năng. Mỗi phòng ban sẽ có một tên duy nhất, một
-- mã số duy nhất và các nhân viên, trong đó có một nhân viên là người quản lý phòng ban đó.
-- Việc nhân viên quản lý phòng ban được ghi lại bằng ngày nhân viên đó bắt đầu quản lý và được gọi
-- là trưởng phòng. Ta ghi nhận lại ngày nhận chức của trưởng phòng.
-- Công ty sẽ có nhiều dự án, một dự án có một tên duy nhất, một mã số duy nhất, ngày bắt đầu, ngày
-- kết thúc(hoàn thành dự án), số tiền thu được(đơn vị VNĐ) từ dự án đó.
-- Dự án được thực hiện bởi một hoặc nhiều nhân viên, có một nhân viên duy nhất làm quản lý dự án.
-- Với mỗi nhân viên chúng ta lưu giữ lại các thông tin bao gồm họ tên, mã số duy nhất, địa chỉ,
-- lương, giới tính, ngày sinh, ngày vào công ty
-- Một nhân viên chỉ làm việc cho một phòng ban nhưng có thể làm việc cho nhiều dự án.
-- Chúng ta lưu giữ lại số giờ làm việc của mỗi nhân viên trên dự án mà nhân viên đó tham gia. Mỗi
-- nhân viên có thể có một người quản lý giám sát trực tiếp, người đó cũng là một nhân viên, nhân
-- viên và quản lý/giám sát của nhân viên có thể tham gia cùng/khác dự án.

-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
--
CREATE DATABASE EXAMDB;
USE EXAMDB;


CREATE TABLE T01_PHONGBAN (
    C01_DEPARTMENT_ID INT PRIMARY KEY,
    C01_DEPARTMENT_NAME VARCHAR(255) UNIQUE NOT NULL,
    C01_MANAGER_ID INT,
    C01_START_DATE DATE
);


CREATE TABLE T02_EMPLOYEES (
    C02_EMPLOYEES_ID INT PRIMARY KEY,
    C02_NAME VARCHAR(255) NOT NULL,
    C02_ADDRESS VARCHAR(255),
    C02_SALARY DECIMAL(15, 2) NOT NULL,
    C02_GENDER ENUM('M', 'F', 'Other') NOT NULL,
    C02_DAY_OF_BIRTH DATE NOT NULL,
    C02_HIRE_DATE DATE NOT NULL,
    C02_DEPARTMENT_ID INT NOT NULL,
    C02_SUPERVISOR_ID INT,
    FOREIGN KEY (C02_DEPARTMENT_ID) REFERENCES T01_PHONGBAN(C01_DEPARTMENT_ID),
    FOREIGN KEY (C02_SUPERVISOR_ID) REFERENCES T02_EMPLOYEES(C02_EMPLOYEES_ID)
);


ALTER TABLE T01_PHONGBAN
ADD CONSTRAINT fk_manager
FOREIGN KEY (C01_MANAGER_ID) REFERENCES T02_EMPLOYEES(C02_EMPLOYEES_ID);


CREATE TABLE T03_PROJECT (
    C03_PROJECT_ID INT PRIMARY KEY,
    C03_PROJECT_NAME VARCHAR(100) UNIQUE NOT NULL,
    C03_START_DATE DATE NOT NULL,
    C03_END_DATE DATE,
    C03_REVENUE DECIMAL(15, 2) NOT NULL,
    C03_MANAGER_ID INT NOT NULL,
    FOREIGN KEY (C03_MANAGER_ID) REFERENCES T02_EMPLOYEES(C02_EMPLOYEES_ID)
);


CREATE TABLE T04_MANAGEMENT_PROJECT (
    C04_LOG_ID INT AUTO_INCREMENT PRIMARY KEY,
    C04_EMPLOYEES_ID INT NOT NULL,
    C04_PROJECT_ID INT NOT NULL,
    C04_JOIN_DATE DATETIME NOT NULL,
    FOREIGN KEY (C04_EMPLOYEES_ID) REFERENCES T02_EMPLOYEES(C02_EMPLOYEES_ID),
    FOREIGN KEY (C04_PROJECT_ID) REFERENCES T03_PROJECT(C03_PROJECT_ID)
);


CREATE TABLE T05_EMPLOYEE_PROJECT (
    C05_EMPLOYEES_ID INT NOT NULL,
    C05_PROJECT_ID INT NOT NULL,
    C05_HOURS_WORKED DECIMAL(10, 2) NOT NULL DEFAULT 0,
    PRIMARY KEY (C05_EMPLOYEES_ID, C05_PROJECT_ID),
    FOREIGN KEY (C05_EMPLOYEES_ID) REFERENCES T02_EMPLOYEES(C02_EMPLOYEES_ID),
    FOREIGN KEY (C05_PROJECT_ID) REFERENCES T03_PROJECT(C03_PROJECT_ID)
);

SET FOREIGN_KEY_CHECKS = 0;


SET FOREIGN_KEY_CHECKS = 1;



-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
INSERT INTO T01_PHONGBAN (C01_DEPARTMENT_ID, C01_DEPARTMENT_NAME, C01_MANAGER_ID, C01_START_DATE) VALUES
(1, 'Nhân sự', 1, '2020-01-01'),
(2, 'Kỹ thuật', 2, '2021-03-10'),
(3, 'Marketing', 3, '2019-06-15'),
(4, 'Tài chính', 4, '2022-07-20'),
(5, 'CNTT', 5, '2020-09-05');


INSERT INTO T02_EMPLOYEES (C02_EMPLOYEES_ID, C02_NAME, C02_ADDRESS, C02_SALARY, C02_GENDER, C02_DAY_OF_BIRTH, C02_HIRE_DATE, C02_DEPARTMENT_ID, C02_SUPERVISOR_ID) VALUES
(1, 'Nguyễn Văn An', '123 Đường Láng, Hà Nội', 15000000, 'M', '1985-03-15', '2010-06-01', 1, NULL),
(2, 'Trần Thị Bình', '45 Nguyễn Huệ, TP.HCM', 20000000, 'F', '1990-07-22', '2012-09-15', 2, 1),
(3, 'Lê Văn Cường', '78 Trần Phú, Đà Nẵng', 18000000, 'M', '1988-11-10', '2015-03-20', 2, 1),
(4, 'Phạm Thị Dung', '56 Lê Lợi, Hà Nội', 22000000, 'F', '1992-05-05', '2013-12-10', 3, 2),
(5, 'Hoàng Văn Em', '89 CMT8, TP.HCM', 17000000, 'M', '1987-09-30', '2011-08-05', 4, 2);




INSERT INTO T03_PROJECT (C03_PROJECT_ID, C03_PROJECT_NAME, C03_START_DATE, C03_END_DATE, C03_REVENUE, C03_MANAGER_ID) VALUES
(1, 'Dự án Web', '2023-01-01', '2023-12-31', 500000000, 1),
(2, 'Dự án Mobile', '2023-03-15', '2024-03-15', 750000000, 2),
(3, 'Dự án App', '2024-01-01', NULL, 300000000, 3),
(4, 'Dự án Tool', '2022-06-01', '2023-06-01', 600000000, 4),
(5, 'Dự án Hack', '2023-09-01', '2024-09-01', 400000000, 5);


INSERT INTO T05_EMPLOYEE_PROJECT (C05_EMPLOYEES_ID, C05_PROJECT_ID, C05_HOURS_WORKED) VALUES
(1, 1, 100.50),
(2, 1, 200.00),
(2, 4, 150.00),
(3, 2, 180.00),
(4, 3, 120.00);


INSERT INTO T04_MANAGEMENT_PROJECT (C04_EMPLOYEES_ID, C04_PROJECT_ID, C04_JOIN_DATE) VALUES
(1, 1, '2023-01-10 09:00:00'),
(2, 1, '2023-01-15 10:30:00'),
(2, 4, '2022-06-10 14:00:00'),
(3, 2, '2023-03-20 08:45:00'),
(4, 3, '2024-01-05 11:15:00');
-- Phần C. Thực hiện truy vấn
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT C03_PROJECT_ID, C03_PROJECT_NAME, C03_START_DATE, C03_END_DATE, C03_REVENUE
FROM T03_PROJECT
WHERE YEAR(C03_START_DATE) = 2023 AND C03_REVENUE > 12345000;
-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
SELECT t02.C02_EMPLOYEES_ID, t02.C02_NAME, t05.C05_PROJECT_ID, t03.C03_PROJECT_NAME, t05.C05_HOURS_WORKED
FROM T02_EMPLOYEES t02
JOIN T05_EMPLOYEE_PROJECT t05 ON t02.C02_EMPLOYEES_ID = t05.C05_EMPLOYEES_ID
JOIN T03_PROJECT t03 ON t05.C05_PROJECT_ID = t03.C03_PROJECT_ID
WHERE EXISTS (
    SELECT 1
    FROM T05_EMPLOYEE_PROJECT t05
    WHERE t05.C05_EMPLOYEES_ID = t02.C02_EMPLOYEES_ID
    GROUP BY t05.C05_EMPLOYEES_ID
    HAVING SUM(t05.C05_HOURS_WORKED) > 200
)
ORDER BY t02.C02_EMPLOYEES_ID, t05.C05_PROJECT_ID;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
SELECT t02.C02_EMPLOYEES_ID, t02.C02_NAME, t02.C02_SALARY, 
       t02_2.C02_EMPLOYEES_ID AS SupervisorID, t02_2.C02_NAME AS SupervisorName, t02_2.C02_SALARY AS SupervisorSalary
FROM T02_EMPLOYEES t02
JOIN T02_EMPLOYEES t02_2 ON t02.C02_SUPERVISOR_ID = t02_2.C02_EMPLOYEES_ID
WHERE t02.C02_SALARY >= t02_2.C02_SALARY;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
SELECT t01.C01_DEPARTMENT_ID, t01.C01_DEPARTMENT_NAME, COUNT(t02.C02_EMPLOYEES_ID) AS EmployeeCount
FROM T01_PHONGBAN t01
LEFT JOIN T02_EMPLOYEES t02 ON t01.C01_DEPARTMENT_ID = t02.C02_DEPARTMENT_ID
GROUP BY t01.C01_DEPARTMENT_ID, t01.C01_DEPARTMENT_NAME
HAVING COUNT(t02.C02_EMPLOYEES_ID) > 1;
-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT C02_EMPLOYEES_ID, C02_NAME, C02_HIRE_DATE, DATEDIFF(CURDATE(), C02_HIRE_DATE) / 365 AS YearsOfService
FROM T02_EMPLOYEES
WHERE DATEDIFF(CURDATE(), C02_HIRE_DATE) / 365 > 10;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT DISTINCT t02.C02_EMPLOYEES_ID, t02.C02_NAME
FROM T02_EMPLOYEES t02
JOIN T01_PHONGBAN t01 ON t01.C01_MANAGER_ID = t02.C02_EMPLOYEES_ID
JOIN T03_PROJECT t03 ON t03.C03_MANAGER_ID = t02.C02_EMPLOYEES_ID;
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT t02.C02_EMPLOYEES_ID, t02.C02_NAME, COUNT(t03.C03_PROJECT_ID) AS ProjectCount
FROM T02_EMPLOYEES t02
JOIN T03_PROJECT t03 ON t03.C03_MANAGER_ID = t02.C02_EMPLOYEES_ID
GROUP BY t02.C02_EMPLOYEES_ID, t02.C02_NAME
HAVING COUNT(t03.C03_PROJECT_ID) > 1;

INSERT INTO T03_PROJECT (C03_PROJECT_ID, C03_PROJECT_NAME, C03_START_DATE, C03_END_DATE, C03_REVENUE, C03_MANAGER_ID) VALUES
(6, 'Dự án Cafe', '2023-10-01', '2024-10-01', 200000000, 2);
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật

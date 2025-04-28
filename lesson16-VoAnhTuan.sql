-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên
DROP DATABASE IF EXISTS CompanyDB;
CREATE DATABASE CompanyDB;
USE CompanyDB;

-- T02_Employees
CREATE TABLE T02_Employees (
    EmployeeID INT AUTO_INCREMENT,
    FullName NVARCHAR(255) NOT NULL,
    Address NVARCHAR(255),
    Salary DECIMAL(10, 2) NOT NULL CHECK (Salary >= 0),
    Gender ENUM('Male', 'Female', 'Other') NOT NULL,
    BirthDate DATE NOT NULL,
    HireDate DATE NOT NULL,
    DepartmentID INT NOT NULL,
    ManagerID INT,
    PRIMARY KEY (EmployeeID),
    CONSTRAINT UC_EmployeeID UNIQUE (EmployeeID),
    CONSTRAINT FK_T02_T02_Manager FOREIGN KEY (ManagerID) REFERENCES T02_Employees(EmployeeID)
);

-- T01_Departments
CREATE TABLE T01_Departments (
    DepartmentID INT AUTO_INCREMENT,
    DepartmentName NVARCHAR(255) NOT NULL,
    ManagerID INT,
    StartDate DATE NOT NULL,
    PRIMARY KEY (DepartmentID),
    CONSTRAINT UC_DepartmentName UNIQUE (DepartmentName),
    CONSTRAINT FK_T01_T02_Manager FOREIGN KEY (ManagerID) REFERENCES T02_Employees(EmployeeID)
);

-- T03_Projects
CREATE TABLE T03_Projects (
    ProjectID INT AUTO_INCREMENT,
    ProjectName NVARCHAR(255) NOT NULL,
    StartDate DATE NOT NULL,
    EndDate DATE,
    Revenue DECIMAL(15, 2) NOT NULL CHECK (Revenue >= 0),
    PRIMARY KEY (ProjectID),
    CONSTRAINT UC_ProjectName UNIQUE (ProjectName)
);

-- T04_Employee_Project
CREATE TABLE T04_Employee_Project (
    EmployeeID INT,
    ProjectID INT,
    HoursWorked DECIMAL(10, 2) NOT NULL CHECK (HoursWorked >= 0),
    PRIMARY KEY (EmployeeID, ProjectID),
    CONSTRAINT FK_T04_T02_Employee FOREIGN KEY (EmployeeID) REFERENCES T02_Employees(EmployeeID),
    CONSTRAINT FK_T04_T03_Project FOREIGN KEY (ProjectID) REFERENCES T03_Projects(ProjectID)
);

-- T05_Project_Manager
CREATE TABLE T05_Project_Manager (
    ProjectID INT,
    ManagerID INT,
    PRIMARY KEY (ProjectID),
    CONSTRAINT FK_T05_T03_Project FOREIGN KEY (ProjectID) REFERENCES T03_Projects(ProjectID),
    CONSTRAINT FK_T05_T02_Manager FOREIGN KEY (ManagerID) REFERENCES T02_Employees(EmployeeID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu


INSERT INTO T02_Employees (FullName, Address, Salary, Gender, BirthDate, HireDate, DepartmentID, ManagerID)
VALUES ('Nguyen Thi Lan', '123 Nguyen Trai, Ha Noi', 5000.00, 'Female', '1985-06-15', '2010-01-10', 1, NULL);
INSERT INTO T02_Employees (FullName, Address, Salary, Gender, BirthDate, HireDate, DepartmentID, ManagerID)
VALUES
    ('Tran Minh Tu', '456 Le Lai, Ho Chi Minh City', 6000.00, 'Male', '1990-08-25', '2015-03-20', 2, 1),
    ('Pham Quoc Duy', '789 Pham Ngoc Thach, Da Nang', 5500.00, 'Male', '1992-12-05', '2018-07-15', 3, 1),
    ('Bui Thanh Son', '101 Hai Ba Trung, Ha Noi', 4500.00, 'Male', '1988-11-30', '2017-04-18', 4, 1),
    ('Le Minh Tuong', '202 Tan Phu, Ho Chi Minh City', 7000.00, 'Female', '1983-05-20', '2012-02-25', 5, 1);

-- Tạo dữ liệu kiểm thử cho bảng T01_Departments (Phòng ban)
INSERT INTO T01_Departments (DepartmentName, ManagerID, StartDate)
VALUES
    ('Nhân sự', 3, '2020-01-01'),
    ('Công nghệ thông tin', 5, '2019-06-15'),
    ('Kinh doanh', 1, '2021-03-25'),
    ('Marketing', 4, '2020-11-01'),
    ('Tài chính', 2, '2022-02-20');

-- Tạo dữ liệu kiểm thử cho bảng T03_Projects (Dự án)
INSERT INTO T03_Projects (ProjectName, StartDate, EndDate, Revenue)
VALUES
    ('Nâng cấp hệ thống nhân sự', '2020-05-01', '2020-12-01', 200000.00),
    ('Thiết kế lại website', '2024-06-15', '2024-10-30', 150000.00),
    ('Ra mắt sản phẩm mới', '2023-01-10', '2023-05-15', 300000.00),
    ('Chiến dịch marketing', '2022-08-01', '2022-12-15', 100000.00),
    ('Hệ thống báo cáo tài chính', '2022-02-01', '2022-06-30', 250000.00);

-- Tạo dữ liệu kiểm thử cho bảng T04_Employee_Project (Nhân viên tham gia dự án)
INSERT INTO T04_Employee_Project (EmployeeID, ProjectID, HoursWorked)
VALUES
    (1, 4, 150.00),
    (2, 2, 180.00),
    (3, 5, 200.00),
    (4, 3, 120.00),
    (5, 1, 160.00);

-- Tạo dữ liệu kiểm thử cho bảng T05_Project_Manager (Quản lý dự án)
INSERT INTO T05_Project_Manager (ProjectID, ManagerID)
VALUES
    (1, 4),
    (2, 1),
    (3, 2),
    (4, 3),
    (5, 5);

-- khóa ngoại FK_T02_T01_Department
ALTER TABLE T02_Employees
    ADD CONSTRAINT FK_T02_T01_Department FOREIGN KEY (DepartmentID) REFERENCES T01_Departments(DepartmentID);

-- Xem dữ liệu có trong các bảng
SELECT * FROM T01_Departments;
SELECT * FROM T02_Employees;
SELECT * FROM T03_Projects;
SELECT * FROM T04_Employee_Project;
SELECT * FROM T05_Project_Manager;

-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
	-- Thêm dữ liệu để test
INSERT INTO T03_Projects (ProjectName, StartDate, EndDate, Revenue)
VALUES
	('Hệ thống bay', '2021-03-01', '2021-04-05', '70000000.00');
    
	-- Câu lệnh
SELECT * 
FROM T03_Projects
WHERE YEAR(StartDate) = 2021 AND Revenue > 1500000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*? giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia
SELECT E.FullName, P.ProjectName, EP.HoursWorked
FROM T04_Employee_Project EP
JOIN T02_Employees E ON EP.EmployeeID = E.EmployeeID
JOIN T03_Projects P ON EP.ProjectID = P.ProjectID
WHERE EP.HoursWorked > 150;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó
SELECT E.FullName, E.Salary AS EmployeeSalary, M.FullName AS ManagerName, M.Salary AS ManagerSalary
FROM T02_Employees E
JOIN T02_Employees M ON E.ManagerID = M.EmployeeID
WHERE E.Salary >= M.Salary;

-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*
	-- Thêm nhân viên vào phòng ban 'Test Department'
INSERT INTO T02_Employees (FullName, Address, Salary, Gender, BirthDate, HireDate, DepartmentID, ManagerID)
VALUES
    ('Employee 1', 'Address 1', 4500.00, 'Male', '1990-01-01', '2015-05-10', 5, 1), 
    ('Employee 2', 'Address 2', 5000.00, 'Female', '1992-02-02', '2016-06-15', 5, 1), 
    ('Employee 3', 'Address 3', 5500.00, 'Male', '1993-03-03', '2017-07-20', 5, 1);
	
    -- Câu lệnh
SELECT D.DepartmentName, COUNT(E.EmployeeID) AS EmployeeCount
FROM T01_Departments D
JOIN T02_Employees E ON D.DepartmentID = E.DepartmentID
GROUP BY D.DepartmentName
HAVING COUNT(E.EmployeeID) > 2;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
SELECT FullName, DATEDIFF(CURRENT_DATE, HireDate) / 365 AS YearsWorked
FROM T02_Employees
WHERE DATEDIFF(CURRENT_DATE, HireDate) / 365 > 5;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
SELECT E.FullName
FROM T02_Employees E
JOIN T01_Departments D ON E.EmployeeID = D.ManagerID
JOIN T05_Project_Manager PM ON E.EmployeeID = PM.ManagerID;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT E.FullName, COUNT(PM.ProjectID) AS ProjectCount
FROM T02_Employees E
JOIN T05_Project_Manager PM ON E.EmployeeID = PM.ManagerID
GROUP BY E.EmployeeID
HAVING COUNT(PM.ProjectID) > 1;

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để biết nhân viên đó tham gia vào dự án vào thời gian nào.
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi nào, số giờ tham gia cũ, số giờ tham gia mới.
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật.
-- Tạo bảng log
CREATE TABLE T06_Employee_Project_Log (
    LogID INT AUTO_INCREMENT,
    EmployeeID INT,
    ProjectID INT,
    OldHoursWorked DECIMAL(10, 2),
    NewHoursWorked DECIMAL(10, 2),
    UpdateDate DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (LogID),
    CONSTRAINT FK_T06_Employee FOREIGN KEY (EmployeeID) REFERENCES T02_Employees(EmployeeID),
    CONSTRAINT FK_T06_Project FOREIGN KEY (ProjectID) REFERENCES T03_Projects(ProjectID)
);

-- Trigger để ghi log khi nhân viên tham gia vào dự án (thêm mới)
DELIMITER //
CREATE TRIGGER log_employee_project_add
AFTER INSERT ON T04_Employee_Project
FOR EACH ROW
BEGIN
    INSERT INTO T06_Employee_Project_Log (EmployeeID, ProjectID, OldHoursWorked, NewHoursWorked)
    VALUES (NEW.EmployeeID, NEW.ProjectID, 0, NEW.HoursWorked);  -- Giả sử khi mới thêm, OldHoursWorked là 0
END;
//
DELIMITER ;

-- Trigger để ghi log khi số giờ tham gia dự án được cập nhật
DELIMITER //
CREATE TRIGGER log_employee_project_update
AFTER UPDATE ON T04_Employee_Project
FOR EACH ROW
BEGIN
    -- Chèn log mới vào bảng T06_Employee_Project_Log
    INSERT INTO T06_Employee_Project_Log (EmployeeID, ProjectID, OldHoursWorked, NewHoursWorked)
    VALUES (NEW.EmployeeID, NEW.ProjectID, OLD.HoursWorked, NEW.HoursWorked);  -- Lưu giờ cũ và giờ mới
END;
//
DELIMITER ;

-- Thêm dữ liệu vào bảng T04_Employee_Project
INSERT INTO T04_Employee_Project (EmployeeID, ProjectID, HoursWorked)
VALUES (1, 4, 150.00);

-- Cập nhật số giờ tham gia của nhân viên vào dự án
UPDATE T04_Employee_Project
SET HoursWorked = 180.00
WHERE EmployeeID = 1 AND ProjectID = 4;

-- Xem các log đã lưu
SELECT * FROM T06_Employee_Project_Log;



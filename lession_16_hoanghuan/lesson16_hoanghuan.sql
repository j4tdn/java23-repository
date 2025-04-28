-- CREATE DATABASE companymanagement;
-- USE companymanagement;


CREATE TABLE DEPARTMENT (
    DeptID VARCHAR(10) PRIMARY KEY,
    DeptName VARCHAR(50) NOT NULL UNIQUE,
    ManagerID VARCHAR(10),
    StartDate DATE
);

CREATE TABLE EMPLOYEE (
    EmpID VARCHAR(10) PRIMARY KEY,
    FullName VARCHAR(50) NOT NULL,
    Address VARCHAR(100),
    Salary DECIMAL(15,2),
    Gender CHAR(1) CHECK (Gender IN ('M', 'F')),
    BirthDate DATE,
    HireDate DATE,
    DeptID VARCHAR(10) NOT NULL,
    SupervisorID VARCHAR(10),
    FOREIGN KEY (DeptID) REFERENCES DEPARTMENT(DeptID),
    FOREIGN KEY (SupervisorID) REFERENCES EMPLOYEE(EmpID)
);

ALTER TABLE DEPARTMENT
ADD CONSTRAINT FK_Manager_Employee
FOREIGN KEY (ManagerID) REFERENCES EMPLOYEE(EmpID);

CREATE TABLE PROJECT (
    ProjectID VARCHAR(10) PRIMARY KEY,
    ProjectName VARCHAR(100) NOT NULL UNIQUE,
    StartDate DATE,
    EndDate DATE,
    Revenue DECIMAL(20,2),
    ProjectManagerID VARCHAR(10) NOT NULL,
    FOREIGN KEY (ProjectManagerID) REFERENCES EMPLOYEE(EmpID)
);

CREATE TABLE ASSIGNMENT (
    EmpID VARCHAR(10),
    ProjectID VARCHAR(10),
    WorkHours DECIMAL(10,2) NOT NULL,
    PRIMARY KEY (EmpID, ProjectID),
    FOREIGN KEY (EmpID) REFERENCES EMPLOYEE(EmpID),
    FOREIGN KEY (ProjectID) REFERENCES PROJECT(ProjectID)
);

ALTER TABLE PROJECT
ADD CONSTRAINT CHK_ProjectDates CHECK (EndDate IS NULL OR EndDate >= StartDate);

ALTER TABLE DEPARTMENT
ADD CONSTRAINT CHK_Manager_StartDate CHECK (StartDate IS NOT NULL);


-- ADD SAMPLE DATA

INSERT INTO DEPARTMENT (DeptID, DeptName, StartDate) VALUES
('P001', 'Phong Nhan Su', '2020-01-15'),
('P002', 'Phong CNTT', '2020-02-10'),
('P003', 'Phong Ke Toan', '2020-03-20');

INSERT INTO EMPLOYEE (EmpID, FullName, Address, Salary, Gender, BirthDate, HireDate, DeptID, SupervisorID) VALUES

('NV001', 'Hoang Huan', 'Hai Chau, Da Nang', 15000000.00, 'M', '1985-05-15', '2020-01-15', 'P001', NULL),
('NV002', 'Phan Ngoc Quyen', 'Lien Chieu, Da Nang', 12000000.00, 'F', '1990-08-22', '2020-03-10', 'P001', 'NV001'),


('NV003', 'Le Nam', 'Thanh Khe, Da Nang', 18000000.00, 'M', '1982-11-30', '2020-02-10', 'P002', NULL),
('NV004', 'Huu Tin', 'Son Tra, Da Nang', 15500000.00, 'M', '1988-02-18', '2020-04-05', 'P002', 'NV003'),


('NV005', 'Tran Minh Tuan', 'Ngu Hanh Son, Da Nang', 16000000.00, 'M', '1980-07-22', '2020-03-20', 'P003', NULL),
('NV006', 'Nguyen Thi Ha', 'Cam Le, Da Nang', 13500000.00, 'F', '1992-04-10', '2020-05-15', 'P003', 'NV005');

UPDATE DEPARTMENT SET ManagerID = 'NV001' WHERE DeptID = 'P001';
UPDATE DEPARTMENT SET ManagerID = 'NV003' WHERE DeptID = 'P002';
UPDATE DEPARTMENT SET ManagerID = 'NV005' WHERE DeptID = 'P003';

ALTER TABLE DEPARTMENT
ADD CONSTRAINT FK_Manager_Employee
FOREIGN KEY (ManagerID) REFERENCES EMPLOYEE(EmpID);

ALTER TABLE DEPARTMENT
ADD CONSTRAINT FK_Manager_Employee
FOREIGN KEY (ManagerID) REFERENCES EMPLOYEE(EmpID);


INSERT INTO PROJECT (ProjectID, ProjectName, StartDate, EndDate, Revenue, ProjectManagerID) VALUES
('DA001', 'He thong quan ly nhan su', '2023-01-10', '2023-06-30', 500000000.00, 'NV003'),
('DA002', 'Website thuong mai dien tu', '2023-02-15', NULL, 750000000.00, 'NV003'),
('DA003', 'Ung dung ke toan tai chinh', '2023-03-01', '2023-08-15', 600000000.00, 'NV005'),
('DA004', 'Dao tao nhan vien moi', '2023-04-10', '2023-07-20', 250000000.00, 'NV001');

INSERT INTO ASSIGNMENT (EmpID, ProjectID, WorkHours) VALUES
('NV001', 'DA001', 80.5),
('NV002', 'DA001', 120.0),
('NV003', 'DA001', 200.0),
('NV004', 'DA001', 180.0),
('NV003', 'DA002', 150.0),
('NV004', 'DA002', 220.0),
('NV002', 'DA002', 50.0),
('NV005', 'DA003', 180.0),
('NV006', 'DA003', 200.0),
('NV003', 'DA003', 60.0),
('NV001', 'DA004', 120.0),
('NV002', 'DA004', 150.0),
('NV006', 'DA004', 40.0);



-- SELECT QUERY

INSERT INTO DEPARTMENT (DeptID, DeptName, StartDate) VALUES
('P001', 'Phong Nhan Su', '2020-01-15'),
('P002', 'Phong CNTT', '2020-02-10'),
('P003', 'Phong Ke Toan', '2020-03-20');

INSERT INTO EMPLOYEE (EmpID, FullName, Address, Salary, Gender, BirthDate, HireDate, DeptID, SupervisorID) VALUES

('NV001', 'Hoang Huan', 'Hai Chau, Da Nang', 15000000.00, 'M', '1985-05-15', '2020-01-15', 'P001', NULL),
('NV002', 'Phan Ngoc Quyen', 'Lien Chieu, Da Nang', 12000000.00, 'F', '1990-08-22', '2020-03-10', 'P001', 'NV001'),


('NV003', 'Le Nam', 'Thanh Khe, Da Nang', 18000000.00, 'M', '1982-11-30', '2020-02-10', 'P002', NULL),
('NV004', 'Huu Tin', 'Son Tra, Da Nang', 15500000.00, 'M', '1988-02-18', '2020-04-05', 'P002', 'NV003'),


('NV005', 'Tran Minh Tuan', 'Ngu Hanh Son, Da Nang', 16000000.00, 'M', '1980-07-22', '2020-03-20', 'P003', NULL),
('NV006', 'Nguyen Thi Ha', 'Cam Le, Da Nang', 13500000.00, 'F', '1992-04-10', '2020-05-15', 'P003', 'NV005');

UPDATE DEPARTMENT SET ManagerID = 'NV001' WHERE DeptID = 'P001';
UPDATE DEPARTMENT SET ManagerID = 'NV003' WHERE DeptID = 'P002';
UPDATE DEPARTMENT SET ManagerID = 'NV005' WHERE DeptID = 'P003';

ALTER TABLE DEPARTMENT
ADD CONSTRAINT FK_Manager_Employee
FOREIGN KEY (ManagerID) REFERENCES EMPLOYEE(EmpID);

ALTER TABLE DEPARTMENT
ADD CONSTRAINT FK_Manager_Employee
FOREIGN KEY (ManagerID) REFERENCES EMPLOYEE(EmpID);


INSERT INTO PROJECT (ProjectID, ProjectName, StartDate, EndDate, Revenue, ProjectManagerID) VALUES
('DA001', 'He thong quan ly nhan su', '2023-01-10', '2023-06-30', 500000000.00, 'NV003'),
('DA002', 'Website thuong mai dien tu', '2023-02-15', NULL, 750000000.00, 'NV003'),
('DA003', 'Ung dung ke toan tai chinh', '2023-03-01', '2023-08-15', 600000000.00, 'NV005'),
('DA004', 'Dao tao nhan vien moi', '2023-04-10', '2023-07-20', 250000000.00, 'NV001');

INSERT INTO ASSIGNMENT (EmpID, ProjectID, WorkHours) VALUES
('NV001', 'DA001', 80.5),
('NV002', 'DA001', 120.0),
('NV003', 'DA001', 200.0),
('NV004', 'DA001', 180.0),
('NV003', 'DA002', 150.0),
('NV004', 'DA002', 220.0),
('NV002', 'DA002', 50.0),
('NV005', 'DA003', 180.0),
('NV006', 'DA003', 200.0),
('NV003', 'DA003', 60.0),
('NV001', 'DA004', 120.0),
('NV002', 'DA004', 150.0),
('NV006', 'DA004', 40.0);



SET FOREIGN_KEY_CHECKS=0;

INSERT INTO t01_department(C01_DEPARTMENT_NAME) VALUES
('Phòng Giám Đốc'),
('Phòng Quản Lý Nhân Sự'),
('Phòng Kỹ Thuật'),
('Phòng Nghiên Cứu'),
('Phòng IT Admin');

INSERT INTO t02_project(C02_PROJECT_NAME,C02_START_DATE,C02_END_DATE,C02_REVENUE,C02_PROJECT_LEAD_ID) VALUES
('PR1', '2020-10-18', '2024-08-22', 62850, 1),
('PR2', '2021-11-12', '2022-08-22', 11220, 2),
('PR3', '2022-06-17', '2023-08-22', 5200, 3),
('PR4', '2023-01-29', null, 82850, 2),
('PR5', '2024-04-10', '2024-08-22', 77000, 4);

INSERT INTO t03_employee(C03_EMPLOYEE_NAME,C03_EMPLOYEE_ADDRESS,C03_SALARY,C03_GENDER,C03_DATE_OF_BIRTH,C03_STARTED_AT,C03_DEPARTMENT_ID,C03_MANAGER_ID) VALUES
('Lê A', 'Địa chỉ 1', 4000, 0, '2000-11-20', '2023-08-12', 1, null),
('Lê B', 'Địa chỉ 2', 2000, 0, '2001-12-22', '2023-08-12', 2, 1),
('Lê C', 'Địa chỉ 3', 3000, 0, '2002-10-23', '2023-08-12', 2, 1),
('Lê D', 'Địa chỉ 4', 6000, 0, '1998-10-24', '2023-08-12', 3, 2),
('Lê E', 'Địa chỉ 5', 1000, 0, '2003-10-25', '2023-08-12', 3, 3),
('Lê F', 'Địa chỉ 6', 8000, 0, '2000-12-22', '2023-08-12', 4, 8),
('Lê G', 'Địa chỉ 7', 1200, 0, '2005-11-15', '2023-08-12', 5, 5),
('Lê H', 'Địa chỉ 8', 3400, 0, '1990-10-18', '2023-08-12', 4, null);


INSERT INTO t04_project_management(C04_PROJECT_ID,C04_EMPLOYEE_ID,C04_WORKING_HOURS) VALUES
(1, 1, 120), (1, 2, 140), (1, 3, 160), (1, 4, 120),
(2, 3, 130), (2, 5, 150), (2, 7, 120), (2, 8, 120),
(3, 4, 110), (3, 2, 120), (3, 5, 120), (3, 3, 120),
(4, 2, 10), (4, 5, 12), (4, 7, 120), (4, 8, 120),
(5, 1, 20), (5, 3, 14), (5, 5, 120), (5, 8, 120);


INSERT INTO t05_department_manager(C05_DEPARTMENT_ID, C05_MANAGER_ID, C05_STARTED_AT) VALUES
(1, 1, '2023-08-12'),
(2, 1, '2023-09-13'),
(3, 8, '2023-08-14'),
(4, 2, '2023-10-15'),
(5, 3, '2023-11-16');


SET FOREIGN_KEY_CHECKS=1;
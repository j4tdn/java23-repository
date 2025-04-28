CREATE DATABASE lesson16_exam;
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

CREATE TABLE T01_DEPARTMENT(
	C01_DEPARTMENT_ID INT PRIMARY KEY,
    C01_DEPARTMENT_NAME VARCHAR(255) NOT NULL ,
    C01_STAFF_ID INT NOT NULL,
    C01_START_DATE_WORKING DATE NOT NULL,
    CONSTRAINT FK_T01_T02 FOREIGN KEY (C01_STAFF_ID) REFERENCES T02_STAFF(C02_STAFF_ID)
);
DROP TABLE T02_STAFF;
CREATE TABLE T02_STAFF(
	C02_STAFF_ID INT PRIMARY KEY,
    C02_STAFF_NAME VARCHAR(225) NOT NULL,
    C02_STAFF_ADDRESS VARCHAR(225) NOT NULL,
    C02_STAFF_WAGE DECIMAL(15,2) NOT NULL,
    C02_STAFF_GENDER BIT(1) NOT NULL,
    C02_STAFF_DOB DATE NOT NULL,
    C02_START_DATE_WORKING DATE,
    C02_ROLE_ID INT NOT NULL,
    CONSTRAINT FK_T02_T04 FOREIGN KEY (C02_ROLE_ID) REFERENCES T04_ROLE(C04_ROLE_ID)
);
CREATE TABLE T03_PROJECT(
	C03_PROJECT_ID INT PRIMARY KEY,
    C03_PROJECT_NAME VARCHAR(255) NOT NULL ,
    C03_STAFF_ID INT NOT NULL,
    C03_PROJECT_REVENUE DECIMAL(20,2) NOT NULL,
    C03_PROJECT_START DATE NOT NULL,
    C03_PROJECT_END DATE NOT NULL,
    CONSTRAINT FK_T03_T02 FOREIGN KEY (C03_STAFF_ID) REFERENCES T02_STAFF(C02_STAFF_ID)
    
);
CREATE TABLE T04_ROLE(
	C04_ROLE_ID INT PRIMARY KEY,
    C05_ROLE_NAME VARCHAR(255) NOT NULL 
);
ALTER TABLE T04_ROLE RENAME COLUMN C05_ROLE_NAME TO C04_ROLE_NAME;
CREATE TABLE T05_PARTICIPANTS(
	C05_PROJECT_ID INT NOT NULL,
    C05_STAFF_ID INT NOT NULL,
    C05_HOUR_WORK DECIMAL(5,2),
	CONSTRAINT FK_T05_T02 FOREIGN KEY (C05_STAFF_ID) REFERENCES T02_STAFF(C02_STAFF_ID),
	CONSTRAINT FK_T05_T03 FOREIGN KEY (C05_PROJECT_ID) REFERENCES T03_PROJECT(C03_PROJECT_ID)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án
SET FOREIGN_KEY_CHECKS = 0;
TRUNCATE TABLE t02_staff;
INSERT INTO T04_ROLE (C04_ROLE_ID, C04_ROLE_NAME) VALUES
(1, 'Business Analyst'),
(2, 'HR'),
(3, ' Manager'),
(4, 'Support Staff'),
(5, 'Product Owner');

INSERT INTO T02_STAFF (C02_STAFF_ID, C02_STAFF_NAME, C02_STAFF_ADDRESS, C02_STAFF_WAGE, C02_STAFF_GENDER, C02_STAFF_DOB, C02_START_DATE_WORKING, C02_ROLE_ID) 
VALUES
(1, 'Nguyen Thi E', 'Hai Phong', 1300.00, 0, '1991-04-18', '2022-05-01', 3),
(2, 'Tran Van F', 'Hue', 2200.00, 1, '1993-09-12', '2023-10-01', 2),
(3, 'Le Thi G', 'Nha Trang', 1250.00, 0, '1990-11-11', '2019-01-10', 1),
(4, 'Phan Van H', 'Vung Tau', 3350.00, 1, '1996-02-14', '2024-08-20', 5),
(5, 'Do Thi I', 'Bac Ninh', 2000.00, 0, '1992-07-07', '2020-12-01', 2);

INSERT INTO T01_DEPARTMENT (C01_DEPARTMENT_ID, C01_DEPARTMENT_NAME, C01_STAFF_ID, C01_START_DATE_WORKING)
VALUES
(1, 'Business Department', 3, '2015-05-01'),
(2, 'HR Department', 5, '2016-10-01'),
(3, 'Sales Department', 4, '2017-01-10'),
(4, 'Support Department', 2, '2019-08-20'),
(5, 'Product Department', 1, '2020-12-01');

INSERT INTO T03_PROJECT (C03_PROJECT_ID, C03_PROJECT_NAME, C03_STAFF_ID, C03_PROJECT_REVENUE, C03_PROJECT_START, C03_PROJECT_END) 
VALUES
(1, 'CRM System Upgrade', 5, 85000.00, '2019-04-01', '2022-10-31'),
(2, 'Recruitment Portal', 6, 40000.00, '2023-05-01', '2025-11-30'),
(3, 'Sales Tracking App', 7, 95000.00, '2021-02-15', '2023-08-15'),
(4, 'Customer Support Bot', 8, 30000.00, '2025-06-01', '2027-12-01'),
(5, 'New Product Launch', 9, 150000.00, '2020-01-15', '2023-07-15');

INSERT INTO T05_PARTICIPANTS (C05_PROJECT_ID, C05_STAFF_ID, C05_HOUR_WORK)
VALUES
(3, 5, 100.0),
(3, 4, 80.5),
(4, 2, 120.0),
(5, 3, 130.5),
(2, 1, 90.0);

-- Phần C. Thực hiện truy vấn
	SELECT * FROM T04_ROLE;
	SELECT * FROM T02_STAFF;
    SELECT * FROM T03_PROJECT;
    SELECT * FROM T01_DEPARTMENT;
    SELECT * FROM T05_PARTICIPANTS;
    
-- 1. Liệt kê các dự án diễn ra trong năm 2020 có số tiền thu được trên 35000.00 triệu VND
	
    SELECT * 
    FROM T03_PROJECT
    WHERE YEAR(C03_PROJECT_START) <= 2020 AND
    YEAR(C03_PROJECT_END) > 2020 AND
    C03_PROJECT_REVENUE > 35000.00;
    
-- 2. Liệt kê các nhân viên đã tham gia hơn 100 giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi
-- dự án mà nhân viên tham gia
	SELECT C02_STAFF_ID,
			C02_STAFF_NAME,
            C03_PROJECT_NAME,
            C05_HOUR_WORK
    FROM T05_PARTICIPANTS T5
    JOIN T03_PROJECT T3 
    ON T5.C05_PROJECT_ID = T3.C03_PROJECT_ID
    JOIN T02_STAFF T2 
    ON T5.C05_STAFF_ID = T2.C02_STAFF_ID
    WHERE T5.C05_HOUR_WORK > 100;
    
-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân
-- viên đó
-- 
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?*

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn 4 năm
	SELECT *,
    YEAR(curdate()) - YEAR(C02_START_DATE_WORKING)  AS SUM_YEAR_WORKING
    FROM T02_STAFF 
    WHERE YEAR(curdate()) - YEAR(C02_START_DATE_WORKING) > 4

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án
-- 
-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
-- 
-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để
-- biết nhân viên đó tham gia vào dự án vào thời gian nào
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi
-- nào, số giờ tham gia cũ, số giờ tham gia mới
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật






















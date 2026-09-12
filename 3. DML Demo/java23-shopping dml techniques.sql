SELECT * FROM t08_employee;

EXPLAIN SELECT * FROM t08_employee;

SELECT * FROM t08_employee WHERE C08_EMPLOYEE_ID = 5;

EXPLAIN SELECT * FROM t08_employee WHERE C08_EMPLOYEE_ID = 5;

SELECT * FROM t08_employee WHERE C08_EMPLOYEE_NAME = 'Nhân viên 5';

EXPLAIN SELECT * FROM t08_employee WHERE C08_EMPLOYEE_NAME = 'Nhân viên 5';

-- EXPLAIN: Dự đoán xem câu lệnh chạy thế nào
-- EXCUTION PLAN: Xem chi tiết thực tế câu lệnh chạy thế nào

-- Truy vấn theo thuộc tính ko có index thì khả năng chậm hơn
-- Có nên tạo index cho tất cả các column để speed up searching không ?
-- KHÔNG - Nên
-- 1. Giữ nguyên index của pk, fk, constraints ví dụ unique
-- 2. Tạo thêm index cho column khi column đó được sử dụng tìm kiếm nhiều trong ứng dụng
--    và bị chậm --> thêm index


-- Cơ sở dữ liệu
-- Table: T21_SALARY: C21_EMP_NUMBER, C21_VALID_FROM, C21_SALARY
-- Khi dữ liệu từ bảng T21_SALARY bị xóa, trước khi xóa, lưu dữ liệu đó vào bảng T22_SALARY_ARCHIVE
-- gồm tất cả columns bên T21_SALARY kèm người xóa, thời gian

CREATE TABLE T21_SALARY (
	 C21_EMP_NUMBER INT PRIMARY KEY,
     C21_VALID_FROM DATE NOT NULL,
     C21_SALARY DECIMAL(10, 2) NOT NULL DEFAULT 0
);

-- TEST DATA
INSERT INTO T21_SALARY(C21_EMP_NUMBER, C21_VALID_FROM, C21_SALARY) VALUES
(1028, '2018-12-20', 20000),
(1723, '2020-10-22', 22000),
(1848, '2022-11-23', 18000),
(1460, '2024-11-25', 12000);

CREATE TABLE T22_SALARY_ARCHIVE (
	 C22_EMP_NUMBER INT PRIMARY KEY,
     C22_VALID_FROM DATE,
     C22_SALARY DECIMAL(10, 2),
     C22_DELETED_BY VARCHAR(255),
     C22_DELETED_AT TIMESTAMP DEFAULT NOW()
);

DELIMITER $$

CREATE TRIGGER BEFORE_SALARY_DELETE
BEFORE DELETE
ON T21_SALARY FOR EACH ROW
BEGIN
	INSERT INTO T22_SALARY_ARCHIVE(C22_EMP_NUMBER, C22_VALID_FROM, C22_SALARY, C22_DELETED_BY)
    VALUES(OLD.C21_EMP_NUMBER, OLD.C21_VALID_FROM, OLD.C21_SALARY, current_user());
END $$

SELECT * FROM T21_SALARY;
SELECT * FROM T22_SALARY_ARCHIVE;

DELETE FROM T21_SALARY WHERE C21_EMP_NUMBER = 1848;

CREATE VIEW V_EXPORT_BILLS
AS
SELECT t16.C16_ORDER_ID ORDER_ID,
       group_concat(concat(t01.C01_ITEM_NAME, ',', t03.C03_SIZE_ID, ',', t03.C03_SALES_PRICE, ',', t16.C16_AMOUNT) SEPARATOR ':') ITEM_DETAILS,
       SUM(t03.C03_SALES_PRICE * t16.C16_AMOUNT) TOTAL_OF_MONEY
  FROM t01_item t01
  JOIN t03_item_detail t03 ON t03.C03_ITEM_ID = t01.C01_ITEM_ID
  JOIN t16_order_detail t16 ON t16.C16_ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID
 GROUP BY t16.C16_ORDER_ID;
 
SELECT * FROM V_EXPORT_BILLS;








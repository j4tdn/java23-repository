-- DEVELOPER

-- QA/TESTER
-- Tạo dữ liệu kiểm thử, test data
-- -- Dùng excel, txt
-- -- Sử dụng sql để import data từ excel, txt hoặc dùng lệnh sql chạy tạo data
-- -- Giúp xóa hết data rác, thêm lại data chuẩn bị để trình bày dự án

-- draft
SET FOREIGN_KEY_CHECKS = 0; -- disable fk
SET FOREIGN_KEY_CHECKS = 1; -- enable fk

-- TRUNCATE xóa hết dât trong table, k hỗ trợ điều kiện
-- Yêu cầu: nếu table hiện tại bị tham chiếu bởi table khác, không cho truncate (k quan tâm dữ liệu)
--        : bắt buộc disalbe fk check
-- Reset auto_increment value về 1 khi truncate thành công
-- Dùng nó khi xóa toàn bộ data test
TRUNCATE TABLE T01_ITEM;
TRUNCATE TABLE T02_SIZE;
TRUNCATE TABLE T03_ITEM_DETAIL;
TRUNCATE TABLE T04_ITEM_GROUP;

-- DELETE xóa hết dât trong table, hoặc kèm điều kiện
-- Bắt lỗi khi xóa data ở bảng cha, dữ liệu còn bị tham chiếu ở bảng con
DELETE FROM T01_ITEM;
DELETE FROM T04_ITEM_GROUP;

SELECT * FROM T01_ITEM;
SELECT * FROM T04_ITEM_GROUP;
SELECT * FROM T02_SIZE;
SELECT * FROM T03_ITEM_DETAIL;
SELECT * FROM T20_ITEM_GROUP_BACKUP;

-- INSERT
INSERT INTO T01_ITEM (C01_ITEM_NAME, C01_ITEM_GROUP_ID) VALUE
('Áo 1', 1),
('Áo 2', 1),
('Áo 3', 1),
('Quần 1', 2),
('Quần 2', 2),
('Giày 1', 3),
('Giày 2', 3),
('Giày 3', 3);

INSERT INTO T02_SIZE(C02_SIZE_ID, C02_SIZE_NAME, C02_GENDER, C02_SIZE_DESC)
VALUES(1, 'S',   1, 'Size S cho Nam - Từ 10-20 kg'),
	  (2, 'M',   1, 'Size M cho Nam - Từ 20-29 kg'),
      (3, 'L',   1, 'Size L cho Nam - Từ 30-39 kg'),
      (4, 'XL',  1, 'Size XL cho Nam - Từ 40-49 kg'),
      (5, 'XXL', 1, 'Size XXL cho Nam - Từ 50-59 kg'),
      (6, 'S',   0, 'Size S cho Nữ - Từ 10-20 kg'),
      (7, 'M',   0, 'Size M cho Nữ - Từ 20-29 kg'),
      (8, 'L',   0, 'Size L cho Nữ - Từ 30-39 kg'),
      (9, 'XL',  0, 'Size XL cho Nữ - Từ 40-49 kg'),
      (10, 'XXL', 0, 'Size XXL cho Nữ - Từ 50-59 kg');

INSERT INTO T03_ITEM_DETAIL(C03_ITEM_ID, C03_SIZE_ID, C03_COLOR, C03_SALE_PRICE, C03_AMOUNT)
VALUES(1, 1, 'RED', 88, 200),
	  (1, 2, 'BLUE', 120, 300),
      (1, 3, 'GREEN', 127, 100),
      (4, 2, 'WHITE', 420, 800),
      (4, 3, 'RED', 800, 100),
      (4, 4, 'BLUE', 125, 900),
      (4, 5, 'WHITE', 666, 600),
      (6, 1, 'WHITE', 888, 700),
      (6, 2, 'BLUE', 347, 500),
      (6, 3, 'WHITE', 123, 400),
      (6, 4, 'RED', 159, 600),
      (6, 5, 'WHITE', 789, 800);
      
INSERT INTO T04_ITEM_GROUP(C04_ITEM_GROUP_NAME) VALUE 
('Áo'),
('Quần'),
('Giày'),
('Dép');

INSERT INTO T20_ITEM_GROUP_BACKUP (C20_GROUP_ID, C20_GROUP_NAME, C20_CREATE_TIME)
SELECT C04_ITEM_GROUP_ID, C04_ITEM_GROUP_NAME, current_timestamp()
	FROM T04_ITEM_GROUP;

-- Khi tạo test data, nên chuẩn bị dữ liệu chính xác
-- Sau đó disable fk để tiện code không cần theo thứ tự

-- XÓA FK, tạo mới
ALTER TABLE T01_ITEM DROP CONSTRAINT  FK_T01_T04;
ALTER TABLE T01_ITEM
ADD CONSTRAINT FK_T01_T04 FOREIGN KEY (C01_ITEM_GROUP_ID) REFERENCES T04_ITEM_GROUP(C04_ITEM_GROUP_ID)
ON DELETE CASCADE
ON UPDATE CASCADE;

DELETE FROM T04_ITEM_GROUP WHERE C04_ITEM_GROUP_ID = 1;

-- ------------------------------------ DML SELECT ------------------------------------------------
-- 1. Câu lệnh select
SELECT * FROM t01_item;
SELECT t01_item.* FROM t01_item;
SELECT item.* FROM t01_item item;
SELECT C01_ITEM_ID,
	   C01_ITEM_NAME,
	   C01_ITEM_GROUP_ID
  FROM t01_item;

SELECT concat(C01_ITEM_ID, ' ', C01_ITEM_ID) ITEM_DESC, -- khai baos alias cho table column (khi câu lệnh có nhiều table)
	   C01_ITEM_GROUP_ID AS ITEM_GROUP_ID
  FROM t01_item;

-- Từ khóa distinct, limit (offset, rowcount) ==> LIMIT 0 rowcount = LIMIT rowcount
-- offset: vị trí bagws đầu cần lấy (zero index) - optional (default = 0)
-- rowcount: số dòng cần lấy tính từ offset
SELECT DISTINCT C01_ITEM_GROUP_ID -- distinct theo 1/N columns
  FROM t01_item;
  
SELECT * 
  FROM t01_item
LIMIT 3;

-- Phép tính trên thuộc tính
SELECT *,
	   CAST(C03_SALE_PRICE * 0.77 AS DECIMAL(10, 2)) PROMOTION_PRICE
  FROM T03_ITEM_DETAIL;

-- Mệnh đề case-when, if-elseif-else
SELECT C02_SIZE_ID,
	   C02_SIZE_NAME,
       CASE C02_GENDER
			WHEN 1 THEN 'NAM'
            ELSE 'NỮ'
	   END AS C02_GENDER, -- if else nhiều trường hợp (hỗ trợ bất kỳ điều kiện nào)
       IF(C02_GENDER = 1, 'nam', 'nữ') C02_GENDER_XY, -- toán tử 3 ngôi
       C02_SIZE_DESC
  FROM T02_SIZE;

-- Logical statement with WHERE clause
-- Liệt kê các mặt hàng chi tiết có giá bán từ 200 đến 600
SELECT * 
  FROM T03_ITEM_DETAIL
 WHERE C03_SALE_PRICE BETWEEN 200 AND 600;
 
 -- Liệt kê các mặt hàng chi tiết có size_id 1 3 5
SELECT * 
  FROM T03_ITEM_DETAIL
 WHERE C03_SIZE_ID IN (1, 3, 5);

-- IN: trường hợp tập hợp bên trong mệnh đề IN có số lượng nhiều -> gây ra các vấn đề perf hoặc không hỗ trợ
-- chuyển sang dùng mệnh đề EXISTS

-- Liệt kê các loại hàng có chứa mặt hàng
SELECT *
  FROM T04_ITEM_GROUP
 WHERE C04_ITEM_GROUP_ID IN (SELECT DISTINCT C01_ITEM_GROUP_ID FROM T01_ITEM); -- truy vấn con

SELECT *
  FROM T04_ITEM_GROUP t4
 WHERE EXISTS (SELECT * FROM T01_ITEM t1 WHERE t1.C01_ITEM_GROUP_ID = t4.C04_ITEM_GROUP_ID); -- truy vấn lống
 
SELECT DISTINCT t4.*
  FROM T04_ITEM_GROUP t4, T01_ITEM t1
 WHERE t1.C01_ITEM_GROUP_ID = t4.C04_ITEM_GROUP_ID;
 
-- Liệt kê các loại hàng chưa chứa mặt hàng
SELECT *
  FROM T04_ITEM_GROUP
 WHERE C04_ITEM_GROUP_ID NOT IN (SELECT DISTINCT C01_ITEM_GROUP_ID FROM T01_ITEM);

SELECT *
  FROM T04_ITEM_GROUP t4
 WHERE NOT EXISTS (SELECT * FROM T01_ITEM t1 WHERE t1.C01_ITEM_GROUP_ID = t4.C04_ITEM_GROUP_ID);

-- Sắp xếp
SELECT * 
  FROM T03_ITEM_DETAIL
 ORDER BY C03_COLOR ASC, C03_ITEM_ID DESC, C03_SALE_PRICE ASC;

INSERT INTO T04_ITEM_GROUP(C04_ITEM_GROUP_ID, C04_ITEM_GROUP_NAME) VALUES
(1, 'Áo'),
(2, 'Quần'),
(3, 'Giày'),
(4, 'Dép'),
(5, 'Mũ'),
(6, 'Thắt lưng'),
(7, 'Túi xách');

-- Error Code: 1452. Cannot add or update a child row: a foreign key constraint fails 
-- (`java23_shopping`.`t01_item`, CONSTRAINT `FK_REF_ITEM` FOREIGN KEY (`C01_REF_ITEM_ID`) REFERENCES `t01_item` (`C01_ITEM_ID`))	0.015 sec

INSERT INTO T01_ITEM (C01_ITEM_ID, C01_ITEM_NAME, C01_ITEM_GROUP_ID, C01_REF_ITEM_ID) VALUES
(1, 'Áo 1', 1, NULL),
(2, 'Áo 2', 1, 1),
(3, 'Áo 3', 1, 2),
(4, 'Quần 4', 2, NULL),
(5, 'Quần 5', 2, NULL),
(6, 'Giày 6', 3, NULL),
(7, 'Giày 7', 3, NULL),
(8, 'Giày 8', 3, NULL),
(9, 'Giày 9', 3, NULL),
(10, 'Giày 10', 3, 8),
(11, 'Giép 11', 4, NULL),
(12, 'Áo 12', 1, NULL),
(13, 'Giép 13', 4, NULL),
(14, 'Mũ 14', 5, NULL),
(15, 'Mũ 15', 5, NULL),
(16, 'Thắt lưng 16', 6, NULL),
(17, 'Thắt lưng 17', 6, NULL),
(18, 'Mũ 18', 5, NULL),
(19, 'Túi xách 1', 7, NULL),
(20, 'Túi xách 2', 7, 19);

-- T02_SIZE
CALL p_insert_into_size();


INSERT INTO T10_ROLE (C10_ROLE_ID, C10_ROLE_NAME) VALUES
(1, 'Nhân viên giữ xe'),
(2, 'Nhân viên giao hàng'),
(3, 'Nhân viên bán hàng'),
(4, 'Nhân viên chạy quảng cáo'),
(5, 'Quản lý 1'),
(6, 'Quản lý 2'),
(7, 'Quản lý'),
(8, 'Giám đốc');

-- T08_EMPLOYEE
CALL p_insert_into_employee();
-- update manually

-- T17_ITEM_RECEIVED_NOTE
CALL p_insert_into_item_received_note();

-- T18_ITEM_RECEIVED_NOTE_DETAIL
INSERT INTO T18_ITEM_RECEIVED_NOTE_DETAIL(C18_IRN_ID, C18_ITEM_ID, C18_AMOUNT, C18_BUY_PRICE, C18_PROVIDER_ID)
SELECT IF(C01_ITEM_ID > 10, C01_ITEM_ID - 10, C01_ITEM_ID) IRN_ID,
       C01_ITEM_ID ITEM_ID,
       elt(f_random(5), 200, 400, 580, 600, 1200) AMOUNT,
       elt(f_random(5),  88, 122, 244, 366, 150) BUY_PRICE,
       elt(f_random(5),  1, 2, 3, 4, 5) PROVIDER_ID
  FROM T01_ITEM;

-- Trường hợp 1 item, có nhiều giá
INSERT INTO T18_ITEM_RECEIVED_NOTE_DETAIL(C18_IRN_ID, C18_ITEM_ID, C18_AMOUNT, C18_BUY_PRICE, C18_PROVIDER_ID) VALUES
(3, 1, 777, 220, 2),
(6, 5, 345, 460, 3),
(9, 10, 656, 1300, 4);
  
-- T19_PROVIDER
INSERT INTO T19_PROVIDER (C19_PROVIDER_ID, C19_PROVIDER_NAME, C19_PROVIDER_TAX) VALUES  
(1, 'Nhà cung cấp A1', '12345'),  
(2, 'Nhà cung cấp A2', '23456'),  
(3, 'Nhà cung cấp A3', '34567'),  
(4, 'Nhà cung cấp A4', '72727'),  
(5, 'Nhà cung cấp A5', '28282');

-- Tìm BUY_PRICE cho từng ITEM
SELECT * FROM t17_item_received_note;
SELECT * FROM t18_item_received_note_detail;


-- 1. Tìm BUY_PRICE của phiếu nhập mới nhất cho từng mặt hàng
-- Muốn lấy giá trị của column không thuộc mệnh đề group by

-- Cách 1: Duyệt ngược lại
-- common table expression
WITH CTE_ITEM_DETAIL AS (
	SELECT t18.C18_ITEM_ID ITEM_ID,
           t17.C17_IRN_TIME IRN_TIME,
           t18.C18_BUY_PRICE BUY_PRICE
	  FROM T18_ITEM_RECEIVED_NOTE_DETAIL t18
	  JOIN T17_ITEM_RECEIVED_NOTE t17
		ON t18.C18_IRN_ID = t17.C17_IRN_ID
), CTE_ITEM_MAX_TIME AS (
	SELECT ITEM_ID,
		   MAX(IRN_TIME) IRN_MAX_TIME
	  FROM CTE_ITEM_DETAIL
	  GROUP BY ITEM_ID
)
SELECT t2.ITEM_ID ITEM_ID,
       t2.BUY_PRICE BUY_PRICE
  FROM CTE_ITEM_MAX_TIME t1
  JOIN CTE_ITEM_DETAIL t2
    ON t1.ITEM_ID = t2.ITEM_ID
   AND t1.IRN_MAX_TIME = t2.IRN_TIME;
   
-- Cách 2: Sắp xếp dữ liệu trên từng nhóm
WITH CTE_ITEM_DETAIL AS (
	SELECT t18.C18_ITEM_ID ITEM_ID,
	   t17.C17_IRN_TIME IRN_TIME,
	   t18.C18_BUY_PRICE BUY_PRICE,
	   ROW_NUMBER() OVER (
			PARTITION BY t18.C18_ITEM_ID ORDER BY t17.C17_IRN_TIME DESC
	   ) row_num
  FROM T18_ITEM_RECEIVED_NOTE_DETAIL t18
  JOIN T17_ITEM_RECEIVED_NOTE t17
	ON t18.C18_IRN_ID = t17.C17_IRN_ID
)
SELECT ITEM_ID,
       BUY_PRICE
  FROM CTE_ITEM_DETAIL
 WHERE row_num = 1;

-- 2. Tìm BUY_PRICE có giá bán cao nhất trong tất cả các phiếu hàng đã nhập cho từng mặt hàng
SELECT C18_ITEM_ID ITEM_ID,
       MAX(C18_BUY_PRICE) BUY_PRICE
  FROM T18_ITEM_RECEIVED_NOTE_DETAIL
  GROUP BY C18_ITEM_ID;

-- T03_ITEM_DETAIL
INSERT INTO T03_ITEM_DETAIL(C03_ITEM_ID,C03_SIZE_ID,C03_COLOR,C03_SALES_PRICE,C03_AMOUNT)
WITH CTE_ITEM_INFO AS (
	SELECT C18_ITEM_ID ITEM_ID,
		   MAX(C18_BUY_PRICE) BUY_PRICE
	  FROM T18_ITEM_RECEIVED_NOTE_DETAIL
	  GROUP BY C18_ITEM_ID
), CTE_ITEM_DETAIL AS (
	-- ITEM, SIZE có ID là số lẻ
	SELECT t01.ITEM_ID ITEM_ID,
		   t02.C02_SIZE_ID SIZE_ID,
		   elt(floor(rand() * 5) + 1, 'RED', 'GREEN', 'BLUE', 'ORANGE', 'YELLOW') COLOR,
		   t01.BUY_PRICE * 2 + t02.C02_SIZE_ID * 5 BUY_PRICE,
		   125 AMOUNT
	  FROM CTE_ITEM_INFO t01, T02_SIZE t02
	 WHERE t01.ITEM_ID MOD 2 != 0
	   AND t02.C02_SIZE_ID MOD 2 != 0
	UNION ALL
	-- ITEM, SIZE có ID là số chẵn
	SELECT t01.ITEM_ID ITEM_ID,
		   t02.C02_SIZE_ID SIZE_ID,
		   elt(floor(rand() * 5) + 1, 'RED', 'GREEN', 'BLUE', 'ORANGE', 'YELLOW') COLOR,
		   t01.BUY_PRICE * 2 + t02.C02_SIZE_ID * 5 + 20 BUY_PRICE,
		   280 AMOUNT
	  FROM CTE_ITEM_INFO t01, T02_SIZE t02
	 WHERE t01.ITEM_ID MOD 2 = 0
	   AND t02.C02_SIZE_ID MOD 2 = 0
)
SELECT * FROM CTE_ITEM_DETAIL ORDER BY ITEM_ID, SIZE_ID;
   
 -- T05_GALLERY
 INSERT INTO T05_GALLERY(C05_ITEM_ID, C05_COLOR, C05_IMAGE)
 SELECT C01_ITEM_ID,
		elt(f_random(5), 'RED', 'GREEN', 'BLUE', 'ORANGE', 'YELLOW') COLOR,
        concat('flie://image/p_', C01_ITEM_ID, '.png')
   FROM T01_ITEM;

-- T07_CUSTOMER
CALL p_insert_into_customer();

-- T13_PAYMENT_METHOD
INSERT INTO T13_PAYMENT_METHOD(C13_PAYMENT_METHOD_NAME)
VALUES ('Tiền mặt'),
	   ('Thẻ tín dụng'),
       ('Thẻ ghi nợ'),
       ('Ví điện tử');
       
-- T06_ORDER
INSERT INTO T06_ORDER 
(C06_ORDER_ID, C06_RECEIVER_NAME, C06_RECEIVER_PHONE, C06_DELIVERY_ADDRESS, 
C06_CUSTOMER_ID, C06_ORDER_TIME, C06_PAYMENT_METHOD_ID, C06_CREATE_BY)
VALUES
(1, 'R1', '258369741', 'Địa chỉ 1', 1, '2024-04-10 08:10:20', 1, 6),
(2, 'R2', '258369742', 'Địa chỉ 2', 2, '2024-04-12 08:10:20', 1, 6),
(3, 'R3', '258369743', 'Địa chỉ 3', 3, '2024-04-14 08:10:20', 2, 8),
(4, 'R4', '258369744', 'Địa chỉ 4', 4, '2024-04-16 08:10:20', 2, 9),
(5, 'R5', '258369745', 'Địa chỉ 5', 5, '2024-04-18 08:10:20', 3, 8),
(6, 'R6', '258369746', 'Địa chỉ 6', 6, '2024-04-12 08:10:20', 3, 8),
(7, 'R7', '258369747', 'Địa chỉ 7', 7, '2024-04-14 08:10:20', 4, 9),
(8, 'R8', '258369748', 'Địa chỉ 8', 8, '2024-04-18 08:10:20', 4, 6),
(9, 'R9', '258369749', 'Địa chỉ 9', 1, '2024-04-18 08:10:20', 4, 6),
(10, 'R10', '258369714', 'Địa chỉ 10', 2, '2024-04-18 08:10:20', 4, 9),
(11, 'R11', '258369724', 'Địa chỉ 11', 9, '2024-04-20 08:10:20', 3, 8),
(12, 'R12', '258369734', 'Địa chỉ 12', 10, '2024-04-26 08:10:20', 3, 6),
(13, 'R13', '258369794', 'Địa chỉ 13', 5, '2024-04-28 08:10:20', 1, 6);

-- T16_ORDER_DETAIL
INSERT INTO T16_ORDER_DETAIL (C16_ORDER_ID, C16_ITEM_DETAIL_ID, C16_AMOUNT)
VALUES
(1, 1, 2),
(1, 3, 4),
(2, 4, 2),
(2, 5, 2),
(3, 6, 4),
(3, 2, 4),
(4, 8, 2),
(4, 12, 4),
(5, 88, 1),
(5, 22, 3),
(5, 11, 1),
(5, 33, 1),
(6, 2, 1),
(7, 1, 2),
(8, 27, 1),
(8, 23, 1),
(8, 98, 2),
(9, 100, 6),
(9, 11, 7),
(9, 45, 2),
(9, 22, 2),
(9, 32, 1),
(10, 18, 2),
(10, 29, 4),
(11, 33, 2),
(11, 65, 1),
(11, 1, 1),
(11, 2, 2),
(11, 5, 5),
(11, 7, 10),
(12, 55, 1),
(13, 92, 1),
(13, 14, 2);

-- T15_BILL
INSERT INTO T15_BILL(C15_BILL_ID, C15_DELIVERY_FEE, C15_TOTAL_OF_MONEY, C15_ORDER_ID)
SELECT C06_ORDER_ID BILL_ID,
	   elt(f_random(5), 20, 28, 48, 56, 80),
       SUM(t03.C03_SALES_PRICE * t16.C16_AMOUNT) TOTAL_OF_MONEY,
       C06_ORDER_iD ORDER_ID
  FROM T06_ORDER t06
  JOIN T16_ORDER_DETAIL t16
    ON t06.C06_ORDER_ID = t16.C16_ORDER_ID
  JOIN T03_ITEM_DETAIL t03
    ON t16.C16_ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID
 GROUP BY t16.C16_ORDER_ID;
 
-- T11_ORDER_STATUS
INSERT INTO T11_ORDER_STATUS(C11_ORDER_STATUS_DESC)
VALUES 
('Chờ xử lý'),
('Đang đóng gói'),
('Đóng gói hoàn thành'),
('Đang giao hàng'),
('Giao hàng thành công'),
('Giao hàng thất bại'),
('Hủy đơn hàng');

-- T12_ORDER_STATUS_DETAIL
INSERT INTO T12_ORDER_STATUS_DETAIL(C12_ORDER_ID, C12_ORDER_STATUS_ID, C12_EMPLOYEE_ID, C12_LAST_UPDATED)
SELECT t06.C06_ORDER_ID ORDER_ID,
	   t11.C11_ORDER_STATUS_ID STATUS_ID,
       3 EMPLOYEE_ID,
       DATE_SUB(current_timestamp(), INTERVAL(5 - t11.C11_ORDER_STATUS_ID) DAY) LAST_UPDATED
  FROM T06_ORDER t06, T11_ORDER_STATUS t11
 WHERE t06.C06_ORDER_ID BETWEEN 1 AND 5
   AND t11.C11_ORDER_STATUS_ID BETWEEN 1 AND 5

UNION ALL
-- Đơn hàng từ 6-8 --> Đóng gói thành công (status từ 1 đến 3)
-- Nhân viên 4
SELECT t06.C06_ORDER_ID ORDER_ID,
	   t11.C11_ORDER_STATUS_ID STATUS_ID,
       4 EMPLOYEE_ID,
       DATE_SUB(current_timestamp(), INTERVAL(3 - t11.C11_ORDER_STATUS_ID) DAY) LAST_UPDATED
  FROM T06_ORDER t06, T11_ORDER_STATUS t11
 WHERE t06.C06_ORDER_ID BETWEEN 6 AND 8
   AND t11.C11_ORDER_STATUS_ID BETWEEN 1 AND 3

UNION ALL

-- Đơn hàng từ 9-10 --> Đóng gói thành công (status từ 1 đến 4)
-- Nhân viên 5
SELECT t06.C06_ORDER_ID ORDER_ID,
	   t11.C11_ORDER_STATUS_ID STATUS_ID,
       5 EMPLOYEE_ID,
       DATE_SUB(current_timestamp(), INTERVAL(4 - t11.C11_ORDER_STATUS_ID) DAY) LAST_UPDATED
  FROM T06_ORDER t06, T11_ORDER_STATUS t11
 WHERE t06.C06_ORDER_ID BETWEEN 9 AND 10
   AND t11.C11_ORDER_STATUS_ID BETWEEN 1 AND 4

UNION ALL

-- Đơn hàng 11-12 --> Hủy đơn hàng (status 1 và 7)
-- Nhân viên 7
SELECT t06.C06_ORDER_ID ORDER_ID,
	   t11.C11_ORDER_STATUS_ID STATUS_ID,
       7 EMPLOYEE_ID,
       DATE_SUB(current_timestamp(), INTERVAL(7 - t11.C11_ORDER_STATUS_ID) DAY) LAST_UPDATED
  FROM T06_ORDER t06, T11_ORDER_STATUS t11
 WHERE t06.C06_ORDER_ID BETWEEN 11 AND 12
   AND t11.C11_ORDER_STATUS_ID BETWEEN 1 AND 4

UNION ALL

-- Đơn hàng 11-12 --> Hủy đơn hàng (status 1 và 7)
-- Nhân viên 5
SELECT t06.C06_ORDER_ID ORDER_ID,
	   t11.C11_ORDER_STATUS_ID STATUS_ID,
       7 EMPLOYEE_ID,
       DATE_SUB(current_timestamp(), INTERVAL(7 - t11.C11_ORDER_STATUS_ID) DAY) LAST_UPDATED
  FROM T06_ORDER t06, T11_ORDER_STATUS t11
 WHERE t06.C06_ORDER_ID BETWEEN 11 AND 12
   AND t11.C11_ORDER_STATUS_ID BETWEEN 1 AND 4;
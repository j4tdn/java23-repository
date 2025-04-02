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
   
   
  

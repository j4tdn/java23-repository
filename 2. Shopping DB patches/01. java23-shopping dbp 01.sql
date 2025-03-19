USE java23_shopping;

-- java23-shopping dbp 01.sql
-- T04_ITEM_GROUP

-- ID là số nó thường có 2 cách tạo ra giá trị
-- Đơn giản: AUTO INCREMENT -> tự động tăng 1 đơn vị nếu ko insert giá trị cụ thể
-- Cách khác: tạo ra sequence để khai báo sau mỗi lần tăng bao nhiêu đơn vị (ko support trong mysql)

DROP TABLE IF EXISTS T04_ITEM_GROUP;
CREATE TABLE T04_ITEM_GROUP(
	C04_ITEM_GROUP_ID INT AUTO_INCREMENT PRIMARY KEY,
	C04_ITEM_GROUP_NAME VARCHAR(255) NOT NULL,
    CONSTRAINT UNQ_C02_ITEM_GROUP_NAME UNIQUE(C04_ITEM_GROUP_NAME)
);
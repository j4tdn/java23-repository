USE java23_shopping;
-- java-shopping dbp 01.sql
-- T04_Item_group

-- ID là số nó thường có 2 cách tạp ra giá trị
-- đơn giản auto increment -> tự động tăng 1 đơn bị nếu kh insert giá trị cụ thẻALTER
-- cách khác : tạo ra 

CREATE TABLE T04_ITEM_GROUP(
	C04_ITEM_GROUP_ID INT AUTO_INCREMENT PRIMARY KEY,
    C04_ITEM_GROUP_NAME VARCHAR(255) NOT NULL,
    CONSTRAINT UNQ_C02_ITEM_GROUP_NAME UNIQUE(C04_ITEM_GROUP_NAME)
);

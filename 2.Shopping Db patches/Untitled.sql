-- DEVELOPER
-- > dùng sql/app thêm/sửa/xoá data vào để thử cho giao diện

-- QA/TESTER --> Để kiểm tra dữ liệu 
-- Tạo dữ liệu kiểm thử,test data
-- Dùng excel, txt
-- sử dụng sql để import data từ excel, txt hoặc dùng lệnh sql chạy tạo data 
-- Giúp xoá hết data rác, thêm lại data chuẩn bị để trình bày dự án

set FOREIGN_KEY_CHECK = 0; -- disable fk
set FOREIGN_KEY_CHECK = 1; -- enable fk

-- Delete xoá hết data trong table ko hỗ trợ điều kiện
-- Yêu cầu: nếu table hiện tại bị tham chiếu bởi table khác, ko cho truncate(k quan tâm dữ liệu)
--        : bắt buộc enbale fk

truncate table TO1_ITEM;
truncate table TO4_ITEM_GROUP;
truncate TABLE TO3_ITEM_DETAIL;
truncate TABLE TO2_SIZE;
-- draft 

-- Delete xoá hết data trong table, hoặc kèm điều kiện 
-- Bắt lỗi khi xoá data ở bảng cha, dữ liệu còn bị tham chiếu ở bảng con
delete from TO4_ITEM_GROUP;
delete from TO1_ITEM;

select * from TO4_ITEM_GROUP;
select * from TO1_ITEM;
SELECT * FROM TO2_SIZE;
SELECT * FROM TO3_ITEM_DETAIL;

select * from T20_ITEM_GROUP_BACKUP;

-- Insert
insert into TO4_ITEM_GROUP(CO4_ITEM_GROUP_NAME) values
('Áo'),
('Quần'),
('GIÀY'),
('DÉP');

insert into TO2_SIZE(CO2_SIZE_ID,CO2_SIZE_NAME,CO2_GENDER,CO2_SIZE_DESC)
value(1,'S', 1, 'SIZE S cho nam - từ 10-20kg'),
	 (2,'M', 1, 'SIZE L cho nam - từ 20-30kg'),
     (3,'L', 1, 'SIZE S cho nam - từ 30-39kg'),
     (4,'XL', 1, 'SIZE S cho nam - từ 40-49kg'),
     (5,'XXL', 1, 'SIZE S cho nam - từ 50-60kg'),
     (6,'S', 0, 'SIZE S cho nữ - từ 10-20kg'),
     (7,'M', 0, 'SIZE S cho nữ - từ 20-30kg'),
     (8,'L', 0, 'SIZE S cho nữ - từ 30-39kg'),
     (9,'XL', 0, 'SIZE S cho nữ - từ 40-49kg'),
     (10,'XXL', 0, 'SIZE S cho nữ - từ 50-60kg');
	
INSERT INTO TO3_ITEM_DETAIL(CO3_ITEM_ID,CO3_SIZE_ID,CO3_COLOR,CO3_SALES_PRICE,CO3_AMOUNT)
VALUE(1, 1, "RED", 88, 200),
     (1, 2, "BLUE", 99, 300),
     (1, 3, "GREEN", 33, 100),
     (4, 2, "WHITE", 44, 800),
     (4, 3, "RED", 55, 333),
     (4, 4, "BLUE", 66, 700),
     (4, 5, "GREEN", 77, 600);
    


insert into TO1_ITEM(CO1_ITEM_NAME,CO1_ITEM_GROUP_ID) values
('Áo 1',1),
('Áo 2', 1),
('Áo 3', 1),
('Quần 2',2),
('Quần 1', 2),
('GIÀY 1', 3),
('GIÀY 2',3),
('GIÀY 3', 2);


insert into T20_ITEM_GROUP_BACKUP(C20_GROUP_ID,C20_GROUP_NAME,C20_CREATED_TIME) 
select CO4_ITEM_GROUP_ID, CO4_ITEM_GROUP_NAME,current_timestamp()
from TO4_ITEM_GROUP;

-- Khi tạo test data,nên cbi dữ liệu chính xác 
-- Sau đó disable fk để tiện code k cần theo thứ tự 

-- Xoá FK, tạo mới
 Alter TABLE TO1_ITEM DROP constraint FK_T01_T04;
 
 ALter TABLE TO1_ITEM add constraint FK_T01_T04
 foreign key (CO1_ITEM_GROUP_ID) references TO4_ITEM_GROUP(CO4_ITEM_GROUP_ID)
 ON delete cascade
 ON update cascade;
 
 DELETE FROM TO4_ITEM_GROUP WHERE CO4_ITEM_GROUP_ID = 1;
 
 
 -- ---------------   DML SELECT ---------------
 
 SELECT * FROM TO1_ITEM;
 
 SELECT item.* FROM TO1_ITEM item; -- khai báo alias cho table -- là khai báo tên mật danh cho thuận tiện gọi 
 
 SELECT C01_ITEM_ID,
        CO1_ITEM_NAME, 
        CO1_ITEM_GROUP_ID
	FROM TO1_ITEM;
    
SELECT concat(C01_ITEM_ID, ' ', CO1_ITEM_NAME) ITEM_DESC, -- Khai bao alias cho table column
              CO1_ITEM_GROUP_ID ITEM_GROUP_ID -- ĐẶT BIỆT DANH CHO COLUMN 
	FROM TO1_ITEM; 
               
-- Từ khoá distinct, limit(offset,rowcount)
-- offset : vị trí bắt đầu cần lấy (zero index) - optional(default = 0)
-- rowcount: số dòng cần lấy tính từ offset 

SELECT DISTINCT CO1_ITEM_GROUP_ID -- distinct theo 1/N columns 
   FROM TO1_ITEM;
   
SELECT * 
 FROM TO1_ITEM 
 limit 3;
 
SELECT * FROM TO2_SIZE;

SELECT *,
        CAST(CO3_SALES_PRICE * 0.77 AS DECIMAL(10,2)) PROMOTION_PRICE
	FROM TO3_ITEM_DETAIL;
    
-- Mệnh đề case-when, if-elseif-else
SELECT CO2_SIZE_ID,
       CO2_SIZE_NAME,
       CASE CO2_GENDER 
			WHEN 1 THEN 'NAM'
            ELSE 'NỮ'
    END CO2_GENDER, -- if else 	nhiều trường hợp(hỗ trợ bất kỳ điều kiện nào),
    IF(CO2_GENDER = 1, 'nam','nữ') CO2_GENDER_XY, -- TOÁN TỬ 3 NGÔI 
       CO2_SIZE_DESC
       FROM TO2_SIZE;
	
-- Logical statements with WHERE CLAUSE 
-- Liệt kê các mặt hàng chi tiết có giá bán TỪ 87 ĐẾN 100 thì ta dùng hàm between ? and ?

SELECT *
     FROM TO3_ITEM_DETAIL
     WHERE CO3_SALES_PRICE between 87 AND 100;
     
-- Liệt kê các mặt hàng chi tiết có size_id là 1 3 5 thì ta dùng hàm in()

SELECT *
     FROM TO3_ITEM_DETAIL
     WHERE CO3_SIZE_ID  IN (1,3,5);
     
-- IN: Trường hợp tập hợp bên trong mệnh đề IN số lượng nhiều -> gây ra các vấn đề pref hoặc k hỗ trợ 
-- Chuyển sang dùng mệnh đề EXISTS 
     
-- Liệt kê các mặt hàng có chứa các mặt hàng 
SELECT * 
   FROM TO1_ITEM, TO4_ITEM_GROUP
   WHERE CO4_ITEM_GROUP_ID IN (SELECT DISTINCT CO1_ITEM_GROUP_ID); -- TRUY VẤN CON 
   
SELECT *
	FROM TO4_ITEM_GROUP t4 
	WHERE EXISTS (SELECT * FROM TO1_ITEM t1 WHERE t1.CO1_ITEM_GROUP_ID = t4.CO4_ITEM_GROUP_ID); -- TRUY VẤN LỒNG 
    
-- SELECT DISTINCT t4.*
   --     WHERE EXISTS (SELECT * FROM TO1_ITEM t1 
      
    

-- Liệt kê các mặt hàng chưa có mặt hàng 
SELECT * 
   FROM TO4_ITEM_GROUP
   WHERE CO4_ITEM_GROUP_ID NOT IN (SELECT DISTINCT CO1_ITEM_GROUP_ID FROM TO1_ITEM);
   
SELECT *
	FROM TO4_ITEM_GROUP t4 
	WHERE NOT EXISTS (SELECT * FROM TO1_ITEM t1 WHERE t1.CO1_ITEM_GROUP_ID = t4.CO4_ITEM_GROUP_ID);

-- Sắp xếp 





-- Thao tác với group by , having(điều kiện khi có group-by)

SELECT @@sql_mode;
SET SESSION sql_mode=(SELECT REPLACE(@@sql_mode,'ONLY_FULL_GROUP_BY',''));
SET SESSION sql_mode=(SELECT CONCAT(@@sql_mode, ',ONLY_FULL_GROUP_BY'));

SELECT * 
    from TO1_ITEM
    group by CO1_ITEM_GROUP_ID;
    
SELECT CO1_ITEM_GROUP_ID
       from TO1_ITEM
       -- count(*) amount_ID
       
    
-- Mệnh đề : union    
-- Liệt kê các mặt hàng(MaMH) thuộc loại hàng là áo và các mặt hàng có giá lớn hơn 100

SELECT CO3_ITEM_ID
    FROM TO3_ITEM_DETAIL
     WHERE CO3_ITEM_ID = '1'
  ;
  
SELECT CO1_ITEM_ID ITEM_ID
      FROM TO1_ITEM
      WHERE exists ( SELECT CO4_ITEM_GROUP_ID
                     FROM TO4_ITEM_GROUP
                     WHERE CO4_ITEM_GROUP_NAME = 'Áo'
                     AND CO1_ITEM_GROUP_ID = CO4_ITEM_GROUP_ID);

    
    
 
 
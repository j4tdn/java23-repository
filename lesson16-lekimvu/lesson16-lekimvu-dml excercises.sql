-- 1. Liệt kê toàn bộ thông tin các loại hàng

select * 
from T04_ITEM_GROUP;

-- 2. Liệt kê các mặt hàng thuộc loại hàng là Thắt lưng
select * 
from t01_item
where C01_ITEM_GROUP_ID in (select C04_ITEM_GROUP_ID 
                         from T04_ITEM_GROUP 
                         where 
                         C04_ITEM_GROUP_NAME = "Thắt lưng"
);
-- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất
select  *
from T03_ITEM_DETAIL
order by C03_SALES_PRICE desc
limit 5;

-- Error Code: 1064. You have an error in your SQL syntax; check the manual that corresponds to your MySQL server version for the right syntax to use near 'desc limit 5' at line 3

-- 4. Liệt kê toàn bộ đơn hàng
select * 
from T06_ORDER;

-- select * 
-- from T11_ORDER_STATUS;
-- 5. Liệt kê các đơn hàng được bán trong ngày 28/11/2019
select * -- C06_ORDER_ID, C06_RECEIVER_NAME, C06_RECEIVER_PHONE, C06_DELIVERY_ADDRESS, 
          --        C06_CUSTOMER_ID, C06_ORDER_TIME, C06_PAYMENT_METHOD_ID, C06_CREATED_BY
                --   C11_ORDER_STATUS_ID  
from T06_ORDER, T11_ORDER_STATUS t11
where DATE(C06_ORDER_TIME) = '2024-11-28' AND C11_ORDER_STATUS_ID = '5';


-- 6. Liệt kê các đơn hàng được bán từ ngày 28/11/2019 đến ngày 02/12/2019

select *  
from T06_ORDER, T11_ORDER_STATUS t11
where DATE(C06_ORDER_TIME) between '2019/11/28' AND '2019/12/02' AND C11_ORDER_STATUS_ID = '5';

-- 7. Liệt kê các đơn hàng được bán trong tháng 11/2019
SELECT *
FROM T06_ORDER t06
JOIN T12_ORDER_STATUS_DETAIL t12
ON t06.C06_ORDER_ID = t12.C12_ORDER_ID
WHERE MONTH(C06_ORDER_TIME) = 4
  AND YEAR(C06_ORDER_TIME) = 2019
  AND C12_ORDER_STATUS_ID = 5;
--  Error Code: 1054. Unknown column 't06.C06_ORDER_STATUS_ID' in 'on clause'

-- 8. Liệt kê các đơn hàng được giao hàng tại Hòa Khánh

-- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân

-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
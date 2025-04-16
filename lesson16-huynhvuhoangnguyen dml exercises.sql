-- ======================= REFRESH DATA =======================

-- 1. Liệt kê toàn bộ thông tin các loại hàng
SELECT * FROM T04_ITEM_GROUP;

-- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT * FROM T01_ITEM;
SELECT t01.*
  FROM T01_ITEM t01
  JOIN T04_ITEM_GROUP t04
    ON t01.C01_ITEM_GROUP_ID = t04.C04_ITEM_GROUP_ID
 WHERE t04.C04_ITEM_GROUP_NAME = 'Thắt lưng';

-- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất
SELECT * 
  FROM T03_ITEM_DETAIL
 ORDER BY C03_SALES_PRICE DESC
 LIMIT 5;
-- 4. Liệt kê toàn bộ đơn hàng
SELECT * FROM T06_ORDER;

-- 5. Liệt kê các đơn hàng được bán trong ngày 28/11/2019
SELECT *
  FROM T06_ORDER
 WHERE cast(C06_ORDER_TIME AS DATE) = str_to_date('12/04/2024', '%d/%m/%Y'); 

-- 6. Liệt kê các đơn hàng được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT *
  FROM T06_ORDER
 WHERE cast(C06_ORDER_TIME AS DATE) BETWEEN str_to_date('12/04/2024', '%d/%m/%Y') and str_to_date('16/04/2024', '%d/%m/%Y');

-- 7. Liệt kê các đơn hàng được bán trong tháng 11/2019
SELECT *
  FROM T06_ORDER
 WHERE MONTH(C06_ORDER_TIME) = 4
   AND YEAR(C06_ORDER_TIME) = 2024;

-- 8. Liệt kê các đơn hàng được giao hàng tại Hòa Khánh
SELECT *
  FROM T06_ORDER
 WHERE C06_DELIVERY_ADDRESS LIKE 'Địa chỉ 2%';

-- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
SELECT *,
	   ROUND(C03_SALES_PRICE * 0.8, 2) DISCOUNT_PRICE
  FROM T03_ITEM_DETAIL;

-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
SELECT t03.*,
	   t06.C06_ORDER_TIME ORDER_TIME,
	   t01.C01_ITEM_NAME ITEM_NAME,
	   ROUND(C03_SALES_PRICE * 0.8, 2) DISCOUNT_PRICE
  FROM T06_ORDER t06
  JOIN T16_ORDER_DETAIL t16 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
  JOIN T03_ITEM_DETAIL t03 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  JOIN T01_ITEM t01 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 WHERE cast(t06.C06_ORDER_TIME AS DATE) = str_to_date('18/04/2024', '%d/%m/%Y');

-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
SELECT DISTINCT C03_COLOR
  FROM T03_ITEM_DETAIL;

-- 12. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT t01.C01_ITEM_ID,
	   t01.C01_ITEM_NAME ITEM_NAME,
	   cast(t06.C06_ORDER_TIME AS TIME) ORDER_TIME
  FROM T06_ORDER t06
  JOIN T16_ORDER_DETAIL t16 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
  JOIN T03_ITEM_DETAIL t03 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  JOIN T01_ITEM t01 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 WHERE cast(t06.C06_ORDER_TIME AS DATE) = str_to_date('18/04/2024', '%d/%m/%Y');

-- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300
SELECT *
  FROM T03_ITEM_DETAIL
 WHERE C03_SALES_PRICE BETWEEN 100 AND 300;

-- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT *
  FROM T01_ITEM t01
 WHERE EXISTS ( SELECT 1
				  FROM T04_ITEM_GROUP t04
				 WHERE t04.C04_ITEM_GROUP_NAME IN ('Mũ', 'Thắt Lưng')
                   AND t01.C01_ITEM_GROUP_ID = t04.C04_ITEM_GROUP_ID);
    

-- 15. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
SELECT *
  FROM T06_ORDER
 WHERE cast(C06_ORDER_TIME AS DATE) BETWEEN str_to_date('12/04/2024', '%d/%m/%Y') and str_to_date('16/04/2024', '%d/%m/%Y');
-- 16. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT *
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 ORDER BY t03.C03_SALES_PRICE DESC;

-- 17. Sắp xếp các mặt hàng với giá mua giảm dần
WITH cte_item_ranking AS (
	SELECT *,
			ROW_NUMBER() OVER (
				PARTITION BY C18_ITEM_ID
                ORDER BY C18_PROVIDER_ID ASC
			) row_num
	  FROM T18_ITEM_RECEIVED_NOTE_DETAIL
),
cte_item_with_buy_price AS (
	SELECT C18_ITEM_ID,
		   C18_BUY_PRICE
	  FROM cte_item_ranking
	 WHERE row_num = 1
)
SELECT t03.*,
	   cte.C18_BUY_PRICE
  FROM T03_ITEM_DETAIL t03
  JOIN cte_item_with_buy_price cte
    ON cte.C18_ITEM_ID = t03.C03_ITEM_ID
 ORDER BY cte.C18_BUY_PRICE DESC;

-- 18. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT *
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
 ORDER BY t03.C03_SALES_PRICE DESC;

-- 17. Sắp xếp các mặt hàng với giá mua giảm dần
WITH cte_item_ranking AS (
	SELECT *,
			ROW_NUMBER() OVER (
				PARTITION BY C18_ITEM_ID
                ORDER BY C18_PROVIDER_ID ASC
			) row_num
	  FROM T18_ITEM_RECEIVED_NOTE_DETAIL
),
cte_item_with_buy_price AS (
	SELECT C18_ITEM_ID,
		   C18_BUY_PRICE
	  FROM cte_item_ranking
	 WHERE row_num = 1
)
SELECT t03.*,
	   cte.C18_BUY_PRICE
  FROM T03_ITEM_DETAIL t03
  JOIN cte_item_with_buy_price cte
    ON cte.C18_ITEM_ID = t03.C03_ITEM_ID
 ORDER BY t03.C03_SALES_PRICE ASC, cte.C18_BUY_PRICE DESC;
 
-- 19. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(C01_ITEM_ID) FROM T01_ITEM;

-- 20. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019
SELECT 'Giày 9' AS ITEM_NAME,
		sum(t16.C16_AMOUNT) TOTAL_AMOUNT
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T16_ORDER_DETAIL t16 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  JOIN T06_ORDER t06 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
 WHERE date(t06.C06_ORDER_TIME) = '2024-04-18'
   AND t01.C01_ITEM_NAME LIKE 'Giày 9%';

-- 21. Đếm số lượng các mặt hàng theo từng loại hàng
--  MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28
SELECT t04.C04_ITEM_GROUP_ID ITEM_ID,
       t04.C04_ITEM_GROUP_NAME ITEM_NAME,
       SUM(t16.C16_AMOUNT) TOTAL_AMOUNT
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T04_ITEM_GROUP t04 ON t04.C04_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID
  JOIN T16_ORDER_DETAIL t16 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  JOIN T06_ORDER t06 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
 GROUP BY t04.C04_ITEM_GROUP_ID, t04.C04_ITEM_GROUP_NAME;

-- 22. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'
SELECT 'Giày' ITEM_NAME,
	   MAX(t03.C03_SALES_PRICE) MAX_SALES_PRICE
  FROM T03_ITEM_DETAIL t03
  JOIN T01_ITEM t01 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID;

-- 23. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng
SELECT t04.C04_ITEM_GROUP_ID ITEM_GROUP_ID,
       t04.C04_ITEM_GROUP_NAME ITEM_GROUP_NAME,
       t01.C01_ITEM_NAME ITEM_NAME,
       t03.C03_SALES_PRICE MAX_SALES_PRICE
  FROM T03_ITEM_DETAIL t03
  JOIN T01_ITEM t01 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T04_ITEM_GROUP t04 ON t04.C04_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID
 WHERE t03.C03_SALES_PRICE = (
	   SELECT max(t03_sub.C03_SALES_PRICE)
         FROM T03_ITEM_DETAIL t03_sub
         JOIN T01_ITEM t01_sub ON t01_sub.C01_ITEM_ID = t03_sub.C03_ITEM_ID
        WHERE t01_sub.C01_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID
	   )
 ORDER BY t04.C04_ITEM_GROUP_ID;

-- 24. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16
SELECT t04.C04_ITEM_GROUP_ID AS ITEM_ID,
       t04.C04_ITEM_GROUP_NAME AS ITEM_NAME,
       SUM(t16.C16_AMOUNT) AS TOTAL_AMOUNT
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T04_ITEM_GROUP t04 ON t04.C04_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID
  JOIN T16_ORDER_DETAIL t16 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  JOIN T06_ORDER t06 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
 GROUP BY t04.C04_ITEM_GROUP_ID, t04.C04_ITEM_GROUP_NAME
HAVING TOTAL_AMOUNT > 16;

-- 25. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng
SELECT T04.C04_ITEM_GROUP_ID AS ITEM_ID,
	   T04.C04_ITEM_GROUP_NAME AS ITEM_NAME,
       sum(t16.C16_AMOUNT) AS TOTAL_AMOUNT
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T04_ITEM_GROUP t04 ON t04.C04_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID
  JOIN T16_ORDER_DETAIL t16 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  JOIN T06_ORDER t06 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
 GROUP BY t04.C04_ITEM_GROUP_ID, t04.C04_ITEM_GROUP_NAME
 HAVING sum(t16.C16_AMOUNT) > 20;

-- 26. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT T04.C04_ITEM_GROUP_ID AS ITEM_ID,
	   T04.C04_ITEM_GROUP_NAME AS ITEM_NAME,
       max(t16.C16_AMOUNT) AS TOTAL_AMOUNT
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T04_ITEM_GROUP t04 ON t04.C04_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID
  JOIN T16_ORDER_DETAIL t16 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  JOIN T06_ORDER t06 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
 GROUP BY t04.C04_ITEM_GROUP_ID, t04.C04_ITEM_GROUP_NAME;

-- 27. Hiển thị giá bán trung bình của mỗi loại hàng
SELECT t04.C04_ITEM_GROUP_ID AS ITEM_GROUP_ID,
       t04.C04_ITEM_GROUP_NAME AS ITEM_GROUP_NAME,
       AVG(t03.C03_SALES_PRICE) AS AVG_SALES_PRICE
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T04_ITEM_GROUP t04 ON t04.C04_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID
 GROUP BY t04.C04_ITEM_GROUP_ID, t04.C04_ITEM_GROUP_NAME;

-- 28. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

-- 29. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT * FROM t16_order_detail;
SELECT t01.C01_ITEM_ID AS ITEM_ID,
       t01.C01_ITEM_NAME AS ITEM_NAME,
       t01.C01_ITEM_GROUP_ID AS ITEM_GROUP_ID,
       t16.C16_ORDER_ID AS ORDER_ID
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T16_ORDER_DETAIL t16 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
 WHERE t01.C01_ITEM_GROUP_ID = 2
   AND t16.C16_ORDER_ID = 5;

-- 30. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
SELECT * FROM t06_order;
SELECT t01.C01_ITEM_ID AS ITEM_ID,
       t01.C01_ITEM_NAME AS ITEM_NAME,
       t01.C01_ITEM_GROUP_ID AS ITEM_GROUP_ID,
       SUM(t16.C16_AMOUNT) AS SOLD_QUANTITY,
       DATE(t06.C06_ORDER_TIME) AS SALE_DATE
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  JOIN T16_ORDER_DETAIL t16 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  JOIN T06_ORDER t06 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
 WHERE t01.C01_ITEM_GROUP_ID = 2
   AND DATE(t06.C06_ORDER_TIME) = '2024-04-18'
 GROUP BY t01.C01_ITEM_ID, t01.C01_ITEM_NAME, t01.C01_ITEM_GROUP_ID, DATE(t06.C06_ORDER_TIME);
 
-- 31. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
SELECT t01.C01_ITEM_ID AS ITEM_ID,
       t01.C01_ITEM_NAME AS ITEM_NAME,
       t01.C01_ITEM_GROUP_ID AS ITEM_GROUP_ID
  FROM T01_ITEM t01
  JOIN T03_ITEM_DETAIL t03 ON t01.C01_ITEM_ID = t03.C03_ITEM_ID
  LEFT JOIN T16_ORDER_DETAIL t16 ON t03.C03_ITEM_DETAIL_ID = t16.C16_ITEM_DETAIL_ID
  LEFT JOIN T06_ORDER t06 ON t16.C16_ORDER_ID = t06.C06_ORDER_ID
 WHERE t01.C01_ITEM_NAME = 'Mũ'
   AND (t06.C06_ORDER_TIME IS NULL OR DATE(t06.C06_ORDER_TIME) != '2024-04-10');

-- 32. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199
UPDATE T03_ITEM_DETAIL t03
  JOIN T01_ITEM t01 ON t03.C03_ITEM_ID = t01.C01_ITEM_ID
  JOIN T04_ITEM_GROUP t04 ON t01.C01_ITEM_GROUP_ID = t04.C04_ITEM_GROUP_ID
   SET t03.C03_SALES_PRICE = 199
 WHERE t04.C04_ITEM_GROUP_NAME = 'Áo';

-- 33. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 34. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'

-- 35. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng

-- 36. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100




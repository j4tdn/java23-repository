
-- 1. Liệt kê toàn bộ thông tin các loại hàng
	SELECT * FROM t04_item_group;

-- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'

	SELECT * FROM T01_ITEM t01
	JOIN T04_ITEM_GROUP t04
    ON t01.C01_ITEM_GROUP_ID = t04.C04_ITEM_GROUP_ID
	WHERE t04.C04_ITEM_GROUP_NAME = 'Thắt lưng';

-- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất

	SELECT * FROM t03_item_detail
	ORDER BY C03_SALES_PRICE DESC, C03_ITEM_DETAIL_ID
    LIMIT 5;
 
-- 4. Liệt kê toàn bộ đơn hàng
	SELECT * FROM t06_order;


-- 5. Liệt kê các đơn hàng được bán trong ngày 28/11/2019
	
	SELECT *
	FROM T06_ORDER
	WHERE DATE(C06_ORDER_TIME) = '2019-11-28';

-- 6. Liệt kê các đơn hàng được bán từ ngày 28/11/2019 đến ngày 02/12/2019
	
	SELECT * FROM T06_ORDER
	WHERE DATE(C06_ORDER_TIME) BETWEEN '2019-11-28' AND '2019-12-02';

-- 7. Liệt kê các đơn hàng được bán trong tháng 11/2019

	SELECT *
	FROM T06_ORDER
	WHERE C06_ORDER_TIME BETWEEN '2019-11-01' AND '2019-11-30';

-- 8. Liệt kê các đơn hàng được giao hàng tại Hòa Khánh
	SELECT	*FROM t06_order
    WHERE C06_DELIVERY_ADDRESS= 'Hòa Khánh'

-- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
	SELECT C03_ITEM_ID, C03_SALES_PRICE, 
    ROUND(C03_SALES_PRICE * 0.8, 2) AS NEW_PRICE
	FROM T03_ITEM_DETAIL;


-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
WITH SALES_ITEMS AS (
	SELECT t16.C16_ITEM_DETAIL_ID ITEM_DETAIL_ID
	  FROM t06_order t06
	  JOIN t16_order_detail t16
		ON t06.C06_ORDER_ID = t16.C16_ORDER_ID
	 WHERE cast(t06.C06_ORDER_TIME AS DATE) = '2024-04-18'
)
SELECT *,
       '18.04.2024' SALES_DAY,
       ROUND(t03.C03_SALES_PRICE * 0.77, 2) promotion
  FROM t03_item_detail t03
 WHERE EXISTS (SELECT 43
				 FROM SALES_ITEMS si
				WHERE si.ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID);

-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.



-- 12. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
	SELECT DISTINCT t01.C01_ITEM_ID,
	   t01.C01_ITEM_NAME,
       t06.C06_ORDER_TIME
   FROM t06_order t06
   JOIN t16_order_detail t16 ON t06.C06_ORDER_ID = t16.C16_ORDER_ID
   JOIN t03_item_detail t03 ON t16.C16_ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID
   JOIN t01_item t01 ON t03.C03_ITEM_ID = t01.C01_ITEM_ID
	WHERE cast(t06.C06_ORDER_TIME AS DATE) = '2024-04-18';
-- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300
	SELECT *
	FROM t03_item_detail
	WHERE C03_SALES_PRICE BETWEEN 100 AND 300;


-- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
	SELECT *
  FROM T01_ITEM t01
 WHERE EXISTS (SELECT 1
                FROM T04_ITEM_GROUP t04
			   WHERE (C04_ITEM_GROUP_NAME LIKE '%Thắt lưng%' OR C04_ITEM_GROUP_NAME LIKE '%Mũ%')
                 AND t04.C04_ITEM_GROUP_ID = t01.C01_ITEM_GROUP_ID);


-- 15. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
	SELECT *
	FROM t06_order
	WHERE cast(C06_ORDER_TIME as DATE) IN ('2024-04-18', '2024-04-12');

-- 16. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT t01.C01_ITEM_ID ITEM_ID,
	   t01.C01_ITEM_NAME ITEM_NAME,
       avg(t03.C03_SALES_PRICE) AVG_SALES_PRICE
  FROM t03_item_detail t03
  JOIN t01_item t01 ON t03.C03_ITEM_ID = t01.C01_ITEM_ID
  GROUP BY t01.C01_ITEM_ID,
           t01.C01_ITEM_NAME
  ORDER BY AVG_SALES_PRICE;


-- 17. Sắp xếp các mặt hàng với giá mua giảm dần
	SELECT t01.C01_ITEM_ID ITEM_ID,
	   t01.C01_ITEM_NAME ITEM_NAME,
	   MAX(C18_BUY_PRICE) BUY_PRICE
   FROM T18_ITEM_RECEIVED_NOTE_DETAIL t18
   JOIN t01_item t01 ON t18.C18_ITEM_ID = t01.C01_ITEM_ID
   GROUP BY C18_ITEM_ID, t01.C01_ITEM_NAME
   ORDER BY BUY_PRICE DESC;

-- 18. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần

-- 19. Đếm số lượng các mặt hàng trong hệ thống
	SELECT count(*) FROM t01_item;
	SELECT sum(C03_AMOUNT) FROM t03_item_detail;

-- 20. Số lượng 'Giày da Nam' được bán trong ngày 23/11/2019

-- 21. Đếm số lượng các mặt hàng theo từng loại hàng
--  MaLoai  TenLoai SoLuong
-- 	1       Giày    20
-- 	2       Áo      28

-- 22. Tìm mặt hàng có giá bán cao nhất trong loại hàng 'Giày'

-- 23. Tìm mặt hàng có giá bán cao nhất của mỗi loại hàng

-- 24. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống >> 16

-- 25. Hiển thị tổng số lượng mặt hàng của mỗi loại hàng trong hệ thống
--     Điều kiện tổng số lượng > 20 mặt hàng

-- 26. Hiển thị mặt hàng có số lượng nhiều nhất trong mỗi loại hàng

-- 27. Hiển thị giá bán trung bình của mỗi loại hàng

-- 28. In ra 3 loại hàng có số lượng hàng còn lại nhiều nhất ở thời điểm hiện tại

-- 29. Liệt kê những mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100

-- 30. Tìm những mặt hàng có Mã Loại = 2 và đã được bán trong ngày 28/11
	SELECT * FROM 
		t01_item t01 
        JOIN t03_item_detail t03 ON t03.C03_ITEM_ID = t01.C01_ITEM_ID
        JOIN t16_order_detail t16 ON t16.C16_ITEM_DETAIL_ID = t03.C03_ITEM_DETAIL_ID
        JOIN t06_order t06 ON t06.C06_ORDER_ID = t16.C16_ORDER_ID
        WHERE cast(t06.C06_ORDER_TIME AS DATE) =str_to_date('10/04/2024', '%d/%m/%Y')
        AND t01.C01_ITEM_GROUP_ID =1;

-- 31. Liệt kê những mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019

-- 32. Cập nhật giá bán của tất cả các mặt hàng thuộc loại hàng 'Áo' thành 199

-- 33. Backup data. Tạo table LoaiHang_SaoLuu(MaLoai, TenLoai)
--     Sao chép dữ liệu từ bảng LoaiHang sang LoaiHang_SaoLuu

-- 34. Liệt kê 2 sản phẩm (có số lượng tồn kho nhiều nhất) của loại hàng 'Áo' và 'Quần'

-- 35. Tính tổng tiền cho đơn hàng 02
    -- Với tổng tiền được tính bằng tổng các sản phẩm và số lượng của sản phẩm tương ứng

-- 36. Xuất thông tin hóa đơn của đơn hàng 02 với thông tin như sau.
	-- SoDH ChiTietDonHang           TongTien
    -- 02   TenMH:GiaBan:SoLuong     100
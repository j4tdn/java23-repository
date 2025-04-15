
-- 1. Liệt kê toàn bộ thông tin các loại hàng

SELECT * FROM T04_ITEM_GROUP;
-- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'

SELECT * FROM T01_ITEM t1
JOIN T04_ITEM_GROUP t4
    ON t1.C01_ITEM_GROUP_ID = t4.C04_ITEM_GROUP_ID
WHERE t4.C04_ITEM_GROUP_NAME LIKE '%Thắt lưng%';

-- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất

SELECT * FROM T03_ITEM_DETAIL
ORDER BY C03_SALES_PRICE DESC
LIMIT 5;
 
-- 4. Liệt kê toàn bộ đơn hàng

SELECT * FROM T06_ORDER;

-- 5. Liệt kê các đơn hàng được bán trong ngày 28/11/2019

SELECT * FROM T06_ORDER
WHERE DATE(C06_ORDER_TIME) LIKE ('2024-04-16%')

-- 6. Liệt kê các đơn hàng được bán từ ngày 28/11/2019 đến ngày 02/12/2019
SELECT * FROM T06_ORDER
WHERE DATE(C06_ORDER_TIME) BETWEEN '2024-04-13 00:00:00' AND '2024-04-16 23:59:59';

-- 7. Liệt kê các đơn hàng được bán trong tháng 11/2019

SELECT * FROM T06_ORDER
WHERE YEAR(C06_ORDER_TIME) = 2024
AND MONTH(C06_ORDER_TIME) = 4;

-- 8. Liệt kê các đơn hàng được giao hàng tại Hòa Khánh
SELECT * FROM T06_ORDER
 WHERE C06_DELIVERY_ADDRESS = 'Địa chỉ 1';

-- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân

SELECT *, ROUND(C03_SALES_PRICE * 0.8,  2) NEW_PRICE
  FROM T03_ITEM_DETAIL;

-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019


-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.

SELECT DISTINCT C03_COLOR FROM t03_item_detail

-- 12. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
SELECT T01_ITEM.C01_ITEM_ID, T01_ITEM.C01_ITEM_NAME, T06_ORDER.C06_ORDER_TIME
 FROM T01_ITEM 
JOIN T03_ITEM_DETAIL
 ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
 JOIN T16_ORDER_DETAIL
 ON T16_ORDER_DETAIL.C16_ITEM_DETAIL_ID = T03_ITEM_DETAIL.C03_ITEM_DETAIL_ID
 JOIN T06_ORDER
ON T06_ORDER.C06_ORDER_ID = T16_ORDER_DETAIL.C16_ORDER_ID
WHERE DATE(C06_ORDER_TIME) LIKE ('2024-04-16%')

-- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300

SELECT * FROM T01_ITEM 
JOIN T03_ITEM_DETAIL 
	ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
WHERE C03_SALES_PRICE BETWEEN 100 AND 300;

-- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'

SELECT T01_ITEM.* FROM T01_ITEM 
JOIN T04_ITEM_GROUP 
	ON T01_ITEM.C01_ITEM_GROUP_ID = T04_ITEM_GROUP.C04_ITEM_GROUP_ID
WHERE t04_item_group.C04_ITEM_GROUP_NAME LIKE 'Mũ' 

UNION 

SELECT T01_ITEM.* FROM T01_ITEM 
JOIN T04_ITEM_GROUP 
	ON T01_ITEM.C01_ITEM_GROUP_ID = T04_ITEM_GROUP.C04_ITEM_GROUP_ID
WHERE t04_item_group.C04_ITEM_GROUP_NAME LIKE 'Thắt lưng'

-- 15. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)

SELECT * FROM T06_ORDER
WHERE DATE(C06_ORDER_TIME) LIKE ('2024-04-16%')
UNION 
SELECT * FROM T06_ORDER
WHERE DATE(C06_ORDER_TIME) LIKE ('2024-04-14%')

-- 16. Sắp xếp các mặt hàng với giá bán tăng dần

SELECT T01_ITEM.*, C03_SALES_PRICE
FROM T01_ITEM JOIN T03_ITEM_DETAIL 
ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
ORDER BY C03_SALES_PRICE ASC

-- 17. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT T01_ITEM.*, C18_BUY_PRICE FROM T01_ITEM JOIN T18_ITEM_RECEIVED_NOTE_DETAIL
ON T01_ITEM.C01_ITEM_ID = T18_ITEM_RECEIVED_NOTE_DETAIL.C18_ITEM_ID
ORDER BY C18_BUY_PRICE DESC

-- 18. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
SELECT T01_ITEM.*, C18_BUY_PRICE, C03_SALES_PRICE 
FROM T01_ITEM 
JOIN T18_ITEM_RECEIVED_NOTE_DETAIL
ON T01_ITEM.C01_ITEM_ID = T18_ITEM_RECEIVED_NOTE_DETAIL.C18_ITEM_ID
JOIN T03_ITEM_DETAIL 
ON T01_ITEM.C01_ITEM_ID = T03_ITEM_DETAIL.C03_ITEM_ID
ORDER BY C03_SALES_PRICE ASC, C18_BUY_PRICE DESC
-- 19. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(C01_ITEM_ID) NUMBER_OF_ITEM FROM T01_ITEM

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




-- 1. Liệt kê toàn bộ thông tin các loại hàng
	SELECT *
    FROM t01_item;
 -- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT *
   FROM T01_ITEM
  WHERE EXISTS (SELECT C04_ITEM_GROUP_ID
 			     FROM T04_ITEM_GROUP
 			    WHERE C04_ITEM_GROUP_NAME = 'Thắt lưng'
                   AND C01_ITEM_GROUP_ID = C04_ITEM_GROUP_ID);
 -- 3. Liệt kê top 5 mặt hàng có giá bán cao nhất
	SELECT * 
    FROM t03_item_detail
    ORDER BY C03_SALES_PRICE DESC
    LIMIT 5;
 -- 4. Liệt kê toàn bộ đơn hàng
	SELECT * FROM T06_ORDER;
 -- 5. Liệt kê các đơn hàng được bán trong ngày 28/11/2019
	SELECT * 
    FROM t06_order
    WHERE DATE(C06_ORDER_TIME) = STR_TO_DATE('28/11/2019', '%d/%m/%Y');
 -- 6. Liệt kê các đơn hàng được bán từ ngày 28/11/2019 đến ngày 02/12/2019
 	SELECT * 
    FROM t06_order
    WHERE DATE(C06_ORDER_TIME) BETWEEN STR_TO_DATE('28/11/2019', '%d/%m/%Y') AND STR_TO_DATE('02/12/2019', '%d/%m/%Y');
 -- 7. Liệt kê các đơn hàng được bán trong tháng 11/2019
 	SELECT * 
    FROM t06_order
    WHERE MONTH(C06_ORDER_TIME) = 11 AND YEAR(C06_ORDER_TIME)=2019;
 -- 8. Liệt kê các đơn hàng được giao hàng tại Hòa Khánh
 
 -- 9. Giá của toàn bộ các mặt hàng sau khi được khuyến mãi 20%, làm tròn 2 chữ số thập phân
 
 -- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
 
 -- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng.
 
 -- 12. Liệt kê tất cả các mặt hàng (MaMH, TenMH, ThoiGianDatHang) được bán trong ngày 23/11/2019
 
 -- 13. Liệt kê các mặt hàng có giá bán từ 100 - 300
	SELECT * FROM t03_item_detail
	WHERE C03_SALES_PRICE BETWEEN 100 AND 300;
 -- 14. Liệt kê tất cả các mặt hàng thuộc loại hàng là 'Mũ' và 'Thắt lưng'
SELECT *
   FROM T01_ITEM
  WHERE EXISTS (SELECT C04_ITEM_GROUP_ID
 			     FROM T04_ITEM_GROUP
 			    WHERE C04_ITEM_GROUP_NAME = 'Thắt lưng'
                   AND C01_ITEM_GROUP_ID = C04_ITEM_GROUP_ID)
UNION 
SELECT *
   FROM T01_ITEM
  WHERE EXISTS (SELECT C04_ITEM_GROUP_ID
 			     FROM T04_ITEM_GROUP
 			    WHERE C04_ITEM_GROUP_NAME = 'Mũ'
                   AND C01_ITEM_GROUP_ID = C04_ITEM_GROUP_ID);
 -- 15. Liệt kê các đơn hàng được đặt trong ngày (28/11/2019, 14/12/2019)
 
 -- 16. Sắp xếp các mặt hàng với giá bán tăng dần
 
 -- 17. Sắp xếp các mặt hàng với giá mua giảm dần
 
 -- 18. Sắp xếp các mặt hàng với giá bán tăng dần, giá mua giảm dần
 
 -- 19. Đếm số lượng các mặt hàng trong hệ thống
 
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

-- ======================= REFRESH DATA =======================

-- 1. Liệt kê toàn bộ thông tin các loại hàng
SELECT * FROM LoaiHang;

-- 2. Liệt kê các mặt hàng thuộc loại hàng là 'Thắt lưng'
SELECT * FROM MatHang
WHERE MaLoai = (SELECT MaLoai FROM LoaiHang WHERE TenLoai = 'Thắt lưng');

-- 3. Top 5 mặt hàng có giá bán cao nhất
SELECT * FROM MatHang
ORDER BY GiaBan DESC
LIMIT 5;

-- 4. Liệt kê toàn bộ đơn hàng
SELECT * FROM DonHang;

-- 5. Đơn hàng được bán trong ngày 28/11/2019
SELECT * FROM DonHang
WHERE NgayBan = '2019-11-28';

-- 6. Đơn hàng bán từ 28/11 đến 02/12/2019
SELECT * FROM DonHang
WHERE NgayBan BETWEEN '2019-11-28' AND '2019-12-02';

-- 7. Đơn hàng bán trong tháng 11/2019
SELECT * FROM DonHang
WHERE MONTH(NgayBan) = 11 AND YEAR(NgayBan) = 2019;

-- 8. Đơn hàng giao hàng tại Hòa Khánh
SELECT * FROM DonHang
WHERE DiaChiGiaoHang LIKE '%Hòa Khánh%';

-- 9. Giá bán sau khuyến mãi 20%
SELECT MaMH, TenMH, ROUND(GiaBan * 0.8, 2) AS GiaSauKhuyenMai
FROM MatHang;

-- 10. Giảm giá 20% tất cả các mặt hàng trong ngày 25/11/2019
UPDATE MatHang
SET GiaBan = GiaBan * 0.8;

-- 11. Liệt kê tất cả các màu sắc của sản phẩm có bán trong cửa hàng
SELECT DISTINCT MauSac FROM MatHang
WHERE MaMH IN (SELECT DISTINCT MaMH FROM ChiTietDonHang);

-- 12. Các mặt hàng bán trong ngày 23/11/2019
SELECT mh.MaMH, mh.TenMH, dh.NgayBan AS ThoiGianDatHang
FROM MatHang mh
JOIN ChiTietDonHang ct ON mh.MaMH = ct.MaMH
JOIN DonHang dh ON dh.SoDH = ct.SoDH
WHERE dh.NgayBan = '2019-11-23';

-- 13. Các mặt hàng có giá bán từ 100 - 300
SELECT * FROM MatHang
WHERE GiaBan BETWEEN 100 AND 300;

-- 14. Các mặt hàng thuộc loại 'Mũ' và 'Thắt lưng'
SELECT * FROM MatHang
WHERE MaLoai IN (
    SELECT MaLoai FROM LoaiHang
    WHERE TenLoai IN ('Mũ', 'Thắt lưng')
);

-- 15. Các đơn hàng đặt trong ngày 28/11/2019 và 14/12/2019
SELECT * FROM DonHang
WHERE NgayBan IN ('2019-11-28', '2019-12-14');

-- 16. Sắp xếp các mặt hàng với giá bán tăng dần
SELECT * FROM MatHang
ORDER BY GiaBan ASC;

-- 17. Sắp xếp các mặt hàng với giá mua giảm dần
SELECT * FROM MatHang
ORDER BY GiaMua DESC;

-- 18. Sắp xếp các mặt hàng: giá bán tăng dần, giá mua giảm dần
SELECT * FROM MatHang
ORDER BY GiaBan ASC, GiaMua DESC;

-- 19. Đếm số lượng các mặt hàng trong hệ thống
SELECT COUNT(*) AS SoLuongMatHang FROM MatHang;

-- 20. Số lượng 'Giày da Nam' bán ngày 23/11/2019
SELECT SUM(ct.SoLuong) AS SoLuongBan
FROM MatHang mh
JOIN ChiTietDonHang ct ON mh.MaMH = ct.MaMH
JOIN DonHang dh ON dh.SoDH = ct.SoDH
WHERE mh.TenMH = 'Giày da Nam' AND dh.NgayBan = '2019-11-23';

-- 21. Đếm số lượng mặt hàng theo từng loại hàng
SELECT lh.MaLoai, lh.TenLoai, COUNT(mh.MaMH) AS SoLuong
FROM LoaiHang lh
LEFT JOIN MatHang mh ON lh.MaLoai = mh.MaLoai
GROUP BY lh.MaLoai, lh.TenLoai;

-- 22. Mặt hàng giá bán cao nhất trong loại hàng 'Giày'
SELECT * FROM MatHang
WHERE MaLoai = (SELECT MaLoai FROM LoaiHang WHERE TenLoai = 'Giày')
ORDER BY GiaBan DESC
LIMIT 1;

-- 23. Mặt hàng giá bán cao nhất của mỗi loại hàng
SELECT mh.*
FROM MatHang mh
JOIN (
    SELECT MaLoai, MAX(GiaBan) AS MaxGia
    FROM MatHang
    GROUP BY MaLoai
) AS max_mh ON mh.MaLoai = max_mh.MaLoai AND mh.GiaBan = max_mh.MaxGia;

-- 24. Tổng số lượng mặt hàng của mỗi loại hàng
SELECT lh.TenLoai, COUNT(mh.MaMH) AS TongSoLuong
FROM LoaiHang lh
LEFT JOIN MatHang mh ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai;

-- 25. Tổng số lượng mặt hàng của mỗi loại hàng (tổng > 20)
SELECT lh.TenLoai, COUNT(mh.MaMH) AS TongSoLuong
FROM LoaiHang lh
JOIN MatHang mh ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai
HAVING COUNT(mh.MaMH) > 20;

-- 26. Mặt hàng có số lượng nhiều nhất trong mỗi loại hàng
SELECT mh.*
FROM MatHang mh
JOIN (
    SELECT MaLoai, MAX(SoLuongTon) AS MaxSL
    FROM MatHang
    GROUP BY MaLoai
) AS max_ton ON mh.MaLoai = max_ton.MaLoai AND mh.SoLuongTon = max_ton.MaxSL;

-- 27. Giá bán trung bình của mỗi loại hàng
SELECT lh.TenLoai, ROUND(AVG(mh.GiaBan), 2) AS GiaTrungBinh
FROM LoaiHang lh
JOIN MatHang mh ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai;

-- 28. 3 loại hàng có số lượng hàng còn lại nhiều nhất
SELECT lh.TenLoai, SUM(mh.SoLuongTon) AS TongTonKho
FROM LoaiHang lh
JOIN MatHang mh ON lh.MaLoai = mh.MaLoai
GROUP BY lh.TenLoai
ORDER BY TongTonKho DESC
LIMIT 3;

-- 29. Mặt hàng có MaLoai = 2 và thuộc đơn hàng 100100
SELECT mh.*
FROM MatHang mh
JOIN ChiTietDonHang ct ON mh.MaMH = ct.MaMH
WHERE mh.MaLoai = 2 AND ct.SoDH = 100100;

-- 30. Mặt hàng có MaLoai = 2 và đã được bán ngày 28/11
SELECT DISTINCT mh.*
FROM MatHang mh
JOIN ChiTietDonHang ct ON mh.MaMH = ct.MaMH
JOIN DonHang dh ON ct.SoDH = dh.SoDH
WHERE mh.MaLoai = 2 AND dh.NgayBan = '2019-11-28';

-- 31. Mặt hàng là 'Mũ' không bán được trong ngày 14/02/2019
SELECT * FROM MatHang
WHERE MaLoai = (SELECT MaLoai FROM LoaiHang WHERE TenLoai = 'Mũ')
AND MaMH NOT IN (
    SELECT DISTINCT ct.MaMH
    FROM ChiTietDonHang ct
    JOIN DonHang dh ON ct.SoDH = dh.SoDH
    WHERE dh.NgayBan = '2019-02-14'
);

-- 32. Cập nhật giá bán tất cả mặt hàng loại 'Áo' thành 199
UPDATE MatHang
SET GiaBan = 199
WHERE MaLoai = (SELECT MaLoai FROM LoaiHang WHERE TenLoai = 'Áo');

-- 33. Backup dữ liệu LoaiHang sang LoaiHang_SaoLuu
CREATE TABLE LoaiHang_SaoLuu AS
SELECT MaLoai, TenLoai FROM LoaiHang;

-- 34. 2 sản phẩm tồn kho nhiều nhất của loại 'Áo' và 'Quần'
SELECT * FROM MatHang
WHERE MaLoai IN (
    SELECT MaLoai FROM LoaiHang WHERE TenLoai IN ('Áo', 'Quần')
)
ORDER BY SoLuongTon DESC
LIMIT 2;

-- 35. Tổng tiền đơn hàng 02
SELECT SUM(mh.GiaBan * ct.SoLuong) AS TongTien
FROM ChiTietDonHang ct
JOIN MatHang mh ON ct.MaMH = mh.MaMH
WHERE ct.SoDH = 2;

-- 36. Hóa đơn đơn hàng 02
SELECT 
  dh.SoDH,
  GROUP_CONCAT(CONCAT(mh.TenMH, ':', mh.GiaBan, ':', ct.SoLuong) SEPARATOR ', ') AS ChiTietDonHang,
  SUM(mh.GiaBan * ct.SoLuong) AS TongTien
FROM DonHang dh
JOIN ChiTietDonHang ct ON dh.SoDH = ct.SoDH
JOIN MatHang mh ON ct.MaMH = mh.MaMH
WHERE dh.SoDH = 2
GROUP BY dh.SoDH;

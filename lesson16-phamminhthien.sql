
-- Phần A. Phân tích và viết các lệnh để xây dựng cơ sở dữ liệu dựa vào mô tả phía trên 

-- Tạo cơ sở dữ liệu
CREATE DATABASE QuanLyCongTy;
USE QuanLyCongTy;

-- Tạo bảng Phong Ban
CREATE TABLE PhongBan (
    MaPhongBan VARCHAR(10) PRIMARY KEY,
    TenPhongBan VARCHAR(100) NOT NULL UNIQUE
);

-- Tạo bảng Nhan Vien
CREATE TABLE NhanVien (
    MaNhanVien VARCHAR(10) PRIMARY KEY,
    HoTen VARCHAR(100) NOT NULL,
    DiaChi VARCHAR(200),
    Luong DECIMAL(15, 2) NOT NULL,
    GioiTinh ENUM('Nam', 'Nữ'),
    NgaySinh DATE,
    NgayVaoCongTy DATE NOT NULL,
    MaPhongBan VARCHAR(10) NOT NULL,
    MaNguoiQuanLy VARCHAR(10),
    FOREIGN KEY (MaPhongBan) REFERENCES PhongBan(MaPhongBan),
    FOREIGN KEY (MaNguoiQuanLy) REFERENCES NhanVien(MaNhanVien)
);

-- Tạo bảng Truong Phong
CREATE TABLE TruongPhong (
    MaPhongBan VARCHAR(10) PRIMARY KEY,
    MaNhanVien VARCHAR(10) NOT NULL,
    NgayNhanChuc DATE NOT NULL,
    FOREIGN KEY (MaPhongBan) REFERENCES PhongBan(MaPhongBan),
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);

-- Tạo bảng Du An
CREATE TABLE DuAn (
    MaDuAn VARCHAR(10) PRIMARY KEY,
    TenDuAn VARCHAR(100) NOT NULL UNIQUE,
    NgayBatDau DATE NOT NULL,
    NgayKetThuc DATE,
    SoTienThuDuoc DECIMAL(15, 2)
);

-- Tạo bảng Quan Ly DuAn
CREATE TABLE QuanLyDuAn (
    MaDuAn VARCHAR(10) PRIMARY KEY,
    MaNhanVien VARCHAR(10) NOT NULL,
    FOREIGN KEY (MaDuAn) REFERENCES DuAn(MaDuAn),
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien)
);

-- Tạo bảng Tham Gia DuAn
CREATE TABLE ThamGiaDuAn (
    MaNhanVien VARCHAR(10),
    MaDuAn VARCHAR(10),
    SoGioLamViec DECIMAL(10, 2) DEFAULT 0,
    PRIMARY KEY (MaNhanVien, MaDuAn),
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaDuAn) REFERENCES DuAn(MaDuAn)
);

-- Phần B. Viết các lệnh để tạo dữ liệu kiểm thử cho dự án 
-- Yêu cầu: Ít nhất 5 dòng cho mỗi bảng dữ liệu -- -- 

-- Thêm dữ liệu vào bảng PhongBan
INSERT INTO PhongBan VALUES
('PB001', 'Phòng Nhân sự'),
('PB002', 'Phòng Kế toán'),
('PB003', 'Phòng IT'),
('PB004', 'Phòng Marketing'),
('PB005', 'Phòng Kinh doanh');

-- Thêm dữ liệu vào bảng NhanVien
INSERT INTO NhanVien VALUES
('NV001', 'Nguyễn Văn An', 'Hà Nội', 15000000, 'Nam', '1985-05-15', '2015-01-10', 'PB001', NULL),
('NV002', 'Trần Thị Bình', 'Hà Nội', 18000000, 'Nữ', '1980-12-20', '2014-03-15', 'PB002', 'NV001'),
('NV003', 'Lê Văn Cường', 'Hồ Chí Minh', 20000000, 'Nam', '1982-08-25', '2013-07-20', 'PB003', 'NV001'),
('NV004', 'Phạm Minh Thien', 'Đà Nẵng', 17000000, 'Nữ', '2003-11-20', '2016-05-12', 'PB004', 'NV003'),
('NV005', 'Hoàng Văn Em', 'Hải Phòng', 16000000, 'Nam', '1990-02-18', '2017-11-05', 'PB005', 'NV003'),
('NV006', 'Nguyễn Thị Giang', 'Hà Nội', 19000000, 'Nữ', '1983-09-22', '2015-08-15', 'PB001', 'NV001'),
('NV007', 'Trần Văn Hùng', 'Hồ Chí Minh', 21000000, 'Nam', '1979-07-14', '2012-04-23', 'PB002', 'NV002');

-- Thêm dữ liệu vào bảng TruongPhong
INSERT INTO TruongPhong VALUES
('PB001', 'NV001', '2018-01-15'),
('PB002', 'NV002', '2017-05-20'),
('PB003', 'NV004', '2016-08-10'),
('PB004', 'NV004', '2019-03-25'),
('PB005', 'NV005', '2020-02-12');

-- Xóa dữ liệu trước
DELETE FROM TruongPhong WHERE MaNhanVien = 'NV004';
-- Thêm ràng buộc UNIQUE
ALTER TABLE TruongPhong
ADD CONSTRAINT unique_truongphong UNIQUE (MaNhanVien);
-- Cập nhật
UPDATE TruongPhong 
SET MaNhanVien = 'NV006' 
WHERE MaPhongBan = 'PB003';


-- Thêm dữ liệu vào bảng DuAn
INSERT INTO DuAn VALUES
('DA001', 'Dự án phát triển phần mềm A', '2023-01-15', '2023-12-15', 500000000),
('DA002', 'Dự án xây dựng website B', '2023-03-20', '2023-09-30', 300000000),
('DA003', 'Dự án marketing sản phẩm C', '2023-02-10', '2023-06-20', 200000000),
('DA004', 'Dự án phân tích dữ liệu D', '2023-05-15', '2023-11-30', 450000000),
('DA005', 'Dự án triển khai hệ thống E', '2023-04-01', '2024-01-31', 600000000);

-- Thêm dữ liệu vào bảng QuanLyDuAn
INSERT INTO QuanLyDuAn VALUES
('DA001', 'NV004'),
('DA002', 'NV004'),
('DA003', 'NV001'),
('DA004', 'NV002'),
('DA005', 'NV001');

-- Thêm dữ liệu vào bảng ThamGiaDuAn
INSERT INTO ThamGiaDuAn VALUES
('NV001', 'DA001', 120),
('NV001', 'DA002', 180),
('NV002', 'DA001', 150),
('NV002', 'DA004', 200),
('NV003', 'DA001', 220),
('NV003', 'DA005', 100),
('NV004', 'DA003', 180),
('NV004', 'DA004', 120),
('NV005', 'DA003', 90),
('NV005', 'DA005', 160),
('NV006', 'DA002', 140),
('NV006', 'DA005', 130),
('NV007', 'DA004', 180);

-- Phần C. Thực hiện truy vấn 
-- 1. Liệt kê các dự án diễn ra trong năm *?* có số tiền thu được trên *?* triệu VND
SELECT * FROM DuAn
WHERE YEAR(NgayBatDau) = 2023 
AND SoTienThuDuoc > 300000000;

-- 2. Liệt kê các nhân viên đã tham gia hơn ?*?  giờ trong các dự án, hiển thị chi tiết số giờ trong mỗi dự án mà nhân viên tham gia 
-- Thay thế ? bằng số giờ (VD: 150)
SELECT nv.MaNhanVien, nv.HoTen, tgda.MaDuAn, da.TenDuAn, tgda.SoGioLamViec
FROM NhanVien nv
JOIN ThamGiaDuAn tgda ON nv.MaNhanVien = tgda.MaNhanVien
JOIN DuAn da ON tgda.MaDuAn = da.MaDuAn
WHERE nv.MaNhanVien IN (
    SELECT MaNhanVien 
    FROM ThamGiaDuAn 
    GROUP BY MaNhanVien 
    HAVING SUM(SoGioLamViec) > 150
)
ORDER BY nv.MaNhanVien, tgda.MaDuAn;

-- 3. Liệt kê các nhân viên có mức lương >= mức lương của người giám sát/quản lý trực tiếp nhân viên đó 
SELECT nv.MaNhanVien, nv.HoTen, nv.Luong, ql.MaNhanVien AS MaQuanLy, ql.HoTen AS TenQuanLy, ql.Luong AS LuongQuanLy
FROM NhanVien nv
JOIN NhanVien ql ON nv.MaNguoiQuanLy = ql.MaNhanVien
WHERE nv.Luong >= ql.Luong;
-- 4. Liệt kê các phòng ban có số lượng nhân viên lớn hơn *?* 
SELECT pb.MaPhongBan, pb.TenPhongBan, COUNT(nv.MaNhanVien) AS SoLuongNhanVien
FROM PhongBan pb
JOIN NhanVien nv ON pb.MaPhongBan = nv.MaPhongBan
GROUP BY pb.MaPhongBan, pb.TenPhongBan
HAVING COUNT(nv.MaNhanVien) > 1;

-- 5. Liệt kê các nhân viên đã làm việc cho công ty hơn ?*? năm
-- Thay thế ? bằng số năm (VD: 5)
SELECT MaNhanVien, HoTen, NgayVaoCongTy, 
       TIMESTAMPDIFF(YEAR, NgayVaoCongTy, CURDATE()) AS SoNamLamViec
FROM NhanVien
WHERE TIMESTAMPDIFF(YEAR, NgayVaoCongTy, CURDATE()) > 5;

-- 6. Liệt kê các nhân viên vừa là trưởng phòng ban, và là quản lý dự án 
SELECT nv.MaNhanVien, nv.HoTen, pb.TenPhongBan, da.TenDuAn
FROM NhanVien nv
JOIN TruongPhong tp ON nv.MaNhanVien = tp.MaNhanVien
JOIN QuanLyDuAn qlda ON nv.MaNhanVien = qlda.MaNhanVien
JOIN PhongBan pb ON tp.MaPhongBan = pb.MaPhongBan
JOIN DuAn da ON qlda.MaDuAn = da.MaDuAn
ORDER BY nv.MaNhanVien;

-- 7. Liệt kê các nhân viên quản lý nhiều hơn 1 dự án
SELECT nv.MaNhanVien, nv.HoTen, COUNT(qlda.MaDuAn) AS SoLuongDuAnQuanLy
FROM NhanVien nv
JOIN QuanLyDuAn qlda ON nv.MaNhanVien = qlda.MaNhanVien
GROUP BY nv.MaNhanVien, nv.HoTen
HAVING COUNT(qlda.MaDuAn) > 1;

-- 8. Mỗi khi nhân viên tham gia vào dự án chúng ta cần lưu lại thông tin hay còn được gọi là log để biết nhân viên đó tham gia vào dự án vào thời gian nào 
-- Mỗi khi nhân viên cập nhật số giờ tham gia dự án, ta cần lưu lại thông tin thời gian cập nhật khi nào, số giờ tham gia cũ, số giờ tham gia mới 
-- Công việc được thực hiện tự động khi dự dữ liệu được thêm, cập nhật -- 
-- Tạo bảng lưu log cập nhật giờ làm
CREATE TABLE LogCapNhatGioLam (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    MaNhanVien VARCHAR(10),
    MaDuAn VARCHAR(10),
    SoGioCu DECIMAL(10, 2),
    SoGioMoi DECIMAL(10, 2),
    ThoiGianCapNhat DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaDuAn) REFERENCES DuAn(MaDuAn)
);

-- Tạo bảng lưu log Tham Gia DuAn
CREATE TABLE LogThamGiaDuAn (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    MaNhanVien VARCHAR(10),
    MaDuAn VARCHAR(10),
    ThoiGianThamGia DATETIME DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (MaNhanVien) REFERENCES NhanVien(MaNhanVien),
    FOREIGN KEY (MaDuAn) REFERENCES DuAn(MaDuAn)
);

-- Trigger ghi log khi thêm nhân viên vào dự án
-- Trigger ghi log khi thêm nhân viên vào dự án
DELIMITER //
CREATE TRIGGER trg_ThemNhanVienVaoDuAn
AFTER INSERT ON ThamGiaDuAn
FOR EACH ROW
BEGIN
    INSERT INTO LogThamGiaDuAn(MaNhanVien, MaDuAn)
    VALUES (NEW.MaNhanVien, NEW.MaDuAn);
END //
DELIMITER ;

-- Trigger ghi log khi cập nhật giờ làm của nhân viên
DELIMITER //
CREATE TRIGGER trg_CapNhatGioLam
BEFORE UPDATE ON ThamGiaDuAn
FOR EACH ROW
BEGIN
    IF NEW.SoGioLamViec != OLD.SoGioLamViec THEN
        INSERT INTO LogCapNhatGioLam(MaNhanVien, MaDuAn, SoGioCu, SoGioMoi)
        VALUES (NEW.MaNhanVien, NEW.MaDuAn, OLD.SoGioLamViec, NEW.SoGioLamViec);
    END IF;
END //
DELIMITER ;

-- Kiểm tra log nhân viên tham gia dự án
-- Thêm nhân viên mới
INSERT INTO NhanVien VALUES 
('NV009', 'Trần Thị A', 'Quảng Nam', 19500000, 'Nữ', '1989-11-25', '2023-09-01', 'PB003', 'NV004');
-- Cho nhân viên mới tham gia dự án
INSERT INTO ThamGiaDuAn VALUES
('NV009', 'DA003', 50);
-- Kiểm tra log nhân viên tham gia dự án
SELECT * FROM LogThamGiaDuAn WHERE MaNhanVien = 'NV009';

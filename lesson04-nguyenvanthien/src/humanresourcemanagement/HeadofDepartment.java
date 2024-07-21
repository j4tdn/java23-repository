package humanresourcemanagement;

public class TruongPhong extends NhanSu {
    private double heSoChucVu;
    private String donVi;

    public TruongPhong(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu, String donVi) {
        super(hoTen, ngaySinh, heSoLuong);
        this.heSoChucVu = heSoChucVu;
        this.donVi = donVi;
    }

    @Override
    public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 2200000;
    }

    @Override
    public String toString() {
        return super.toString() + ", Hệ số chức vụ: " + heSoChucVu + ", Đơn vị: " + donVi + ", Lương: " + tinhLuong();
    }
}

package humanresourcemanagement;

public class Director extends HumanResources {
    private double HeSoChucVu;

    public Director(String hoTen, String ngaySinh, double heSoLuong, double heSoChucVu) {
        super(hoTen, ngaySinh, heSoLuong);
        this.HeSoChucVu = heSoChucVu;
    }

    @Override
    public double tinhLuong() {
        return (HeSoLuong + HeSoChucVu) * 3000000;
    }

	@Override
	public String toString() {
		return super.toString() + ", Hệ số chức vụ: " + HeSoChucVu + ", Lương: " + tinhLuong();
	}
    
}


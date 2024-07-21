package humanresourcemanagement;

public abstract class HumanResources {
		
	
	protected String HoTen;
    protected String NgaySinh;
    protected double HeSoLuong;
    
 

    public HumanResources(String hoTen, String ngaySinh, double heSoLuong) {
        this.HoTen = hoTen;
        this.NgaySinh = ngaySinh;
        this.HeSoLuong = heSoLuong;
    }

    public abstract double tinhLuong();

    @Override
    public String toString() {
        return "Tên: " + HoTen + ", Ngày sinh: " + NgaySinh + ", Hệ số lương: " + HeSoLuong;
    }
}
	

		
	



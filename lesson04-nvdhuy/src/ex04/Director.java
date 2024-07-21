package ex04;

public class Director extends Personal{
	private double heSoChucVu;
	
	

	public Director(String name, String dOB, double heSoLuong, double heSoChucVu) {
		super(name, dOB, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}
	public double tinhLuong() {
		return (getHeSoLuong() + getHeSoChucVu()) * 3000000;
	}
	@Override
	public String toString() {
		return "Director:" + super.toString() + " [heSoChucVu=" + heSoChucVu + "]";
	}
	
}

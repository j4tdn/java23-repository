package ex04;

public class Manager extends Personal{
	private double heSoChucVu;
	private String DonVi;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	public Manager(String name, String dOB, double heSoLuong, double heSoChucVu, String donVi) {
		super(name, dOB, heSoLuong);
		this.heSoChucVu = heSoChucVu;
		this.DonVi = donVi;
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	public String getDonVi() {
		return DonVi;
	}

	public void setDonVi(String donVi) {
		DonVi = donVi;
	}
	public double tinhLuong() {
		return (getHeSoLuong() + getHeSoChucVu()) * 2200000;
	}
	@Override
	public String toString() {
		return "Manager " + super.toString() + "[heSoChucVu=" + heSoChucVu + ", DonVi=" + DonVi + "]";
	}
	
	
	
}

package ex04;

public class Staff extends Personal{
	private String DonVi;
	private String TruongPhong;
	
	public Staff() {
		// TODO Auto-generated constructor stub
	}

	public Staff(String name, String dOB, double heSoLuong, String donVi, String truongPhong) {
		super(name, dOB, heSoLuong);
		DonVi = donVi;
		TruongPhong = truongPhong;
	}

	public String getDonVi() {
		return DonVi;
	}

	public void setDonVi(String donVi) {
		DonVi = donVi;
	}

	public String getTruongPhong() {
		return TruongPhong;
	}

	public void setTruongPhong(String truongPhong) {
		TruongPhong = truongPhong;
	}
	
	public double tinhLuong() {
		return getHeSoLuong() * 1250000;
	}

	@Override
	public String toString() {
		return "Staff " + super.toString() + "[DonVi=" + DonVi + ", TruongPhong=" + TruongPhong + "]";
	}
	
}

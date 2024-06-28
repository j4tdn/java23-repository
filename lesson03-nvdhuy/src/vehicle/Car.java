package vehicle;

public class Car {
	private String LoaiXe;
	private int DungTich;
	private double TriGia;
	
	public Car() {
		// TODO Auto-generated constructor stub
	}

	public Car(String loaiXe, int dungTich, double triGia) {
		super();
		LoaiXe = loaiXe;
		DungTich = dungTich;
		TriGia = triGia;
	}

	public String getLoaiXe() {
		return LoaiXe;
	}

	public void setLoaiXe(String loaiXe) {
		LoaiXe = loaiXe;
	}

	public int getDungTich() {
		return DungTich;
	}

	public void setDungTich(int dungTich) {
		DungTich = dungTich;
	}

	public double getTriGia() {
		return TriGia;
	}

	public void setTriGia(double triGia) {
		TriGia = triGia;
	}

	@Override
	public String toString() {
		return "Car [LoaiXe=" + LoaiXe + ", DungTich=" + DungTich + ", TriGia=" + TriGia + "]";
	}
	
	public double Itax () {
		double tax;
		if(DungTich < 100) tax = TriGia * 0.01;
		else if(DungTich >= 100 && DungTich < 200) tax = TriGia *0.03;
		else tax = TriGia * 0.05;
		return tax;	
		
	}
	
}

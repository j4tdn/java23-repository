package ex01studentmanagement;

public class Student {
	//Attribute
	private int MaSinhVien ;
	private String HoTen;
	private double DiemLyThuyet;
	private double DiemThucHanh;
	
	public Student() {
		
	}

	public Student(int maSinhVien, String hoTen, double diemLyThuyet, double diemThucHanh) {
		super();
		MaSinhVien = maSinhVien;
		HoTen = hoTen;
		DiemLyThuyet = diemLyThuyet;
		DiemThucHanh = diemThucHanh;
	}

	public int getMaSinhVien() {
		return MaSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		MaSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return HoTen;
	}

	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}

	public double getDiemLyThuyet() {
		return DiemLyThuyet;
	}

	public void setDiemLyThuyet(double diemLyThuyet) {
		DiemLyThuyet = diemLyThuyet;
	}

	public double getDiemThucHanh() {
		return DiemThucHanh;
	}

	public void setDiemThucHanh(double diemThucHanh) {
		DiemThucHanh = diemThucHanh;
	}

	
	public double TinhDiemTrungBinh() {
		return (DiemLyThuyet+DiemThucHanh)/2;
	}

	@Override
	public String toString() {
		return "Student [MaSinhVien=" + MaSinhVien + ", HoTen=" + HoTen + ", DiemLyThuyet=" + DiemLyThuyet
				+ ", DiemThucHanh=" + DiemThucHanh + ", DiemTrungBinh=" +TinhDiemTrungBinh()+'}';
	}
		
	}
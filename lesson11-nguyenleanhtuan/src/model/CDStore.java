package model;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.CD;

public class CDStore {
	private List<CD> danhSachCD = new ArrayList<>();

	public boolean themCD(CD cd) {
		for (CD existingCD : danhSachCD) {
			if (existingCD.getMaCD() == cd.getMaCD()) {
				return false;
			}
		}
		danhSachCD.add(cd);
		return true;
	}

	public int soLuongCD() {
		return danhSachCD.size();
	}

	public double tongGiaThanh() {
		double tong = 0;
		for (CD cd : danhSachCD) {
			tong += cd.getGiaThanh();
		}
		return tong;
	}

	public void sapXepTheoGiaThanhGiamDan() {
		danhSachCD.sort(Comparator.comparingDouble(CD::getGiaThanh).reversed());
	}

	public void sapXepTheoMaCDTangDan() {
		danhSachCD.sort(Comparator.comparingInt(CD::getMaCD));
	}

	public List<CD> getDanhSachCD() {
		return danhSachCD;
	}
}

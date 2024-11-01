package bean;

import java.util.Objects;

public class CD {

	private int maCD;
	private String loaiCD;
	private String caSy;
	private int soBaiHat;
	private double giaThanh;

	public CD() {
	}

	public int getMaCD() {
		return maCD;
	}

	public void setMaCD(int maCD) {
		this.maCD = maCD;
	}

	public String getLoaiCD() {
		return loaiCD;
	}

	public void setLoaiCD(String loaiCD) {
		this.loaiCD = loaiCD;
	}

	public String getCaSy() {
		return caSy;
	}

	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}

	public int getSoBaiHat() {
		return soBaiHat;
	}

	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}

	public CD(int maCD, String loaiCD, String caSy, int soBaiHat, double giaThanh) {
		super();
		this.maCD = maCD;
		this.loaiCD = loaiCD;
		this.caSy = caSy;
		this.soBaiHat = soBaiHat;
		this.giaThanh = giaThanh;
	}

	@Override
	public int hashCode() {
		return Objects.hash(caSy, giaThanh, loaiCD, maCD, soBaiHat);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof CD))
			return false;
		CD that = (CD) obj;
		return getMaCD() == that.getMaCD();

	}

	@Override
	public String toString() {
		return "CD [maCD=" + maCD + ", loaiCD=" + loaiCD + ", caSy=" + caSy + ", soBaiHat=" + soBaiHat + ", giaThanh="
				+ giaThanh + "]";
	}

}

package bean;

public class Word {

	private String tu;
    private String nghia;
    private String loaiTu;
    private String ghiChu;
    
    public Word() {
	}

	public Word(String tu, String nghia, String loaiTu, String ghiChu) {
		this.tu = tu;
		this.nghia = nghia;
		this.loaiTu = loaiTu;
		this.ghiChu = ghiChu;
	}

	public String getTu() {
		return tu;
	}

	public void setTu(String tu) {
		this.tu = tu;
	}

	public String getNghia() {
		return nghia;
	}

	public void setNghia(String nghia) {
		this.nghia = nghia;
	}

	public String getLoaiTu() {
		return loaiTu;
	}

	public void setLoaiTu(String loaiTu) {
		this.loaiTu = loaiTu;
	}

	public String getGhiChu() {
		return ghiChu;
	}

	public void setGhiChu(String ghiChu) {
		this.ghiChu = ghiChu;
	}

	@Override
	public String toString() {
		return "Word [tu=" + tu + ", nghia=" + nghia + ", loaiTu=" + loaiTu + ", ghiChu=" + ghiChu + "]";
	}
    
	
    
}

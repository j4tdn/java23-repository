package inheritance.iinterface;

public interface Shape {
	/*
	 * Trong interface, có thể tạo ra hàm ko có body
	 * 
	 * Hàm k có body --> hàm trưudf tượng(abstract method) --> bắt buộc override ở lớp con
	 * 
	 */
	
	void calS();
	
	void paint();
}

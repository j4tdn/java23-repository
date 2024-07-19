package inheritance.iinterface;

public interface Shape {

	/*
	Trong interface, có thể tạo ra hàm không có body
	
	Hàm ko có body --> hàm trừu tượng(abstract method) --> bắt buộc override ở lớp con
	 */
	
	void calS();
	void paint();
}

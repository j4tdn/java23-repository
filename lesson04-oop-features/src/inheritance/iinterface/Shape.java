package inheritance.iinterface;

public interface Shape {
	
	/*
	 Trong interface, có thể tạo ra hàm ko có body
	 
	 Hàm ko có body --> hàm trừu tượng(abstract method) --> bắt buộc overide ở lớp con
	 */
	
	void calS();
	
	void paint();
}

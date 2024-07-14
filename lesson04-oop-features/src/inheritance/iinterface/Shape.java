package inheritance.iinterface;

public interface Shape {
	/*
	 Trong interface, có thể tạo ra hàm ko có body
	 
	 Hàm k có body --> hàm trừu tượng (abstract method) --> bắt buộc override ở lớp con
	 */
	
	//các hàm trừu tượng
	void calS();
	
	void paint();
}

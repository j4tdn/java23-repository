package inheritance.iinterface;

public interface Shape {
	/*
	 Trong interface, có thể tạo hàm 0 có body
	 
	 Hàm 0 có body -> hàm trừu tượng(abstract method)
	 --> bắt buộc override ở lớp con.
	 */
	
	void calS();
	
	void paint();
}

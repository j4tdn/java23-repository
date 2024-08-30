package inheritance.iinterface;

public interface Shape {

	/*
	 Trong interface, có thể tạo ra hàm không có body
	 
	 Hàm không có body 
	 --> hàm trừu tượng(abstract method) --> bắt buộc override ở lớp con
	 
	 */
	void calS(); // --> Compile public abstract void calS();
	
	void paint();
}

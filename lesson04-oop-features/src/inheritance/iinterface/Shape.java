package inheritance.iinterface;

public interface Shape {

	/*
	 Trong interface, có thể tạo ra hàm không có body
	 
	 Hàm không có body --> hàm trừu tượng (abstract method) --> bát buộc override ở class con
	 */
	
	void calS(); // --> compile : public abstract void calS();
	
	void paint();
}

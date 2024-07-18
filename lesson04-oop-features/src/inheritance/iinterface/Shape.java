package inheritance.iinterface;

public interface Shape {
	/*
	  Trong interface, có thể tạo ra hàm không có phần body
	  
	  Hàm ko có body --> hàm trừu tượng (abstract method )--> không bắt buộc override lớp con
	  
	  
	 */
	
	void cals();
	
	
	void paint();
	
}

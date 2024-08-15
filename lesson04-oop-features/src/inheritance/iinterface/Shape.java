package inheritance.iinterface;

public interface Shape {
	/*
	 * Trong interface có thể tạo ra hàm ko có body
	 * Hàm ko có body --> Hàm trừu tượng (abstract method) --> bắt buộc override
	 */
	void calS(); // --> compile public abstract void calS();
	void paint();
}

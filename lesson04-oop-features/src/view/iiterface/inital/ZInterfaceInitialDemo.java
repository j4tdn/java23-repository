package view.iiterface.inital;

public class ZInterfaceInitialDemo {

	public static void main(String[] args) {
		
		// Tạo ra đối tượng/ giá trị cho biến có KDL IntTest / StringTest
		// Cách 1: Implementation Class
		
		IntTest it1 = new IntTestImpl();
		StringTest st1 = new StringTestImpl();
		
		it1.test(2);
	}
}

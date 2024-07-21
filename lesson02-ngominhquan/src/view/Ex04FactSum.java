package view;

// import utils.MathUtils;
// import static utils.MathUtils.getFact;

import static utils.MathUtils.*; 
// import tất cả các hàm, thuộc tính static từ MathUtils vào class hiện tại

public class Ex04FactSum {

	public static void main(String[] args) {
		
		// import class
		// long sum = MathUtils.getFact(3) + MathUtils.getFact(5) + MathUtils.getFact(8);
		
		// để có thể sử dụng các hàm/thuộc tính static của class khác trong class hiện tại -> import static method/attribute vào
		
		long sum = getFact(3) + getFact(5) + getFact(8);
		
		System.out.println("Sum Of f(3) f(5) f(8) = " + sum);
		
		// bên ngoài class chứa hàm test --> phải lấy class gọi
		Ex04FactSum.test(1);
		Ex04FactSum.test(2);
		Ex04FactSum.test(3);
		Ex04FactSum.test(4);
	}
	
	public static void test (int a) {
		
	}
}

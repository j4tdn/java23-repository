package view_fixcode;

//import utils.MathUtils;

//import tất cả các hàm, thuộc tính static từ MathUtils vào class
import static utils.MathUtils.*;

public class Ex04FactorialSum {
	public static void main(String[] args) {
		// import class
		// long sum = MathUtils.getFact(3) + ....;
		
		// để có thể sử dụng các hàm/thuộc tính static của class khác trong class hiện tại
		// import static method/atrribute vào
		
		long sum = getFact(3) + getFact(5) + getFact(8);
		System.out.println("f(3) + f(5) + f(8) = " + sum);
	}
}

package review;
// import tất cả các hàm thuộc tính static từ MathUtils vào class hiện tại
import static utils.MathUtils.*;

public class Ex04FactSum {
	
	public static void main(String[] args) {
		
		long sum = getFact(3) + getFact(5) + getFact(8);
		
		System.out.println("sum f(3) f(5) f(8) = " + sum);
		
		test(1);
		test(2);
		test(3);
		test(4);
		
	}
	
	public static void test(int a) {
	}
}

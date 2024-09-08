package format;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ex02BigDecimal {
	
	/*
	 Trong dự án, sử dụng các KDL đối tượng(số thực)
	 Thay vì sử dụng float, double ==> BigDecimal
	 
	 + Hỗ trợ lưu trữ dữ liệu lớn hơn (4, 8, 16 bytes) MathContext
	 + Hỗ trợ các hàm tính toán khỏi phải dùng + - / *
	 + Hỗ trợ các phép làm tròn
	 
	 Tạo ra giá trị BigDecimal
	 
	 + new BigDecimal(string)
	 + BigDecimal.valueOf(double) --> KHÔNg dùng
	 + new BigDecimal(double)     --> KHÔNG dùng --> tự động thêm chấm động phía sau
	 */
	
	public static void main(String[] args) {
		int a1 = 28891;
		float a2 = 24.88f;
		float a3 = 12.4797f;
		float a4 = 345.786786f;
		
		// cần thực hiện a2 * a3 --> làm tròn 2 chữ số phần thập phân
		// được KQ * a1 / a4 --> làm tròn 8 chữ số thập phân
		
		// float: tối đa cả nguyên, thâp phân là 8 chữ số
		// double:                               ? 16 
		
		// double a23 --> 2931.2319567871095
		// float a23 --> 2931.232
		float a23 = a2 * a3;
		System.out.println("a23 --> " + a23);
		
		System.out.println("\n");
		
		// 310.4949277285231715070241689682
		// 310.4949277285231715070241689682: UNLIMITED
		// 310.4949 ==> 32
		// 310.4949277285232 ==> 64
		// 310.4949277285231715070241689682 ==> 128
		
		// https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/math/MathContext.html
		// tự động làm tròn HALF_EVEN
		
		// BigDecimal bdA23 = bd(a2).multiply(bd(a3), MathContext.DECIMAL128);
		BigDecimal bdA23 = bd(a2).multiply(bd(a3))
				.setScale(2, RoundingMode.HALF_UP)
				.multiply(bd(a1))
				.divide(bd(a4), 8, RoundingMode.HALF_UP);
		// nếu gọi hàm divide --> truyền vào ít nhất RoundMode hoặc scale hoặc MathContext
		System.out.println("bdA23 --> " + bdA23);
	}
	
	private static BigDecimal bd(double dvalue) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
	}
	
	private static BigDecimal bd(String svalue) {
		return new BigDecimal(svalue);
	}
	
	
	
}
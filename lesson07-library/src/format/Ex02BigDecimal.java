package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigDecimal {
	
	/*
	 Trong dự án sử dụng KDL đối tượng liên quan đến số thực
	 Thay vì sử dụng float, double ==> BigDecimal
	 
	 + Hỗ trợ lưu trữ dữ liệu lớn hơn (4, 8, 16 bytes) thông qua MathContext
	 + Hỗ trợ các hàm tính toán (không phải dùng + - * / () )
	 + Hỗ trợ các phép làm tròn
	 
	  Tạo ra giá trị BigDecimal
	  
	  + new BigDecimal(string)
	  + BigDecimal.valueOf(double) KHÔNG dùng 
	  + new BigDecimal(double) --> KHÔNG dùng --> tự động thêm chấm động phía sau
	 */
	
	public static void main(String[] args) {
		
		int a1 = 28891;
		float a2 = 24.88f;
		float a3 = 12.4797f;
		float a4 = 345.786786f;
		
		// cần thực hiện a2 * a3  --> làm trò 2 chữ số phần thập phân
		// được KQ * a1 / a4 --> làm trò 8 chữ số thập phân
		
		// float: tối đa cả phần nguyên, thập phân là 8 chữ só
		// double: 									  ? 13 chữ số
		
		// double a23 --> 2931.2319567871095
		// float a23 --> 2931.232
		
		float a23 = a2 * a3;
		System.out.println("a23 --> " + a23);
		
		System.out.println("a2 --> " + new BigDecimal(a2));
		System.out.println("a2 --> " + new BigDecimal(String.valueOf(a2)));
		System.out.println("a2 --> " + BigDecimal.valueOf(a2));
		
		System.out.println("\n");
		
		// bdA23 --> 688487.770875155925750732421875
		
		
		// tự độn làm tròn HALF_EVEN
		
		// BigDecimal bdA23 = bd(a2).multiply(bd(a3), MathContext.DECIMAL32);
		BigDecimal bdA23 = bd(a2).multiply(bd(a3))
				.setScale(2, RoundingMode.HALF_UP)
				.multiply(bd(a1))
				.divide(bd(a4), 9, RoundingMode.HALF_UP); 
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

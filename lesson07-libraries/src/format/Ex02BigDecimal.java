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
	 		
	 	- Tạo ra giá trị BigDecimal
	 		+ new BigDecimal(String)
	 		+ BigDecimal.valueOf(double)
	 		+ new BigDecimal(double) --> KHÔNG dùng -> tự động sinh phần chấm động phía sau làm thay đổi giá trị...
	 */
	public static void main(String[] args) {
		int a1=28891;
		double a2=234.88d;
		float a3=12.4797f;
		float a4 = 345.78678f;
		// Cần thực hiện a2 * a3 -> làm tròn 2 chữ số phần thập phân
		// Được kết quả đem * vs a1 -> đem / a4 -> làm tròn 8 chữ số thập phân
		
//		BigDecimal bdA23 = bd(a2).multiply(bd(a3));
//		BigDecimal bdA23 = bd(a2).multiply(bd(a3), MathContext.DECIMAL128); // theo từng bytes 4 ,8 ,16
		BigDecimal bdA23 = bd(a2).multiply(bd(a3)
				.setScale(2, RoundingMode.HALF_UP)
				.multiply(bd(a1)).divide(bd(a4),8, RoundingMode.HALF_UP));
//				nếu gọi hàm divide --> truyền vào it nhất RoundMode hoặc scale hoặc MathContext
		System.out.println("bdA23 -> " + bdA23);
	}
	
	private static BigDecimal bd(double dvalue) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
		
	}
	private static BigDecimal bd(String svalue) {
		return new BigDecimal(svalue); 
		
	}
}

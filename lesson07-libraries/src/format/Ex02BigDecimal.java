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
	 
	 + new BigDecimal (string)
	 + BigDecimal.valueOf (double)
	 + new BigDecimal (double) --? KO dùng --> tự động thêm chấm động phía sau
	 
	 */
	
	public static void main(String[] args) {
		int a1 = 15987;
		float a2 = 87.02f;
		float a3 = 12.3456f;
		float a4 = 567.8912345f;
		
		// cần thực hiện a2 * a3 --> làm tròn đến 2 chữ số thập phân
		// đc kq * a1 / a4 --> làm tròn 8 chữ số thập phân
		
		// float: tối đa cả nguyên, thập phân là 8 chữ số
		// double:                               ?13
		
		float a23 = a2 * a3;
		System.out.println("a23 --> " + a23);
		
		System.out.println("\n");
		
		// BigDecimal bdA23 = bd(a2).multiply(bd(a3), MathContext.DECIMAL128);
		 BigDecimal bdA23 = bd(a2).multiply(bd(a3)
				 .setScale(2, RoundingMode.HALF_UP)
				 .multiply(bd(a1))
				 .divide(bd(a4), 8, RoundingMode.HALF_UP));
		
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

package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigDecimal {

	/*
	 
	 Trong dự án, sử dụng các KDL đối tượng(số thực)
	 Thay vì sử dụng float, double ==> BigDecimal
	 
	 + Hỗ trợ lưu trữ dữ liệu lớn hơn (4, 8, 16 bytes) MathContext
	 + Hỗ trợ các hàm tính toán, khỏi phải dùng + - / *
	 + Hỗ trợ các phép làm tròn
	 
	 Tạo ra giá trị BigDecimal
	 + new BigDecimal(string)
	 + BigDecimal.valueOf(double) --> KHÔNG dùng
	 + new BigDecimal(double) --> KHÔNG dùng --> tự động thêm chấm động phía sau
	 
	 + Có 4 kiểu BigDecimal: 4(32), 8(64), 16(128), unlimited
	 + Tự động làm tròn HALF_UP: làm tròn lên
	 + HALF_EVEN: số lẻ làm tròn lên, số chẵn làm tròn xuống
	 
	 
	 
	 */
	public static void main(String[] args) {
		
		int a1 = 28891;
		double a2 = 234.88d;
		float a3 = 12.4797f;
		float a4 = 345.786786f;
		
		// Cần thực hiện a2 * a3 --> làm tròn 2 chữ số phần thập phân
		// Được KQ * a1 / a4 --> làm tròn 8 chữ số thập phân
		
		// float: tối đa cả nguyên, thập phân là 8 chữ số
		// double:                               ? 13-14 chữ số
		
		BigDecimal bdA23 = bd(a2).multiply(bd(a3))
				.setScale(2, RoundingMode.HALF_UP)
				.multiply(bd(a1))
				.divide(bd(a4), 8, RoundingMode.HALF_UP);
		// Nếu gọi hàm divide --> truyền vào ít nhất RoudMode hoặc scale hoặc MathContext
		
		System.out.println("bdA23 --> " + bdA23);
	}
	
	private static BigDecimal bd(double dvalue) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
	}
	
	private static BigDecimal bd(String svlaue) {
		return new BigDecimal(svlaue);
	}
	
}

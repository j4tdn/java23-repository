package format;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ex02BigDecimal {

	
	/* 
	  Trong dự án, sử dụng KDL đối tượng (số thực)
	  Thay vì sử dụng float, double ==> BigDecimal
	  
	  + Hỗ trợ lưu trữ dữ liệu lớn hơn (4, 8, 16 bytes) MathContext
	  + Hỗ trợ các hàm tính toán không cần dùng + - / *
	  + Hỗ trợ các phép làm tròn
	  
	  Tạo ra giá trị BigDecimal
	  
	  + new BigDecimal(string)
	  + BigDecimal.valueOf(double);
	  + new BigDecimal(double) -> KHÔNG DÙNG --> tự động thêm dấu chấm phía sau
	  
	  
	  
	 */
	
	public static void main(String[] args) {
	
		int a1 = 2891;
		double a2 = 234.88d;
		float a3 = 234.2772f;
		float a4 = 2345.234522f;
		
		// cần thực hiện a2 * a3 --> làm tròn 2 chữ số phần thập phân
		// được KQ * a1 / a4 --> làm tròn 8 chữ số thập phân
		
		// float : tối đa cả phần nguyên + thập phân là 8 chữ số 
		// double  							 			13 
		
		// result double : 55027.030244140624
		double a23 = a2 * a3;
		System.out.println("result --> " + a23);
		
		
		// bdA23 --> 55027.03 --> 32
		// bdA23 --> 55027.03024414063 --> 64
		// bdA23 --> 55027.0302441406255872 --> 128
		// bdA23 --> 55027.0302441406255872 --> UNLIMITED
		// bdA23 --> 55027.0302441406255872 --> default
		
		// tự động làm tròn HALF_EVEN
				
//		BigDecimal bdA23 = bd(a2).multiply(bd(a3), MathContext.UNLIMITED);
		
		BigDecimal bdA23 = bd(a2).multiply(bd(a3))
				.setScale(2, RoundingMode.HALF_UP)
				.multiply(bd(a1))
				.divide(bd(a4), 8, RoundingMode.HALF_UP);  
		//divide --> truyền vào ít nhất là RoundingMode hoặc scale hoặc MathContext
		
		System.out.println("\nbdA23 --> " + bdA23);
	
		
	}
	
	private static BigDecimal bd(double dvalue) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
	}
	private static BigDecimal bd (String svalue) {
		return new BigDecimal(svalue);
	}
}

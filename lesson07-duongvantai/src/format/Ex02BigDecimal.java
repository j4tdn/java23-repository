package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigDecimal {

	/*
	  Trong dự án , sử dụng các KDL đối tượng (số thực)
	Thay vì sử dụng float, double ==> BigDecimal
	
	- Hôx trợ lưu trữ dữ liệu lớn hơn (4, 8 , 16 byte) MathContext
	- Hố trợ các hàm tính toán khỏi phải dùng + - * /
	- Hỗ trợ các phép làm tròn
	
	Tạo ra giá trọ BigDecimal
	
	+ new BigDecimal(String)
	+ BigDecimal.valueOf(double)
	+new BigDecimal(double) ==> Không dùng
	 */
	public static void main(String[] args) {
		int a1 = 12321;
		double a2 = 345.88d;
		float a3 = 12.345645f;
		float a4 = 3423.567f;
		
		// cần thực hiện a2  * a3 --> làm tròn 2 chữ số phần thập phân 
		// đc KQ * a1 / a4 --> làm tròn 8 chữ số thập phân 
		// float: tố đa cả nguyên và thaapj phân 8 chữ số
		// double:                               16
		
		BigDecimal bdA23 = bd(a2).multiply(bd(a3))
				.setScale(2, RoundingMode.HALF_UP)
				.multiply(bd(a1))
				.divide(bd(a4), 8, RoundingMode.HALF_UP);
		System.out.println("KQ = " + bdA23);
	}
	private static BigDecimal bd(double dvalue) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
	}
	private static BigDecimal bd(String dvalue) {
		return new BigDecimal(dvalue);
	}
	
}

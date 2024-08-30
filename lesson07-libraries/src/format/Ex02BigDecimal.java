package format;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ex02BigDecimal {

	/*
	Trong du an, su dung cac KDL doi tuong(so thuc)
	Thay vi su dung float, double ==> BigDecimal
	
	+ Ho tro luu tru du lieu lon hown (4 ,8, 16 bytes) MathContext
	+ Ho tro cac ham tinh toan khoi phai dung + - / *
	+ Ho tro cac phep lam tron
	
	Tao ra gia tri BigDecimal
	
	+ new BigDecimal(string);
	+ BigDecimal.valueOf(double)
	+ new BigDecimal(double) --> KHONG DÙNG --> tu dong them chấm động phía sau 
	
	 */
	public static void main(String[] args) {
		int a1 = 27936;
		float a2 = 24.58f;
		float a3 = 12.824f;
		float a4 = 345.632423f;
		// can thuc hien a2 * a3 --> lam tron 2 chu so phan thap phan
		// duoc KQ * a1 / a4 --> lam tron 8 chu so thap phan
		
		// float: toi da ca nguyen, thap phan la 8 chu so
		// double: toi da ca nguyen, thap phan la 16 chu so
		
		float a23 = a2 * a3;
		System.out.println("a23 --> " + a23);
		
//		System.out.println("a2 1 --> " + new BigDecimal(a1));
//		System.out.println("a2 2 --> " + new BigDecimal(String.valueOf(a1)));
//		System.out.println("a2 3 --> " + a23);
		
		System.out.println("\n");
		
	//	BigDecimal bdA23 = bd(a2).multiply(bd(a3), MathContext.DECIMAL128);
		BigDecimal bdA23 = bd(a2).multiply(bd(a3))
						   .setScale(2, RoundingMode.HALF_UP)
						   .multiply(bd(a1))
						   .divide(bd(a4), 8, RoundingMode.HALF_UP); // divide --> truyen vao it nhat RoundingMode 
																	//				hoac scale hoac MathContext
		
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

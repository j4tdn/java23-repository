package format;

import java.math.BigDecimal;
import java.math.MathContext;

public class Ex02BigDecimal {
	public static void main(String[] args) {
		/*
		 * Trong du an su dung cac KDL doi tuong (so thuc)
		 * Thay vi su dung float, double ==> BigDecimal
		 *  + ho tro luu tru du lieu lon hon (4, 8, 16 bytes) MathContext
		 *  + Ho tro cac ham tinh toan khoi phai dung + - / *
		 *  + ho tro cac phep lam tron
		 *  
		 *  Tao ra gia tri BigDecimal
		 *  
		 *  + new BigDecimal(string)
		 *  BigDecimal.valueOf(double)
		 *  new BigDecimal (double) --> k dung --> tu dong them cham dong phia sau
		 */
		
		int a1 = 28891;
		float a2 = 234.88f;
		float a3 = 12.4797f;
		float a4 = 345.786786f;
		
		// float: toi da phan nguyen, thap phan la 8 chu so 
		// double: 									13
		//double a23 = a2 * a3;
		//System.out.println("a23 --> " + a23);
		
		float a23 = a2 * a3;
		System.out.println("a23 --> " + a23);
		
		BigDecimal bdA23 = bd(a2).multiply(bd(a3), MathContext.DECIMAL128);
		System.out.println("bdA23 --> " + bdA23);
		
		System.out.println("a2 1 --> " +  new BigDecimal(a1));
		System.out.println("a2 2 --> " +  new BigDecimal(String.valueOf(a2)));
		System.out.println("a2 3 --> " +  BigDecimal.valueOf(a1));
		
	}
	private static BigDecimal bd(double dvalue) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
	}
	
	private static BigDecimal bd(String svalue) {
		return new BigDecimal(svalue);
	}
}

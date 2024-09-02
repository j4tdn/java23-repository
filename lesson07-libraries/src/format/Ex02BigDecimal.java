package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigDecimal {
	
/*
 * Float, Double ==> BigDecimal 
 * để tạo một giá trị BidDecimal:
 * C1: new BigDecimal(String)
 * C2: BigDecimal.valueOf(Double)
 */
	
	public static void main (String arg[]) {
		int a1 = 28801;
		double a2 = 234.88d;
		float a3 = 12.2345335f;
		float a4 = 345.678767f;
		
		//a2 * a3 --> làm tròn đến 2 chữ số thập phân.
		//KQ * a1 / a4 --> làm tròn đến 8 chữ số thập phân.
		
		BigDecimal bdA23 = bd(a2).multiply(bd(a3)).
				setScale(2, RoundingMode.HALF_UP).
				multiply(bd(a1)).divide(bd(a4), RoundingMode.HALF_UP).
				setScale(8, RoundingMode.HALF_UP);
		
		System.out.println(bdA23);
		
	}
	
	private static BigDecimal bd (double dvalue) {
		String value = String.valueOf(dvalue);
		return bd(value);
	}
	
	private static BigDecimal bd (String value) {
		return new BigDecimal(value);
	}
	
}

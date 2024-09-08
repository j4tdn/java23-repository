package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigDecimal {
	/*
	 * Trong dự án, sử dụng KDL đối tượng (Số thực)
	 * 
	 * Thay vì float, double -> BigDecimal
	 * 
	 * + Hỗ trợ lưu trữ dự liệu lớn hơn (4,8,16 bytes) ..
	 * + Hỗ trợ các phép làm tròn
	 * + Hỗ trợ các hàm tính toán khỏi phải dùng + - * /
	 * 
	 * Tạo ra giá trị BigDecimal
	 * 
	 * + new BigDecimal(string) --> best practices.
	 * + BigDecimal.valueOf(double) --> KHÔNG nên
	 * + new BigDecimal(double) -> KHÔNG DÙNG 
	 */

	public static void main(String[] args) {
		int a1 = 28891;
		float a2 = 234.88f;
		float a3 = 12.4797f;
		float a4 = 345.75654f;

		// cần thực hiện a2 * a3 -> làm tròn 2 chữ số thập phân
		// được KQ * a1 / 4 -> làm tròn 8 chữ số thập phân

		// float --> giá trị tối đa 8 chữ số cả nguyên cả thập phân
		// double -->

		// double a23 -> 2931.23196532453245
		// float a23 --> 2931.232
		float a23 = a2 * a3;
		System.out.println("a23 --> " + a23);

		System.out.println("a2 --> " + new BigDecimal(String.valueOf(a2)));
		System.out.println("a2 --> " + new BigDecimal(a2));

		// Decimal32 -> 7 chữ số
		// Decimal64 -> 16 chữ số
		// Decimal128 -> Default -> 32 chữ số

		// tự động làm tròn HALF_EVEN

		// BigDecimal bd23 = bd(a2).multiply(bd(a3), MathContext.DECIMAL32);
		BigDecimal bd23 = bd(a2).multiply(bd(a3))
				.setScale(2, RoundingMode.HALF_UP)
				.multiply(bd(a1))
				.divide(bd(a4), 8, RoundingMode.HALF_UP); // divide --> truyền vào RoundingMode hoặc Scale hoặc
															// MathContext
		System.out.println(bd23);
	}

	private static BigDecimal bd(double dvalue) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
	}

	private static BigDecimal bd(String svalue) {
		return new BigDecimal(svalue);
	}
}

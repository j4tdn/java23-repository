package format;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ex02BigDecimal {

	/*
	 
	  Trong dự án, sử dụng các KDL đối tượng(số thực)
	  Thay vì sử dụng float, double --> BigDecimal 
	  
	  +Hỗ trợ lưu trữ dữ liệu lớn hơn(4,6,16 byte)MathContext 
	  +Hỗ trợ các hàm tính toán khỏi phải dùng + - / *
	  + Hỗ trợ các phép làm tròn
	  
	   Tạo ra giá trị BigDecimal
	   
	   + new BigDecimal(string.valueOf(value))
	   + BigDecimal.valueOf(double)
	   + new BigDecimal(double)---> k dùng ---> tự dộng thêm chấm động phía sau 
	 */
	public static void main(String[] args) {
		int a1 = 28891;
		double a2 = 234.88d;
		float a3 = 12.44125f;
		float a4 = 345.783213f;

		// cần thực hiện a2 * a3 --> làm tròn 2 chữ số thập phân
		// được KQ * a1 /a4 --> làm tròn 8 chữ số thập phân

//			float: tối đa cả nguyên và thập phân là 8 chữ số 

//			double a23 = 2931.2319561095
//			float a23 = 2931.232

		double a23 = a2 * a3;
		System.out.println("a23 --->" + a23);
//        310.4949277285231715070241689682
//        310.4949277285231715070241689682: UNLIMITED
//        310.4949 ==> 32 byte
//        310.4949277285232 ===> 64 byte
//      310.4949277285231715070241689682: ===> 128 byte

		
		
		System.out.println("\n=========================\n");
		System.out.println("a2 1 --> " + new BigDecimal(a1));
		System.out.println("a2 2 --> " + new BigDecimal(String.valueOf(a1)));
		System.out.println("a23 --> " + a23);

		System.out.println("\n");

		BigDecimal bdA23 = bd(a2).multiply(bd(a3))
				.setScale(2, RoundingMode.HALF_UP)
				.multiply(bd(a1)).divide(bd(a4), 8,	RoundingMode.HALF_UP);
//           Nếu gọi hàm divide  --> truyền vào ít nhất RoundMode hoặc scale hoặc MathContext

		System.out.println("bdA23 ---> " + bdA23);
	}

	private static BigDecimal bd(double dvalue) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
	}

	private static BigDecimal bd(String svalue) {
		return new BigDecimal(svalue);

	}
}

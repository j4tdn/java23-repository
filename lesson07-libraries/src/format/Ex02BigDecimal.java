package format;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Ex02BigDecimal {

	
	/*
	  Trong dự án, sử dụng các KDL đối tượng
	  Thay vì sử dụng float, double nên chuyên qua BigDecimal
	  
	  + Nó sẽ hỗ trợ lưu trữ lớn hơn
	  +Nó sẽ hỗ trợ hàm tính toán khỏi cần phải dung + -  / *
	  +Hỗ trợ các phép làm tròn
	  
	  Tạo ra giá trị BigDecimal
	  
	  +new BigDecimal(String) Nên dùng
	  +BigDecimal.valueOf(double)
	  +new BigDecimal(double) -->> không dùng --> tự động thêm dấu chấm động ở phía sau
	  
	 
	  
	 */
	
	
	public static void main(String[] args) {
		int a1= 28891;
		float a2= 24.88f;
		float a3 = 12.4797f;
		float a4 = 345.786786f;
		
		//Cần thực hiện các phép toán a2 * a3
		//được kq *a1 / a4  --> làm tròn 8 chữ số thập phân
		
		
		float a23 = a2*a3;
		System.out.println("a23"+a23);
		
		//BigDecimal bda23= bd(a2).multiply(bd(a3),MathContext.DECIMAL64);
		BigDecimal bdA23 = bd(a2).multiply(bd(a3))
				.setScale(2,RoundingMode.CEILING.HALF_UP)
				.multiply(bd(a1))
				.divide(bd(a4),8,RoundingMode.HALF_UP);//divide --> truyền vào ít nhất có RoundMode hoặc scale hoặc mathcontext
		System.out.println("bdA23-->"+bdA23);
		
		
		//System.out.println("bda23-->"+bda23);
		
		//310.4949277285231715070241689682
		//310.4949277285231715070241689682 .UNLIMITED
		//310.4949 ==>32 byte
		//310.4949277285232 ==> 64 byte
		
//		System.out.println("a2 1-->"+new BigDecimal(a2));
//		System.out.println("a2 2-->"+new BigDecimal(String.valueOf(a2)));
//		System.out.println("a2 3-->"+BigDecimal.valueOf(a2));
		
	}
	
	private static BigDecimal bd(double dvalue ) {
		String svalue = String.valueOf(dvalue);
		return bd(svalue);
	}
	private static BigDecimal bd(String svalue ) {
		return new BigDecimal(svalue);
	}
}

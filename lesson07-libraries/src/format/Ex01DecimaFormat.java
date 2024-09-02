package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;

public class Ex01DecimaFormat {
	/*
	 * input KDl A ---> format ---> KDL String
	 * làm tròn là làm thay đổi kết quả ban đầu, còn format không làm thay đổi kết quả ban đầu mà chỉ chuyển nó thành một dạng khác.
	 * # optional
	 * 0 required
	 * . ngăn phần thập phân 
	 * , ngăn phần số nguyên 
	 * khuyến khích:
	 * 		Phàn nguyên: #
	 * 		Phần thập phân: #, 0
	 * 
	 */
	
	public static void main (String args[]) {
		double[] values = {22.185};
		System.out.println("value --> " + Arrays.toString(values)); // 1.2E10 = 1.2 * 10^10
		
		DecimalFormat df = new DecimalFormat("#.##");
		for (double value : values) {
			String formatted = df.format(value);
			System.out.println(value + "-->" + formatted);
		}
		
		NumberFormat nf =  NumberFormat.getCurrencyInstance();
		for (double value : values) {
			String formatted = nf.format(value);
			System.out.println(value + "-->" + formatted);
		}
	}
}

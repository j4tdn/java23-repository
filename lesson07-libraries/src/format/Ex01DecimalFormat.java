package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {
	
	/*
	  Format
	  
	  Input: KDL A --> format --> KDL String
	  
	  Làm tròn: thay đổi KQ ban đầu
	  Định dạng: không thay đổi KQ ban đầu, chỉ in ra KQ đó owe định dạng này, kia 
	  
	  pattern
	  ==================
	  #: số(optional)
	  0: số(required)
	  .: phần thập phân
	  ,: phần nguyên
	 */
	
	public static void main(String[] args) {
		double[] values = {22.185d, 787.2d, 1234d, 8686.5877d};
		System.out.println("value --> " + Arrays.toString(values)); // 2.9E9 --> 2.9 * 10^9
		
		System.out.println("=========== format ==========");
		
		Locale.setDefault(new Locale("vi","VN"));
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		for (double value: values) {
			String formatted = df.format(value);
			System.out.println(value + " --> " + formatted);
		}
		
		System.out.println("\n=========== format currency ==========");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for (double value: values) {
			String formatted = nf.format(value);
			System.out.println(value + " --> " + formatted);
		}
	}

}

package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {

	/*
	  
	 Format
	 
	 Input: KDL A --> format --> KDL String
	 
	 Số: 5612.562484 (Giá trị) --> format --> String 5612.56 (in ra)
	 
	 Làm tròn: thay đổi kq ban đầu 
	 Định dạng: ko thay đổi kết quả ban đầu, chỉ in ra kq đó ở định dạng này kia 
	  
	 */
	
	public static void main(String[] args) {
		double[] values = {150.902d, 807.02d};
		System.out.println("values --> " + Arrays.toString(values)); // 8.7E3 --> 8.7 * 10^3
		
		System.out.println("\n========== format ==========\n");
		
		Locale.setDefault(new Locale("da", "DK"));
		
		DecimalFormat df = new DecimalFormat("#.##");
		for (double value: values) {
			String formatted = df.format(value);
			System.out.println(value + " --> " + formatted);
		}
		
		System.out.println("\n========= format currency =========\n");
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for (double value: values) {
			String formatted = df.format(value);
			System.out.println(value + " --> " + formatted);
		}
		
	}
}

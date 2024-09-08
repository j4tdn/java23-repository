package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {
	
	/*
	 
	 Format
	 
	 Input: KDL A --> format --> KDL String 
	 
	 Số: 6272.271818 (Giá trị) --> format --> String 6272.27(in ra)
	 
	 Làm tròn: thay đổi KQ ban đầu
	 Định dạng: không thay đổi KQ ban đầu, chỉ in ra KQ đó ở định dạng này, kia
	 pattern
	 ==============
	 #: số(optional)
	 0: số(required)
	 .: phần thập phân
	 ,: phân nguyên
	 
	 */
	
	public static void main(String[] args) {
		double[] values = {22.186d, 7.2d, 67461234d, 8686.5877d};
		System.out.println("values --> " + Arrays.toString(values)); // 2.2E7 --> 2.2 * 10^7
		
		System.out.println("\n============== format ==============\n");
		
		// Locale.setDefault(new Locale("vi", "VN"));
		System.out.println("default --> " + Locale.getDefault());
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		for (double value: values) {
			String formatted = df.format(value);
			System.out.println(value + " --> " + formatted);
		}
		
		System.out.println("\n============== format currency ==============\n");
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for (double value: values) {
			String formatted = nf.format(value);
			System.out.println(value + " --> " + formatted);
		}
	}
	
}
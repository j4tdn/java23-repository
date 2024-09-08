package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {

	
	/*
	 
	 Format
	 
	 Input: KDL A --> format -->KDL String
	 
	 Số : 6272.27818 (Giá trị) -> format --> String 6272.24 (in ra)
	 
	 Làm tròn : thay đổi kq ban đầu
	 Định dạng: không thay đổi KQ ban đầu, chỉ in ra KQ đó ở định dạng khác
	 
	 #: số (optional)
	 0: số (required)
	 . : phần thập phân
	 , : phần nguyen
	 
	 */
	
	public static void main(String[] args) {
		
		double[] values = {22.185d, 787.2d, 1234, 8686.5877};
		System.out.println("value --> " + Arrays.toString(values)); // 2.7E10 --> 2.7 * 10^10
		
		Locale.setDefault(new Locale ("vi", "VN"));
		
		System.out.println("============== Format ===============");
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for (double value: values) {
			String formatted = df.format(value);
			System.out.println("value --> " + formatted);
		}		
		
		System.out.println("================= format currency ==============");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for (double value: values) {
			String formatted = nf.format(value);
			System.out.println("value --> " + formatted);
		}
		
	}
	
}

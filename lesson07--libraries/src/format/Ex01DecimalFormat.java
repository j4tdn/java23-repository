package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {

	/*
	 
	 Format
	 
	 Input: KDL A --> format --> KDL String
	 
	 Số: 6272.72947 (Giá trị) --> format --> String 6272.72(in ra)
	 
	 Làm tròn: thay đổi KQ ban đầu
	 Định dạng: không thay đổi KQ ban đầu, chỉ in ra KQ đó ở định dạng này, định dạng kia
	 
	 pattern
	 =================
	 #: số(optinal)
	 0: số(required)
	 .: phần thập phân
	 ,: phần nguyên
	 
	 */
	
	public static void main(String[] args) {
		
		double[] values = {22.185d, 787.2d, 1234, 8686.5877};
		System.out.println("Value --> " + Arrays.toString(values)); // 2.2E'n' --> 2.2 * 10^'n'
		
		System.out.println("\n============= format ==============\n");
		
		Locale.setDefault(new Locale("vi", "VN"));
		System.out.println("default --> " + Locale.getDefault());
		
		DecimalFormat df = new DecimalFormat("#.##");
		for (double value : values ) {
			String formatted = df.format(value);
			System.out.println(value + " --> " + formatted);
		}
		
		System.out.println("\n============= format currency ==============\n");
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for (double value : values ) {
			String formatted = nf.format(value);
			System.out.println(value + " --> " + formatted);
		}
		
	}
	
}

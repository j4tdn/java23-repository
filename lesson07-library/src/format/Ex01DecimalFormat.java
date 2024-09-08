package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {
	/*
	 * Format
	 * 
	 * Input: KDL A --> format --> KDL String
	 * 
	 * Số: 13434234.234234 -> format -> 13124.32 
	 */
	
	public static void main(String[] args) {
		double[] values = { 22.185d, 782.2d, 324d, 1234.85623d };

		System.out.println("values --> " + Arrays.toString(values));
		
		// #: số (optional)
		// 0: số (required)
		// .: phần thập phân
		// ,: phần nguyên

		Locale.setDefault(new Locale("vi", "VN"));

		DecimalFormat df = new DecimalFormat("#,###.00");

		for (double value : values) {
			String formatted = df.format(value);
			System.out.println(value + " --> " + formatted);
		}

		System.out.println("\n====== Format Currency ========");
		NumberFormat nf = NumberFormat.getCurrencyInstance();

		for (double value : values) {
			String formatted = nf.format(value);
			System.out.println(value + " --> " + formatted);
		}
	}
}

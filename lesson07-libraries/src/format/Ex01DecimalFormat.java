package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {

	/*
	 * Format Input: KLD A --> format --> KDL String
	 * 
	 * So: 6272.234242 (Gia tri) --> format --> String 6272.23(in ra)
	 * 
	 * Lam tron: thay doi KQ ban dau Dinh dang: ko thay doi KQ ban dau, chi in ra KQ
	 * do o dinh dang nay, kia
	 * 
	 * #: so(optional) 0: so(required) ,: phan nguyen .: phan thap phan
	 */
	public static void main(String[] args) {
		double[] values = { 22.185d, 787.2d, 1234d, 8686.5877d };
		System.out.println("value --> " + Arrays.toString(values)); // 2.9E7 -> 2.9 * 10^7

		System.out.println("\n================= format ================\n");

		System.out.println("default --> " + Locale.getDefault());
		
		Locale.setDefault(new Locale("vi", "VN"));

		DecimalFormat df = new DecimalFormat("#,###.00");
		for (double value : values) {
			String formatted = df.format(value);
			System.out.println(value + " --> " + formatted);
		}

		System.out.println("\n================ format currency =================\n");

		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for (double value : values) {
			String formatted = nf.format(value);
			System.out.println(value + " --> " + formatted);
		}
	}
}

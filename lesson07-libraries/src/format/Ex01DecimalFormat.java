package format;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {
	/*
	 * format
	 * input: KDL a --> format --> kdl string
	 * so: 6272.271818 (gia tri) --> format --> String 6272.1
	 * 
	 * Lam tron: thay doi kq ban dau
	 * dinh dang: k thay doi kq ban dau, chi in ra kq do o dinh dang nay, dinh dang kia
	 
	 pattern
	 * #: so (optinal)
	 * 0: so (required)
	 * .: phan thap phan
	 * ,: phan nguyen
	 */
	public static void main(String[] args) {
		double [] values = {22.185d, 787.2d, 1234, 673423483, 8686.5877d};
		System.out.println("value -->" + Arrays.toString(values));
		
		Locale.setDefault(new Locale("vi", "VN")); // dia diem dan mach
		System.out.println("default --> " + Locale.getDefault());
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		for (double value: values) {
			String formatted = df.format(value);
			System.out.println(value + " --> " + formatted);
		}
		
		System.out.println("\n====================format currency=========================");
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for (double value: values) {
			String formatted = nf.format(value);
			System.out.println(value + " --> " + formatted);
		}
	}
}

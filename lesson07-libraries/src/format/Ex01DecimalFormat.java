package format;

import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {

	/*
	  	Format Input: KDL A -> format -> KDL String
	  	
	  	Số: 6244.2424 (giá trị) --> format --> 6244.24
	  	Làm tròn: thay đổi KQ ban đầu
	  	Định dạng: ko thay đổi KQ ban đầu, chỉ in ra KQ đó ở định dàng này, kia
	  	
	  	* Công thức:
		  	# : là cho số (optional)
		  	0 : là số(required)
		  	. : phần thập phân
		  	, : phần nguyên
	 */
	public static void main(String[] args) {
//		double value = 2242422524.7282830299d;
		double[] values = {22.185d, 787.2d, 1234d, 8686.8577d};
		System.out.println("value --> "+ Arrays.toString(values));  // 2.2E7 --> 2.2*10^19
		
		System.out.println("\n=================== format ===============================\n");
		Locale.setDefault(new Locale("da", "DK")); // in theo định dạng của đan mạch -> tùy ý thay đổi
//		DecimalFormat df = new DecimalFormat("#.##");
//		DecimalFormat df = new DecimalFormat("#.00");
//		DecimalFormat df = new DecimalFormat("000.##"); // phần nguyên ko nên để 000 -> xấu
		
		DecimalFormat df = new DecimalFormat("#,###.00"); // phần nguyên như z sẽ cách nhau 3 chữ số có dấu , còn phần thập phân thì bắt buộc có 2 phần tủ-> Công thức
		
		for(double value: values) {
			String formated = df.format(value);
			System.out.println(value + " --> " + formated);
		}
		
		Locale.setDefault(new Locale("vi", "VN")); 
		System.out.println("\n=================== format currency ===============================\n");
	
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for(double value: values) {
			String formated = nf.format(value);
			System.out.println(value + " --> " +formated);
		}
		
		
		
		
	}
}

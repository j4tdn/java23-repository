package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Locale;

public class Ex01DecimalFormat {
	/*
		  Format
		  Input :KDL A->format -->KDl String
		  
		  Số : 6272.271818(Giá trị )--> format --> String 6272.27(in ra)
		  
		  Làm tròn kết quả ban đầu
		  Định dạng: khong thay doi kq ban dau, chi in ra kq đó ở định dạng này,kia
		  
		  #: số(optional)
		  0:số(required)
		  ,:phần thập phân
		  ,:phần nguyên
		  
		 */
		
	public static void main(String[] args) {
		double [] values = {22.186d, 787.2d , 1234, 8686.5877};
		System.out.println("value -->"+Arrays.toString(values));//2.2E7 --> 2.2 *10 ^7
		
		
		System.out.println("============format=========\n");
		
//		Locale.setDefault(new Locale("vi","VN"));
		System.out.println("default-->"+ Locale.getDefault());
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		for (double value: values) {
			String formatted =df.format(value);
			System.out.println(value+"-->"+ formatted);
		}
		System.out.println("\n========== format currency=======\n");
		
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		for (double value: values) {
			String formatted =nf.format(value);
			System.out.println(value+"-->"+ formatted);
		}
		
		
		
	}
	
}

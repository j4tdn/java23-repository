package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Ex01DecimalFormat {

	/*
	  format
	  Input: KDL A --> format --> KDL String 
	  
	 Số: 6123123.213312(Giá trị ) --> format --> KDL String
	 
	 Làm tròn: thay đổi kq ban đầu 
	 Định dạng : k thay đổi kq ban đầu , chỉ in ra KQ đó ở định dạng này , kia
	 
	 Decimal Format
	 #: số(optional) : không bắt buộc
	 0: số (required) : bắt buộc
	   *Lưu ý: 
	        - In ra các format khác VD: 123.123,33
	        Sử dụng locale.setDea
 	 
	 */
	
	public static void main(String[] args) {
		double [] values = {22.185d,787.2d,1234,4353.3456d};
		System.out.println("value= " + values);
		Locale.setDefault(new Locale("vi", "VN"));
		
		System.out.println("\n======format========\n");
		
		DecimalFormat df = new DecimalFormat("#,###.00");
		
		for (double value: values) {
			String formatted= df.format(value);
			System.out.println(value + "--> " + formatted);
		}
		
		System.out.println("=======format currency====");
		NumberFormat nf =  NumberFormat.getCurrencyInstance();
		for (double value: values) {
			String formatted= nf.format(value);
			System.out.println(value + "--> " + formatted);
	}
	}
}


package format;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Ex01DecimalFormat {
        
	/*
	 *   Format
	 *   
	 *   Input: KDL A ---> format --> KDL String
	 *   
	 *   Số 6272.271818 (Gía trị) --> format --> String 6272.27(in ra)
	 *   
	 *   Làm tròn: thay đổi KQ ban đầu 
	 *   Định dạng: không thay đổi KQ ban đầu, chỉ in ra KQ ở dạng định dạng  này kia.
	 
	      #: số(optional)
	      0: số(required)
	      ,: phần nguyên
	      .: phần thập phân
	 
	 */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         
    	double[] values = {22.185d, 787,2d};
    	System.out.println("value ---> " +Arrays.toString(values));

    	System.out.println("\n=====================\n");
    	
    	DecimalFormat df = new DecimalFormat("#,###.00");
    	for(double value: values) {
    		String formatted = df.format(value);
System.out.println(value + "---> "+formatted);    	
}
    	Locale.setDefault(new Locale("Vi","VN"));
    	
       System.out.println("\n==============Format currency================\n");	
              NumberFormat nf = NumberFormat.getCurrencyInstance();
              for(double value : values) {
            	  String formatted = nf.format(value);
            	  System.out.println(value + "---> " +formatted);
              }
    } 
    
    
}

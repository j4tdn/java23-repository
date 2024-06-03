package controlling;

import java.util.Random;

public class Ex02TernaryOperator {

	public static void main(String[] args) {
		
		Random rd = new Random();
		int a = rd.nextInt();
		System.out.println("Số a = " +a);
		int b = rd.nextInt();
		System.out.println("Số b = " +b);
		
	String text =	a > b? ("Max là a = "+a) : ("Max là b = "+b);
	System.out.println(text);
	
// Xếp loại học lực 
	/*
	  float roundedAvgPoint = 2.8f;
	  String ranking = "";
	  if(roundedAvgPoint < 5){
	  ranking = "yeu"
	  } else 
	  if(roundedAvgPoint < 6.5){
	  ranking = "Trung Binh";
	  }else 
	  if(roundedAvgPoint < 8){
	  ranking = "Kha";
	  } else 
	 ranking = "gioi";
	 	System.out.println("Xep loai hoc luc ifelse: " +ranking);
	 	
	 	ranking = roundedAvgPoint < 5?"Yeu"
	 	                           :roundedAvgPoint < 6.5?"Trung Binh"
	 	                           :roundedAvgPoint <8?"Kha"
	 	                           :"Gioi
	 	     	System.out.println("Xep loai hoc luc ternary: " +ranking);
             
             
            Switch case, loop(for,while,dowhile);
            Array(basic)
	 	                                                  

	 */
	}
}

package view;

public class Ex02Boxing {
	
  public static void main(String[] args) {
	
	  int p1 = 5;
	  
	  Integer o1 =7 ;
	  Integer o2 = null;
	  Integer o3 = null;
	  
	  p1 = o1;
	  o1 = p1;
	 
	   System.out.println(" p1 --> " + p1);
	   
	   o3 = p1;
		 
	   System.out.println(" p3 --> " + o3);
	   
    }
}
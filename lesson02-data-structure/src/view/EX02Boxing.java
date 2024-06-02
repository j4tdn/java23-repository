package view;

public class EX02Boxing {

	public static void main(String[] args) {
		// boxing, unboxing , auto-boxing,auto-Unboxing
		// chỉ áp dụng với các kdl doi tuong có sẵn của java integer , double , Foloat , Long , Char
		int p1 = 5 ; // stack 
		Integer o1 = 7 ; // heap
		Integer o2 = 5 ;
		Integer o3 = null ;
		// Boxing : biến kdl nguyên thủy chuyển thành kdl đối tượng 
		// unboxing biến kdl đối tượng chuyển thành biến kdl nguyên thủy 
		
		p1 = o1 ;
		o1 = p1 ;
		System.out.println("p1 --> " +p1);
		
		o3 = p1 ;
		System.out.println("o3 --> " +o3);
		
		

	}

}

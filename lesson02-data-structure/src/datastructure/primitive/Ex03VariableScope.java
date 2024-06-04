package datastructure.primitive;

public class Ex03VariableScope {
	
	/*
	 một chương trình class gồm 2 phần 
	 
	 +dữ liệu
	   --> biến toàn cục
	       cú pháp: [access modifier] [staic] return_type value_name
	   
	  + chức năng
	    --> hàm, phương thức
	        cú pháp: [access modifier] [staic] [final] return_type method_name([...variables]) {body}
	        --> bên trong hàm, phương thức có thể khai báo biến cục bộ
	        [final] return_type method_name
	        phạm vi Block scope 
	        
	  quan tâm đến 2 quá trình
	  + coding --> compile - biên dịch 
	  + runing --> runtime - thực thi 
	  
	  phím tắt 
	  ctrl alt down/up --> copy nhanh 1 dòng
	  
	 */
	private static int g1 = 123;
    static int g2 = 234;
	
	
	public static void main(String[] args) {
		
		//biến cục bộ(loacl variabe)
		int a1 = 5;
		int a2 = 8;
		
		int b3 = 0;
		
		{
			b3 = 77;
			int b1 = 11;
			int b2 = 22;
			//int a1 = 44;
			
			System.out.println("a1 --> " + a1);
		    System.out.println("b1 --> " + b1);
			System.out.println("b2 --> " + b2);
		}
		
		System.out.println("a1 --> " + a1);
		System.out.println("a2 --> " + a2);
		// System.out.println("b1 --> " + b1);
		System.out.println("b3 --> " + b3);
		
		System.out.println("global g1 --> " + g1);
		System.out.println("global g2 --> " + g2);
		
		testScope(b3);
	}
	
	//int a2 = b3;
	private static void testScope(int a2) {
		
		// biến cục bộ - phạm vi trong hàm testScope
		char z1 = '!';
		char z2 = '#';
		int a1 = 55;
	}
}

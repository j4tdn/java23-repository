package datastructure.primitive;

public class Ex03VariableScope {
	/*
	  Một chương trình (class) gồm 2 phần 
	   + Dữ liệu
	   -> Biến toàn cục 
	  cú pháp :[access modifier] [static] [final] return_type variable_name; // +
	   + Chức năng: 
	   
	   
	 */	    
	public static void main(String[] args) {
		int a1 = 5;
		int a2 = 8;
		int b = 0;
		{
			b = 77;
			int b1 = 11;
			int b2 = 22;
		}
		System.out.println("a1 ---> "+ a1);
		System.out.println("a2 ---> "+ a2);
		System.out.println("a1 ---> "+ a1);
	}
}

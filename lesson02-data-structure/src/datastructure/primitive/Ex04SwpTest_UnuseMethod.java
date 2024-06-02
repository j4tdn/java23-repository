package datastructure.primitive;

public class Ex04SwpTest_UnuseMethod {

	public static void main(String[] args) {
		int a1=1;
		int b2=5;
		int b3=7;
		System.out.println("a1-->"+a1);
		System.out.println("b2-->"+b2);
		System.out.println("b3-->"+b3);
		
		a1=11;//thay đổi giá trị a1
		
		//hoán vị giá trị b2 & b3
		int temp =b2;
		b2=b3;	
		b3=temp;	
		System.out.println("a1 -->" +a1);
		System.out.println("b2 -->" +b2);
		System.out.println("b3 -->" +b3);


	}

}

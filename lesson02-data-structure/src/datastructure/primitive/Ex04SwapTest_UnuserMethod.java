package datastructure.primitive;

public class Ex04SwapTest_UnuserMethod {
	public static void main(String[] args) {
		int a1=1;
		int  b2=5;
		int b3=7;
		System.out.println("before");
		System.out.println("a1-->"+a1);
		System.out.println("b2-->"+b2);
		System.out.println("b3-->"+b3);
		
		int temp=b2;
		//hoan vi b2 va b3
		b2=b3;
		b3=temp;
		System.out.println("after");
		System.out.println("a1-->"+a1);
		System.out.println("b2-->"+b2);
		System.out.println("b3-->"+b3);
	}
}

package encapsulation.outside;

import encapsulation.inside.InTest01;
// Khac package nhung ma la con cua Intest01;
public class OutTest4 extends InTest01 {

	public static void main(String[] args) {
		
		System.out.println(InTest01.n2);
		System.out.println(InTest01.n3);
		//System.out.println(InTest01.n4);
	}
}

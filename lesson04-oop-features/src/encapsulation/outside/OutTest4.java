package encapsulation.outside;

import encapsulation.inside.InTest01;

public class OutTest4 extends InTest01 {	// khác package nhma là con của Intest01(thừa kế)
	public static void main(String[] args) {
		System.out.println(InTest01.n2); // public
		System.out.println(InTest01.n3); // protected
//		System.out.println(InTest01.n4); // ...
	}
}

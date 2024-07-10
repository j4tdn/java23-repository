package encapsulation.outside;

import encapsulation.inside.Intest01;
// khác package nhưng là con của InTest01
public class OutTest4  extends Intest01{
	public static void main(String[] args) {
		System.out.println(Intest01.n2); //public
		System.out.println(Intest01.n3); //protected
//		System.out.println(Intest01.n4); //...

	}
}

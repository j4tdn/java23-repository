package encapsulation.outside;

import encapsulation.inside.InTest01;

// khác package Test01 nhưng là con InTest01
public class OutTest4 extends InTest01{
	public static void main(String[] args) {
		System.out.println(InTest01.n2); //public
		System.out.println(InTest01.n3); //protected
		//System.out.println(InTest01.n4); //
	}
}

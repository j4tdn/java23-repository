package encapsulation.outside;

import encapsulation.inside.InTest01;

//khác package 
public class OutTest03 {
	public static void main(String[] args) {
		System.out.println(InTest01.n2); //public
		//System.out.println(InTest01.n3); //protected
		//System.out.println(InTest01.n4);
	}
}

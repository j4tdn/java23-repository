package encapsulation.inside;

// Cung package intest01
public class InTest02 {
	
	public static void main(String[] args) {
		System.out.println(InTest01.n2); //public
		System.out.println(InTest01.n3); //protected
		System.out.println(InTest01.n4); // ...
		System.out.println(InTest01.n2);
	}
}

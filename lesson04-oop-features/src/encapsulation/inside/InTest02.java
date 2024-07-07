package encapsulation.inside;

//Cùng package với InTest01.java
public class InTest02 {
	public static void main(String[] args) {
		System.out.println(InTest01.n2); // public
		System.out.println(InTest01.n3); // protected
		System.out.println(InTest01.n4); // ...
	}
}

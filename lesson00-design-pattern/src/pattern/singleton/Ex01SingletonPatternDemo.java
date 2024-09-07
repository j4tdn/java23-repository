package pattern.singleton;

public class Ex01SingletonPatternDemo {

	/*
	Singleton: Su dung de khoi tao doi tuong
	
	Class
	--> new constructor
	 */
	public static void main(String[] args) {
		KDate d1 = KDate.getInstance();
		d1.setMonth(2);
		System.out.println("d1 value --> " + d1);
		System.out.println("d1 hashcode --> " + System.identityHashCode(d1));
		
		System.out.println("\n");
		
		KDate d2 = KDate.getInstance();
		d2.setYear(4);
		System.out.println("d2 value --> " + d2);
		System.out.println("d2 hashcode --> " + System.identityHashCode(d2));
		
		System.out.println("\n");
		
		KDate d3 = KDate.getInstance();
		System.out.println("d3 value --> " + d3);
		System.out.println("d3 hashcode --> " + System.identityHashCode(d3));
	}
}

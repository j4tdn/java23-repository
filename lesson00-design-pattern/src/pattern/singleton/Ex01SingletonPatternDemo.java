package pattern.singleton;

public class Ex01SingletonPatternDemo {
	/*
	 * Singleton: Su dung de khoi tao doi tuong
	 * 
	 * Class
	 * --> new constructor() Tao N doi tuong
	 * --> builder pattern tao N doi tuong
	 *--> utils k the tao doi tuong
	 *--> Singleton pattern : tao 1 doi tuong duy nhat cho 1 class
	 *
	 *
	 * VD: Date, Calendar 
	 */
	
	public static void main(String[] args) {
		KDate d1 =  KDate.getInstance();
		d1.setMonth(2);
		System.out.println("d1 value --> " +d1);
		System.out.println("d1 hashcode --> " + System.identityHashCode(d1));
		
		KDate d2 =  KDate.getInstance();
		d2.setYear(2);
		System.out.println("d1 value --> " +d2);
		System.out.println("d1 hashcode --> " + System.identityHashCode(d2));
		
		KDate d3 =  KDate.getInstance() ;
		System.out.println("d1 value --> " +d3);
		System.out.println("d1 hashcode --> " + System.identityHashCode(d3));
	}
}

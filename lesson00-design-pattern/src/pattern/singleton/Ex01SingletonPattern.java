package pattern.singleton;

public class Ex01SingletonPattern {

	/*
	 * Singleton: Sử dụng để khởi tạo đối tượng
	 * 
	 * Class
	 * --> new constructor(): tạo ra n đối tượng
	 * --> builder pattern tạo N đối tượng
	 * --> utils không thể tạo đối tượng
	 * --> singleton pattern: tạo 1 đối tượng duy nhất
	 * 
	 * Vd: Date, Calendar
	 */
	
	public static void main(String[] args) {
		KDate d1 = KDate.getInstance();
		d1.setMonth(2);
		System.out.println("d1 value: " + d1);
		System.out.println("d1 hashcode: " + System.identityHashCode(d1));
		
		KDate d2 = KDate.getInstance();
		d2.setYear(4);
		System.out.println("d2 value: " + d2);
		System.out.println("d1 hashcode: " + System.identityHashCode(d2));

	}

}

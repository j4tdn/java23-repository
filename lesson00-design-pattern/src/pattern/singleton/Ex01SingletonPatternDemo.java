package pattern.singleton;

public class Ex01SingletonPatternDemo {
	
	/*
	 Singleton: Sử dụng  để khởi tạo đối tượng
	 
	 Class
	 --> new constructor() tạo N đối tượng
	 --> Builder pattern tạo N đối tượng
	 --> utils ko thể tạo đối tượng
	 --> singleton pattern: tạo 1 đối tượng duy nhất
	 
	 VD: KDate, Calendar.getInstance
	 */
	
	// ItemService, ItemServiceImpl
	// ItemDao, HibernateItemDao
	
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
		
		KDate d3 = KDate.getInstance();
		System.out.println("d3 value --> " + d3);
		System.out.println("d3 hashcode --> " + System.identityHashCode(d3));
		
	}
	
}

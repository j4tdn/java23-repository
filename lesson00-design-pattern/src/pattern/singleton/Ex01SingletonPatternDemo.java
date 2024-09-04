package pattern.singleton;

public class Ex01SingletonPatternDemo {

	/*
	 Singleton: Sử dụng để khởi tạo đối tượng
	 
	 Class:
	 --> new constructor() tạo N đối tượng
	 --> builder pattern tạo N đối tượng (thường là immutable)
	 --> utils không thể tạo đối tượng
	 --> singleton pattern: tạo ra 1 đối tượng duy nhất
	 
	 VD: Date, Calendar
	  
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
		System.out.println("d1 value --> " + d2);
		System.out.println("d1 hashcode --> " + System.identityHashCode(d2));
		
		System.out.println("\n");
		
		KDate d3 = KDate.getInstance();
		System.out.println("d1 value --> " + d3);
		System.out.println("d1 hashcode --> " + System.identityHashCode(d3));
		
	}
	
}

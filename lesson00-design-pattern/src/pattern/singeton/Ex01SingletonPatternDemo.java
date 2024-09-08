package pattern.singeton;

public class Ex01SingletonPatternDemo {

	/*
	 
	 - Singleto: sử dụng để khởi tạo đối tượng
	 
	 - Class: 
	 --> new constructor(); --> tạo n đối tượng bất kỳ
	 --> buider pattern tạo N đối tượng
	 --> utils: không thể tạo đối tượng tượng
	 --> Singleton pattern: tạo 1 đối tượng duy nhất
	 
	 VD: KDate, Calendar.getInstance
	 
	 
	 */
	
	// ItemService, ItemServiceImpl
	// ItemDao, HibernateItemDao
	
	public static void main(String[] args) {
		KDate d1 = KDate.getInstance();
		d1.setMonth(2);
		System.out.println("d1 value --> " + d1);
		System.out.println("d1 hashcode --> " + System.identityHashCode(d1));
		
		System.out.println("");
		
		KDate d2 = KDate.getInstance();
		d2.setYear(4);
		System.out.println("d2 value --> " + d2);
		System.out.println("d2 hashcode --> " + System.identityHashCode(d2));
		
		System.out.println("");
		
		KDate d3 = KDate.getInstance();
		System.out.println("d3 value --> " + d3);
		System.out.println("d3 hashcode --> " + System.identityHashCode(d3));
	}
	
}

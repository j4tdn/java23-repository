package pattern.singleton;

public class Ex01SingletonPatternDemo {

	
	/*
	  Singleton: sử dụng để khởi tạo đối tượng
	  
	  Class
	    --> new Constructor(): tạo N đối tượng
		--> builder pattern: tạo N đối tượng
		--> utils:không thể tạo đối tượng (các hàm static được khởi tạo khi ctrinh vừa bắt đầu)
		--> singleton pattern: tạo 1 đối tượng duy nhất
		
		VD: Calendar.getInstance
	 */
	
	// ItemService, ItemServicImplement
	// ItemDAO, HibernateItemDAO
	public static void main(String[] args) {
		KDate d1 = KDate.getInstance();
		d1.setMonth(2);
		System.out.println("d1.value ->>" + d1);
		System.out.println("d1 hashCode --> " + System.identityHashCode(d1));

		System.out.println("\n");
		KDate d2 =  KDate.getInstance();
		d2.setYear(4);
		System.out.println("d2.value ->>" + d2);
		System.out.println("d2 hashCode --> " + System.identityHashCode(d2));
		
		System.out.println("\n");
		KDate d3 =  KDate.getInstance();
		System.out.println("d3.value ->>" + d3);
		System.out.println("d3 hashCode --> " + System.identityHashCode(d3));
		
	}
}

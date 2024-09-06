package pattern.singleton;

public class Ex01SingletonPatterDemo {
		
	
	/*
	  Singleton : Sử dụng để khởi tạo đối tượng
	  Class --> new constructor() tạo N đối tượng
	 */
	public static void main(String[] args) {
		KDate d1= KDate.getInstance();
		d1.setMonth(2);
		System.out.println("d1 value -->"+d1);
		System.out.println("d1 value -->"+System.identityHashCode(d1));
		
		System.out.println("===========\n");
		
		KDate d2 =  KDate.getInstance();
		d2.setYear(4);
		System.out.println("d2 value -->"+d2);
		System.out.println("d2 value -->"+System.identityHashCode(d2));
		
		System.out.println("===========\n");
		
		KDate d3 =  KDate.getInstance();
		System.out.println("d3 value -->"+d3);
		System.out.println("d3 value -->"+System.identityHashCode(d3));
		
	}
}

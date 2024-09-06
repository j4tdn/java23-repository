package pattern.singleton;

public class Ex01SingletonPatternDemo {

	/*
	 Singleton dùng để khởi tạo đối tượng  
	  
	  
	 */
   public static void main(String[] args) {
	   KDate d1 = KDate.getInstance();
	   d1.setMonth(2);
	   System.out.println("d1 value --> " +d1);
	   System.out.println("hashcode d1 --> " +System.identityHashCode(d1));
	   System.err.println("\n");
	   
	   
	   KDate d2 =  KDate.getInstance();
	   d2.setYear(4);
	   System.out.println("d1 value --> " +d2);
	   System.out.println("hashcode d1 --> " +System.identityHashCode(d2));
	   System.out.println("\n");
	   
	   KDate d3 = KDate.getInstance();
	   System.out.println("d1 value --> " +d3);
	   System.out.println("hashcode d1 --> " +System.identityHashCode(d3));
	   
	   
}
}

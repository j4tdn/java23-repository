package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {
	 
  public static void main(String[] args) {
//	 primitive int double char
	  int a = 5;
	  double b =7;
//	  object type
//	  custom: Item Employee, Store
//	  available Interger Double Character String BigDecimal --> Immutable class
//	   là class ở đó khi tạo ra 1 đối tượng, ô nhớ ở heap bên trong ô 
//	  nhớ đó chưa giá trị của thuộc tính mà không thể cập nhật giá trị thuộc tính trong ô nhớ đó được
	  Item item1 = new Item(1,'A',11);
	  Integer i1 = new Integer(22);
	  Double d1 = new Double(44d);
	  String s1 = new String("hello");
	  System.out.println("i1 -->"+i1);
	  System.out.println("d1 -->"+d1);
	  System.out.println("s1 -->"+s1);
	  
//	  muốn 1 class từ mutable --> immutable 
//	 1 cho các thuộc tính có access modifier: private
//	 2 thêm từ khóa final để không thể cập nhật giá trị ?
	  
	  
	  String x1 = "java";
	  String x2 ="javs";
	  String x3 ="java";
//	  x3 = "spring";
	  System.out.println("x2 "+ System.identityHashCode(x2));
	  System.out.println("x1 "+ System.identityHashCode(x1));
	  System.out.println("x3 "+ System.identityHashCode(x3));
	  //constant pool
}
}

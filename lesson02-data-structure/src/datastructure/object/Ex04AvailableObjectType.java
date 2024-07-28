package datastructure.object;

import bean.Item;

public class Ex04AvailableObjectType {
	
	public static void main(String[] args) {
	
		//primitive:int, double, char ...
		int a = 5;
		double b = 7;
		//object type
		//custom: Item, Employee, Store
		//available:Integer, Double, Character, String, BigDecimal
		
		Item item1 = new Item(1, 'A', 11);
		
		//class Integer có 1 thuộc tính (là số nguyên)
		Integer i1 = new Integer(22);
		
		//class Double có 1 thuộc tính (là số thực)
		Double d1 = new Double(44d);
		
		//class String có 1 thuộc tính (chuỗi)
		String s1 = new String("hello");
		
		// Immutable class:là class ở đso khi tạo ra 1 đối tượng, ô nhớ ở heap bên trong ô nhớ đó chứa giá trị của các thuộc tính
		// mà không thể cập nhập giá trị thuộc tính trong ô nhớ đó được
		
		
		//Item --> Mutable class
		//muốn 1 class từ mutable --> Immutable
		//1 ->cho các thuộc tính cso access modifier:private
		//2 ->thêm từ khóa final để ko thể cập nhật giá trị?
		
		System.out.println("i1 -->" + i1);
		System.out.println("s1 -->" + s1);
		System.out.println("d1 -->" + d1);
	}
}

package datastructure.object;

public class Ex04AvailableObjectType {
	public static void main(String[] args) {
		//primitive char, int, ...
		
		//object type
		//custom: Item, Employee,
		//available: Integer, Float, String, Double, ...
		
		Integer i1 = new Integer(22); //object -> phải có hàm khởi tạo //H1
		String s1 = new String("Hello");
		Double d1 = new Double(44d);
		
		//if available -> có thể gán thẳng giá trị cho đối tượng
		/* Nếu tạo = new -> luôn tạo ra ô nhớ và lưu vào HEAP
		 * Nếu gán -> Xét xem giá trị đó có trong constant pool hay chưa 
		 *  -> Nếu có gán vào ô chứa đó
		 *  -> Nếu không tự tạo và chỉ vào ô nhớ đó
		 *  
		 * String, Integer -> Immutable class: class ở đó chỉ có 1 đối tượng, ô nhớ ở HEAP chứa giá trị không thể thay đổi.
		 * Item -> Mutable class: 
		 * Mutable -> Immutable:
		 * 1. access modifiers: private
		 * 2. thêm từ khoá final: không thể cập nhập giá trị
		 */
		
		
		Integer i2 = new Integer(23); //H2
		Integer i3 = new Integer(22); //H3
		
		Integer x1 = 1; //H4 => nên sử dụng 
		Integer x2 = 2; //H5
		Integer x3 = 1; //H4
		
		System.out.println("i1 -> " + System.identityHashCode(i1));
		System.out.println("i2 -> " + System.identityHashCode(i2));
		System.out.println("i3 -> " + System.identityHashCode(i3));
		
		System.out.println("x1 -> " + System.identityHashCode(x1)); //Trùng vì trỏ vào biến có sẵn 
		System.out.println("x2 -> " + System.identityHashCode(x2));
		System.out.println("x3 -> " + System.identityHashCode(x3)); //Trùng
		
		String s2 = "Hii";

		Double d2 = 42d;
		
		System.out.println(i1);
	}
}

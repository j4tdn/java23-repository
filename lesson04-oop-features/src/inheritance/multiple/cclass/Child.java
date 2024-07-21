package inheritance.multiple.cclass;

public class Child extends Father /*, Mother */ implements Ancestor, GrandFather{

	@Override
	public void drinking() {
		System.out.println("Child drinking");
	}

	@Override
	public void eating() {
		System.out.println("Child eating");
	}
	 
	// Mấu chốt vấn đề: Java ko hỗ trợ đa thừa kế
	// Vì khi 1 class con extends từ 1 class cha 
	// --> Ko bắt buộc phải override hàm từ class cha 
	
	// Ví dụ Father có hàm cooking và Mother có hàm cooking
	// -> Child extends từ cả Father, Mother đồng thời
	// không override 
	// child.cooking() sẽ ko biết thừa kế, gọi từ class cha/mẹ nào
	
	
}

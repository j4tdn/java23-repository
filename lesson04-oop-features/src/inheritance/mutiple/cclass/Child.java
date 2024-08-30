package inheritance.mutiple.cclass;

public class Child extends Father/*, Mother */ implements Ancestor, GrandFather{

	// mấu chốt của vấn đề: Java không hỗ trợ đa thừa kế
	// Vì khi 1 class con extends từ 1 class cha
	// --> không bắt buộc phải override hàm từ class cha
	
	// Ví dụ Father có hàm cooking, Mother cũng có hàm cooking
	// Child extends Father, Mother đồng thời không overriđe
	// child.cooking() sẽ không biết thừa kế, gọi từ class cha/mẹ nào
	
	
	@Override
	public void drinking() {
		System.out.println("Child Drinking");
	}

	@Override
	public void eating() {
		System.out.println("Child eating");
	}
}

package inheritance.multiple.cclass;

public class Child extends Father /*, Mother */ implements Ancestor, GrandFather {

	@Override
	public void eating() {
		System.out.println("Child eating");
		
	}
	
	@Override
	public void drinking() {
		System.out.println("Child drinking");
		
	}
	
	// Mấu chốt của vấn đề: Java ko hỗ trợ đa kế thừua
	// vì khi 1 class con extends từ 1 class cha
	// --> ko bắt buộc phải override hàm từ class cha
	
	// Ví dụ Father có hàm cooking, Mother cũng có hàm cooking
	// Child extends Father, Mother đồng thời ko override
	// child.cooking() sẽ ko biết thừa kế, gọi từ class cha/ mẹ nào
}

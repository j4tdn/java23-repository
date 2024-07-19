package inheritance.multiple.cclass;

public class Child extends Father /*, Mother */ implements Ancestor, GrandFather {


	// Mấu chốt của vấn đề: Java không hỗ trợ đa thừa kế
	// Vì khi 1 class con extends từ 1 class cha
	// --> ko bắt buộc override hàm từ class cha
	
	// Ví dụ Father và Mother đều có hàm cooking
	// Child extends Father, Mother đồng thời ko override
	// child.cooking() sẽ ko biết thừa kế, gọi từ class cha/mẹ nào
	@Override
	public void drinking() {
		System.out.println("Child drinking");
	}

	@Override
	public void eating() {
		System.out.println("Child eating");
	}
	
}

package inheritance.multiple.cclass;

public class Child extends Father/*, Mother */ implements Ancestor, GrandFather {


	// Mấu chố của vấn đề: Java ko hỗ trợ đa thừa kế
	// Vì khi 1 class con extends từ 1 class cha
	// --> không bắt buộc override hàm từ class cha
	
	// Ví dụ Father có hàm cooking , Mother cũng có hàm cooking
	// Child extends Father, Mother đồng thời không override
	// child.cooking() sẽ không biết thừa kế , gọi từ ai
	
	@Override
	public void drinking() {
		System.out.println("Child drinking");
	}

	@Override
	public void eating() {
		System.out.println("Child eating");
	}
}

package polymorphism.object;

public class ZPoTest {
	/*
	 	Đa hình trong đối tượng 
	 		--> một đối tượng lúc có thể hiện này, thể hiện khác
	 		
	 	Bài toán
	 		--> Đối tượng Shape
	 		--> Lúc là shape, circle, square
	 		
	 */
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		System.out.println();
		
		Circle cricle = new Circle();
		cricle.paint();
		cricle.calS();
		
		System.out.println();
		Square square = new Square();
		square.paint();
		square.calS();
		
		System.out.println("\n Đa hình trong đối tượng --'shape' -- \n");
		
		// A a1 = new A();
		// A a2 = new B();// new dc nếu B là con của A
		// A a3 = new C(); // new dc nếu C là con của A
		
		// compile: biên dịch code, là lúc gõ code
		// runtime: thực thi cấp phát vùng nhớ, chạy code
		Shape s1 = new Circle();
		s1.paint();
		s1.calS();
		// s1: lúc compile vẫn là Shape (KDL khai báo cho biến s1)
		// s1: lúc runtime là đối tượng Cricle (giá trị dc gán vào cho biến s1)
		
		Shape s2 = new Square(); // tương tụ s1
		s2.paint();
		s2.calS();
		
		
		// Biến KDL là Shape nó có thể new, nhận giá trị là Shape, Square, Circle là bất kỳ class nào con của Shape
		// Biến Shape có tính chất đa hình trong đối tượng
		
		/* - Có 2 câu hỏi:
		 		1. Biến KDl cha = giá trị KDL con --> pk
		 			Ngc lại thì KDL con = giá trị KDL cha dc ko ?
		 			
		 			--> Ko dc vì , class con ngoài việc kế thừa còn có thể tạo ra các hàm, biến mới
		 				- Nếu Con c1 = new Cha
		 				  Sau đó lấy c1 gọi hàm mới của con thì lúc runtime ko thể tìm thấy trong lớp cha
		 				- Thay vì đợi đến lúc goj ko tìm thấy mới báo lỗi thì --> báo lỗi lúc gán Con=Cha
		 				
		  		2.Vì sao phải dùng đa hình trong đối tượng( vì sao phải lấy Cha = new Con 
		  		mà ko phải Cha = new Cha, Con = new Con) ?
		  		
		  		--> Lúc compile tất cả các biến đều là KDL cha
		  		    Dễ dàng gán giá trị, ép kiểu qua về giữa các biến
		  		--> Lưu trữ tập hợp (mảng) gồm các phần tử là Shape hoặc là con của shape thay vì phải tạo nhiều mảng
		 */
		Shape[] shapes = {s1, s2 ,square};
		
		System.out.println("Shape length --> "+ shapes.length);
		
		
	}
}

package polymorphism.object;

public class ZPoTest {
	/*
		Đa hình trong đối tượng
		--> 1 đối tượng lúc thế này, lúc thế khác
		
		Bài toán
		--> Đối tượng shape
		--> Lúc shape, square, circle.
	*/
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		Circle circle = new Circle();
		circle.calS();
		circle.paint();
		
		Square square = new Square();
		square.calS();
		square.paint();
		
		System.out.println("\nĐa hình trong đối tượng -- 'shape' --");
		
		//A a1 = new A();
		//A a2 = new B(); new được nếu B là con A
		
		//compile: biên dịch, lúc gõ code.
		//runtime: thực thi cấp phát vùng nhớ chạy code.
		
		//s1: lúc complie là shape (KDL khai báo cho biến s1)
		//s1: lúc runtime là đối tượng circle (giá trị được gán vào cho biến s1)
		
		Shape s1 = new Circle();
		s1.calS();
		s1.paint();
		
		Shape s2 = new Square();
		s2.calS();
		s2.paint();
		
		s1 = s2; // -> s1 là square, s2 là square
		/*+ Biến KDL là shape có thể new, nhân giá trị là Shape, square, circle
		là bất kỳ class nào con của shape
		+ Biến shape có tính chất đa hình trong đối tượng.
		+ Có 2 câu hỏi
		1. Biến KDL cha = giá trị KDL con -> OK
		  Ngược lại được không ? 
		  --> Không được
		  --> Vì class con ngoài kế thừa, có thể có những hàm, biến mới
		  --> Compile có thể không lỗi, runtime lỗi !!
		2. Vì sao phải dùng đa hình ? Polymorphism?
		  Vì sao phải là cha new = con mà không phải là cha = new cha, con = new con
		 --> lúc compile tất cả biến đều là KDL cha
		 	--> dễ dàng gán giá trị, ép kiểu qua về giữa các bên
		 --> Lưu trữ tập hợp mảng gồm các phần ử là shape hoặc là con shape
		 	--> thay vì tạo nhiều mảng.
		 */
		
		Shape[] shapes = {s1,s2,circle,square,shape};
		
		Circle c1 =  (Circle) new Shape(); //lỗi runtime 
	}
}

package polymorphism.object;

public class ZPoTest {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.paint();
		shape.calS();
		
		System.out.println();
		
		Circle circle = new Circle();
		circle.paint();
		circle.calS();
		
		System.out.println();
		
		Square square = new Square();
		square.paint();
		square.calS();
		
		System.out.println("\nĐa hình trong đối tượng -- 'shape' -- \n");
		
		// A a1 = new A();
		// A a1 = new B(); new dc neu B la con cua A
		// A a1 = new C(); new dc neu C la con cua A
		
		// compile: biên dịch, lúc gõ code
		// runtime: thực thi cấp phát vùng nhớ, chạy code
		
		// s1: lúc compile nó là Shape(KDL khai báo cho biến s1)
		// s1: lúc runtime là đối tượng Circle(giá trị đc gán vào cho biến s1)
		
		Shape s1 = new Circle();
		s1.paint();
		s1.calS();
		
		// Tượng tự với s2
		Shape s2 = new Square();
		s2.paint();
		s2.calS();
		
		/*
		+ Biến KDL là Shape nó có thể new, nhận giá trị là Shape, Square, Circle
		là bất kỳ class nào con của Shape
		+ Biến shape có tính chất đa hình trong đối tượng
		
		Có 2 câu hỏi
		1. Biến KDL cha = giá trị KDL con --> ok
		   Ngược lại biến KDL con = giá trị KDL cha được không ?
		--> Không được
		--> Vì class con ngoài việc kế thừa còn có thể tạo ra các hàm, biến mới
		--> Nếu Con c1 = new Cha()
		    Sau đó lấy c1 gọi hàm mới của Con, lúc runtime ko thể tìm thấy trong class Cha
		    Thay vì đợi đến khi gọi ko tìm thấy báo lỗi
		    --> Báo lỗi lúc gán Con = Cha
		2. Vì sao phải dùng đa hình trong đối tượng
		   Vì sao phải là Cha new = Con mà không là Cha = new Cha, Con = new Con
		--> lúc compile tất cả các biến đều là KDL cha
		    --> dễ dàng gán giá trị, ép kiểu qua về giữa các biến
		--> lưu trữ tập hợp(mảng) gồm các phần tử là shape hoặc là con của shape
		    --> thay vì phải tạo nhiều mảng
		*/
		
		Shape[] shapes = {s1, s2, circle, square, shape};
		System.out.println("shapes length --> " + shapes.length);
		
		// Circle c1 = (Circle) new Shape(); // lỗi lúc runtime
		// c1.calS();
		// c1.setBackground();
	}
}

package polymorphism.object;

public class ZPoTest {

	/*
	 Đa hình trong đói tượng
	 --> một đối tượng lúc có thể hiện này, lúc có thể hiện khác
	 
	 Bài toán
	 --> Đối tượng shape
	 --> Lúc là shape, circle, square
	 */
	
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
		
		System.out.println("\nĐa hình trong đối tượng -- 'shape' --\n");
		
		// A a1 = new A();
		// A a2 = new B(); new được nếu B là con của A
		// A a3 = new C(); new được nếu C là con của A
		
		// compile: biên dịch, lúc gõ code
		// runtime: thực thi cấp phát vùng nhớ, chạy code
		
		// s1: lúc compile thì nó là Shape(KDL khai báo cho biến s1)
		// s1: lúc runtime thì nó là đối tượng Circle (giá trị được gán vào cho biến s1)
		
		Shape s1 = new Circle();
		s1.paint();
		s1.calS();
		
		System.out.println();
		
		// Tương tự với s2
		Shape s2 = new Square();
		s2.paint();
		s2.calS();
		
		/* 
		 + Biến KDL là Shape thì nó có new, nhận giá trị là Shape, Square, Cirele là bất cứ
		   class nào là con của Shape
		 + Biến shape có tính chất đa hình trong đối tượng
		 
		 Có 2 câu hỏi
		 1. Biến KDL cha = giá trị KDL con --> ok
		 	Ngược lại biến KDL con = giá trị KDL cha được không?
		 --> Không được vì:
		 --> Class con ngoài việc kế thừa còn có thể tạo ra các hàm, biến mới
		 --> Nếu Con c1 = new Cha()
		 	 Sau đó lấy c1 gọi hàm mới của Con, lúc runtime không thể tìm thấy trong class Cha
		 	 Thay vì đợi đến khi gọi, không tìm thấy mới báo lỗi
		 	 --> Báo lỗi lúc gán Con = Cha
		 	
		 2. Vì sao phải dùng đa hình trong đối tượng
		 	Vì sao phải lấy Cha = new Con mà không phải là Cha = new Cha, Con = new Con?
		 --> Lúc compile thì tất cả các biến đề là KDL cha
		 	--> Dễ dàng gán giá trị, ép kiểu qua về giữa các biến
		 --> Lưu trữ tập hợp (mảng) gồm các phần tử là shape hoặc là con của shape
		 	--> thay vì tạo nhiều màng
		*/
		
		System.out.println();
		
		Shape[] shapes = {s1, s2, circle, square, shape};
		System.out.println("shapes length --> " + shapes.length);
		
		System.out.println();
		
		int a = 7;
		long b = Integer.MAX_VALUE + 345678;
		a = (int) b;
		
		System.out.println("a --> " + a);
		
		// Circle c1 =  (Circle) new Shape(); // lỗi lúc runtime
		// c1.calS();
		// c1.setBackground();
		
		// Circle: calS, paint, setBackground
		
	}
	
}

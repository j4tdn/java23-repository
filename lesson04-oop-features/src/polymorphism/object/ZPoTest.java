package polymorphism.object;

public class ZPoTest {
	/*
	 
	 Đa hình trong đối tượng
	 --> một đối tượng lúc có thể hiện này, thể hiện khác
	 
	 Bài toán
	 --> Đối tương
	 */
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calS();
		shape.paint();
		
		System.out.println();
		
		Circle circle = new Circle();
		circle.calS();
		circle.paint();
		
		System.out.println();
		
		Square square = new Square();
		square.paint();
		square.calS();
		
		System.out.println("\n Đa hình trong đối tượng -- 'shape' -- \n");
		// A a1 = new A();
		// A a2 = new B(); new được nếu B là con c
		// A a3 = new C(); new được nếu C là con của A
		
		//compile: biên dịch, lúc gõ code
		//runtime, thực thi cấp phát vùng nhớ, chạy code
		
		// s1 lúc compile là Shape(KDL khai báo cho biến s1)
		// s1 lúc runtime là đối tượng Circle(giá trị được gán vào cho biến s1)
		Shape s1 = new Circle();
		s1.paint();
		s1.calS();
		System.out.println();
		// Tương tự với s2
		Shape s2 = new Square();
		s2.paint();
		s2.calS();
		// Biến có KDL là Shape thì nó có thể new, nhận giá trị là Shape, Square, Circle
		// là bất kỳ class nào con của Shape
		// + Biến shape có tính chất đa hình trong đối tượng
		
		/*
		 Có 2 câu hỏi
		 
		 1. Biến KDL cha = giá trị KDL con --> OK
		 Ngược lại biến KDL con = giá trị KDL cha được ko ?
		 
		 --> Không được
		 -> vì class con ngoài việc kế thừa còn có thể tạo ra các hàm, biến mới
		 Nếu Con c1 = new Cha()
		 Sau đó lấy c1 gọi hàm mới của Con, lúc runtime không thể tìm thấy trong class Cha
		 Thay vì đợi đến khi gọi k tìm thấy -> báo lỗi
		 ---> Báo lỗi lúc gán con = new Cha
		 
		 2. Tại sao phải dùng tính đa hình trong đối tượng
		 	Vì sao phải là Cha new = Con mà không phải là Cha cha = new Cha, Con con = new Con
		 	--> lúc compile tất cả các biến đều là KDL cha
		 	--> Dễ dàng gán các giá trị, ép kiểu qua về giữa các biến
		 -->  lưu trữ tập hợp (mảng) gồm các phần tử là shape hoặc là con của Shape
		 --> Thay vì phải tạo nhiều mảng 
		
		*/
		Shape[] shapes = {s1, s2, circle, square, shape};
		System.out.println("shapes length --> " + shapes.length );
		//Circle c1 = (Circle) new Shape(); // lỗi runtime
		//c1.calS() // lỗi runtime
		//c1.setBackground(); // Shape k có setBackground -> lỗi runtime
		// Circle : calS, paint, setBackground
		// Shape : calS, paint
		
	}
}

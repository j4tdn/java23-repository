package polymorphism.object;

public class ZPoTest {

	/*
	 * 
	 * Đa hình trong đối tượng ---> một đối tượng lúc có thể hiện này,thể hiện khác
	 * 
	 * Bài toán: ---> Đối tượng shape ---> Lúc là shape, circle, square
	 */

	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.calS();
		shape.paint();

		System.out.println("==================================");

		Circle circle = new Circle();
		circle.calS();
		circle.paint();

		System.out.println("==================================");

		Square square = new Square();
		square.calS();
		square.paint();
		
		System.out.println("\n Đa hình trong đối tượng -- 'shape' -- \n");
		
//		 A a = new A();
//       A a2 = new B(); new được nếu B là con của A
//	     A a3 = new C(); new được nếu C là con của A
		
//		compile: biên dịch,lúc gõ code
//		runtime: thực thi cấp phát vùng nhớ,chạy code
		
//		s1: lúc compile nó là Shape(KDL khai báo cho biến s1)
//		s1: lúc runtime nó là đối tượng Circle(giá trị của Circle được gán vào cho biến s1)	
		
		Shape s1 = new Circle();
		s1.calS();
		s1.paint();
		
		System.out.println("==================================");

//		Tương tự với s2
		
		Shape s2 = new Circle();
		s2.calS();
		s2.paint();
		
/*
 +Biến KDL là shape có thể new, nhận giá trị là Shape,Square,Circle là bất kỳ class nào con của Shape
 + Biến Shape có tính chất đa hình trong đối tượng
 
 Có 2 câu hỏi:
 1. Biến KDL cha = new giá trị KDL con ---> ok
 2. Ngược lại nếu: biến KDL con = new giá trị KDL cha thì có được không?
 --> không được 
 --> vì class con ngoài việc kế thừa còn có thể tạo ra các hàm, biến mới
 --> Nếu con c1 = new Cha();
     Sau đó lấy c1 gọi hàm mới của Con, lúc runtime ko thể tìm thấy trong class Cha
     Thay vì đợi đến khi gọi ko tìm thấy báo lỗi 
     --->Báo lỗi lúc gán Con = cha 
     
 2. Vì sao phải dùng đa hình trong đối tượng
    Vì sao phải là Cha new = Con mà không phải là Cha = new Con, Con = new Con?
 --> Vì lúc compile tất cả các biến đều là KDL cha
 --> dễ dàng gán giá trị, ép kiểu qua về giữa các biến 
 --> Lưu trữ tập hợp(mảng) gồm các phần tử là shape hoặc là con của shape
 ---> Thay vì phải tạo nhiều mảng
		 *
		 */
	
		Shape[] shapes = {s1, s2, circle, square, shape};
		System.out.println("shapes length --> " +shapes.length);
		
		Circle c1 = (Circle) new Shape(); // lỗi lúc runtime
		c1.calS();
		c1.paint();
		
//		Circle: calS, paint, setBackground
//		Shape: calS, paintm
	}
}

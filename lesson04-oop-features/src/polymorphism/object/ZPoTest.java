package polymorphism.object;

public class ZPoTest {
	
	/*
	 Đa hình trong đối tượng
	 --> một dối tượng có thể hiện này, thẻ hiện khác
	 
	 Bài toán 
	 ->Đối tượng Shape 
	 ->Lúc là shape, circle,square
	 */
	public static void main(String[] args) {
		Shape shape =new Shape();
		shape.Pain();
		shape.callS();
		
		Circle circle = new Circle();
		circle.Pain();
		circle.callS();
		
		Square square = new Square();
		square.Pain();
		square.callS();
		
		System.out.println("Đa hình trong đối tượng -- 'shape'--\n ");
		
		//compile :biên dịch, lúc gõ code
		//runtime : thực thi cấp phát vùng nhớ, chạy code 
		
		//s1:lúc compile nó là shape (kdl khai báo cho biến s1)
		//s1:lúc runtime là đối tượng Circle(giá trị được gắn cho s1)
		
		Shape s1= new Circle();
		s1.Pain();
		s1.callS();
		
		Shape s2 = new Square();
		s2.Pain();
		s2.callS();
		
		/*
		 +Biến KDl là Shape nó có thể new, nhận giá trị của shape , Square, Circle
		 là bất kỳ class nào con của shape 
		 +Biến shape có tính chất đa hình trong đối tượng
		 
		 Có 2 câu hỏi 
		 1. Biến KDl cha = giá trị KDL con --< ok
		 Ngược lại biến KDl con - giá trị KDL cha được không
		 
		 --> Không được 
		 	->Vì class con ngoài việc kế thừa còn có thể tạo ra các hàm , biến mới
		 	-> Nếu Con c1 = new Cha();
		 	Sau đó lấy c1 gọi hàm mới của con, lúc runtime  không thể tìm thấy trong class cha
		 	-> Báo lỗi lúc gnas Con = Cha
		 
		 2. Vì sao phảo sử dụng đa hình trong đối tượng 
		 	Vì sao phải là cha new = Con mà không phải là cha  = new Cha , Con = new Con
		 	--> lúc compile tất cả các biến dedeuef là kdl cha
		 	--> dễ dàng gán giá trị, ép kiểu dữ liệu cacs biến
		 	-->lưu trữ tập hợp  (mảng ) gồm các phần tử là shape hoặc là con của shape
		 	--> thay vì tạo ra nhiều mảng
		 */
		Shape [] shapes = {s1,s2,circle,square,shape};
		System.out.println("shapes length --->"+shapes.length);
//		Circle c1 = new (Circle) new Shape(); // lỗi lúc runtime
//		c1.callS();
//		c1.setBackground();
	}
}

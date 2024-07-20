package polymorphism.object;

public class ZPoTest {
	public static void main(String[] args) {
		/*
		 * 
		 * Da hinh trong doi tuong
		 * --> mot doi tuong luc thi the hien nay luc thi the hien khac
		 * 
		 * Bai toan
		 * 
		 * --> Doi tuong Shape
		 * --> Luc la shape, circle, square
		 */
		
		Shape shape = new Shape ();
		shape.paint();
		shape.claS();
		
		System.out.println();
		
		Circle circle = new Circle ();
		circle.paint();
		circle.claS();
		System.out.println();
		
		Square square = new Square ();
		square.paint();
		square.claS();
		
		System.out.println("\n Da hinh trong doi tuong -- 'shape' -- \n");
		
		// compile: bien dich, luc go code
		// runtime: thuc thi cap phat vung nho, chay code
		
		
		//s1; luc compile no la Shape(KDL khai bao cho bien s1)
		//s1: luc runtime la doi tuong Circle (gia tri duoc gan vao cho bien s1)
		Shape s1 = new Circle ();
		s1.paint();
		s1.claS();
		
		// Tuong tu s2
		Shape s2 = new Square ();
		s2.paint();
		s2.claS();
		
		// Bien KDL la Shape no co the new, nhan gia tri Shape, Square, Circle
		// la bat ky class nao con cua SHape
		// Bien shape co tinh chat da hinh trong doi tuong
			
		// CO 2 cau hoi
		// 1. Bien KDL cha = gia tri KDL con --> ok
			// Nguo lai bien KDL con = gia tri KDL cha duoc k ?
		// -->  Vi class con ngoai viec ke thua con co the tao ra cac ham, bien moi
		// -> Neu Con c1 = new Cha ()
		//	Sau do lay c1 goi ham moi cua Con, luc runtime k the tim thay trong calss Cha. Thay vi doi den khi goi k tim thay bao loi
		// --> Bao loi luc gan Con = Cha
		// 2. Vi sao phai dung da hinh trong doi tuong
		// VI sao phai la CHa new = COn ma k la Cha = new Cha, Con = new Con
		// --> Luc compile tat ca cac bien deu la KDL cha
		// --> de dang gan gia tri, ep kieu qua ve giua cac bien
		// --> luu tru tap hop(mang) gom cac phan tu la shape hoac la con cua shape
		// --> thay vi tao nhieu mang
		
		Shape [] shapes = {s1, s2, circle, shape, square};
		System.out.println("shape length --> " + shapes.length);
		int a = 7;
		long b = 999;
		a = (int) b;
		
		Circle c1 = (Circle) new Shape(); // Loi luc runtime
		c1.claS();
		c1.setBackground();
	}
	
}

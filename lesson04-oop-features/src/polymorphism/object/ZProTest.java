package polymorphism.object;

public class ZProTest {

	/*
	  Đa hình tỏng đối tượng 
	  --> mội đối tượng lúc có thể hiện này, thể hiện khác
	  
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
		circle.calS();
		circle.paint();
		
		System.out.println();
		
		Square square = new Square();
		square.calS();
		square.paint();
		
		System.out.println("\nĐa hình trong đối tượng -- 'shape' -- \n");

		// A a1 = new A();
		// A a1 = new B();  B là con của A
		// A a1 = new C();  C là con của A
		
		Shape s1 = new Circle();
		s1.calS();
		s1.paint();
	}
}

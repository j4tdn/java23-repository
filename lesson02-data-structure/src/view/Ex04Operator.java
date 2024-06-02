package view;

public class Ex04Operator {
	
	public static void main(String[] args) {
		// Toán tử = --> gán giá trị vế phải cho vế trái
		int a = 4;
		int b = 2;
		int zz = 8;
		
		// Toán tử == --> so sánh VT và VP kết quả trả về KDL boolean(true/false)
		// VT = VP --> thực hiên VP trước, được kết quả gán cho VT
		boolean e1 = (a == b);
		boolean e2 = (a * b == zz);
		boolean e3 = (a != zz);
		
		System.out.println("e1 --> " + e1);
		System.out.println("e2 --> " + e2);
		System.out.println("e3 --> " + e3);
		System.out.println("e4 --> " + !e3); // toán tử phủ định --> phủ định giá trị của boolean
		
		System.out.println("\n ======= Toán tử ++ -- =======\n");
		// Khi đặt toán tử ++ -- ở 
		// - trước (biến|biểu thức) - prefix: +-1 vào biến, biểu thức --> dùng giá trị mới đó đi xử lý tiếp
		// - sau (biến|biểu thức) - suffix: dùng giá trị hiện tại để xử lý sau đó mới +-1
		int m = a++; // m = a; a = a + 1;
		int n = ++b; // b = b + 1; n = b;
		System.out.println("a --> " + a); 
		System.out.println("m --> " + m); 
		System.out.println("n --> " + n);
		
		a = 4;
		b = 2;
		
		System.out.println("\n ======= Toán tử && || & | =======\n");
		
		// && --> trả về TRUE khi cả hai biểu thức đều TRUE
		// BT1=true, tiếp tục BT2 -> BT2=true ==> true
		//								= false ==> false
		// BT1=false, ko thực hiện BT2 ==> false
		
		// || --> trả về TRUE khi tồn tại 1 biểu thức là true
		// BT1=true, ko thực hiện BT2 ==> true
		// BT1=false, tiếp tục BT2 -> BT2=true  ==> true
		//								 =false ==> flase
		
		// & | --> toán tử AND OR BIT
		// 5 & 4 --> đổi 5 -> nhị phân
		// 			 đổi 4 -> nhị phân
		// AND OR kết quả nhị phân đó
		
		// & --> luôn thực thi cả 2 hay nhiều về rồi mới & | để ra kết quả
		// lập trình bậc cao --> CÓ(optional)
		
		// 5 + 5
		
		boolean w1 = (a++ > 4 && ++b > 2); // a = 4, b = 3 false
		boolean w2 = (++a > 5 || b++ > 3); // a = 6, b = 2 true
		
		System.out.println("w1 --> " + w1);
		System.out.println("w2 --> " + w2);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		boolean w3 = (a++ > 4 & ++b > 2); // a = 4, b = 3 false
		boolean w4 = (++a > 5 | b++ > 3); // a = 6, b = 4 true
		
		System.out.println("w3 --> " + w3);
		System.out.println("w4 --> " + w4);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);

		System.out.println("========== Thực hành ==========");
		int x = 5;
		int y = 2;
		int z = 3;
		y += y + x++ + z++ + ++z + ++x - y-- + z;
		System.out.println("x = " + x); // 7
		System.out.println("y = " + y); // 27
		System.out.println("z = " + z); // 5
		
		// Toán tử ba ngôi ?=

	}
	
}

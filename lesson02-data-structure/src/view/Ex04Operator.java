package view;

public class Ex04Operator {
	public static void main(String[] args) {
		
		// Toán tử = --> gán giá trị vế phải cho vế trái
		int a = 4;
		int b = 2;
		int c = 8;
		
		// Toán tử == --> so sánh về trái và vế phải, kết quả trả về KDL boolean (True/False)
		a = b;
		
		// VT = VP --> Thực hiện VP trước, được kết quả gán cho VT
		boolean e1 = (a == b);
		boolean e2 = (a*b == c);
		boolean e3 = (a != c);
		
		System.out.println("e1 --> " + e1); // false
		System.out.println("e2 --> " + e2); // true
		System.out.println("e3 --> " + e3); // true
		System.out.println("e4 --> " + !e3); // toán tử phủ định --> phủ định giá trị boolean
		
		System.out.println("\n======= Toán tử ++ -- ==========\n");
		
		// Khi đặt toán tử ++ hay -- ở
		// trước (biến/ biểu thức) - prefix : +-1 vào cái biến, biểu thức --> dùng giá trị mới đó đi xử lý tiếp
		// sau (biến/ biểu thức) - suffux : dùng giá trị hiện tại đẻ xử lý --> sau đó mới +-1
		
		int m = a++; // m = a; a = a + 1;
		int n = ++b; // b = b + 1; n = b;
		
		System.out.println("m --> " + m);
		System.out.println("n --> " + n);
		
		a = 4;
		b = 2;
		
		System.out.println("\n======= Toán tử && || & | ==========\n");
		
		// && --> trả về TRUE khi cả 2  biểu thức đều TRUE
		// BT1 = TRUE, Tiếp tục so sánh biểu thức 2 -> BT2 = TRUE ==> true
		//														  ==> false
		// BT1 = false, ko thực hiện BT2 ==> false
		
		// || --> trả về True khi tồn tại 1 biểu thức là True
		// BT1 = true, ko thực hiện biểu thức 2 ==> true
		// BT1 = false, tiếp tục BT2 -> BT2 = true ==> true
		//								BT2 = False ==> false
		
		// & | --> toán tử AND OR BIT
		// 5 & 4 --> đổi 5 -> nhị phân
		//		 	 đổi 4 -> nhị phân
		// AND OR kết quả nhị phân đó
		
		// & --> luôn thực thi cả 2, nhiều vế rồi mưới & | để ra kết quả
		// Lập trình bậc cao
		
		boolean w1 = (a++ > 4 & ++b > 2); // f  F(A=5) & T(B = 3) -> F
		boolean w2 = (++a > 5 | b++ > 3); // f  T(A=6) | F(B = 4) -> T
		
		System.out.println("w1 --> " + w1); // 
		System.out.println("w2 --> " + w2); // 
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		System.out.println("=========== Thực hành ===========");
		int x = 5, y =2, z = 3;
		y += y + x++ + z++ + ++z + ++x - y-- + z;
		System.out.println("x --> " + x);
		System.out.println("y --> " + y);
		System.out.println("z --> " + z);
	}
}

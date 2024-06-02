package view;

public class Ex04Operator {
	public static void main(String[] args) {
		// Toán tử = --> gán giá trị vế phải cho vế trái
		int a = 4;
		int b = 2;
		int zz = 8;

		// Toán tử == --> so sánh VT và VP kết quả trả về KDL boolean(true/false)
		// VT = VP --> thực hiện VP trước, được kết quả gán cho VT
		boolean e1 = (a == b);
		boolean e2 = (a * b == zz);
		boolean e3 = (a != zz);

		System.out.println("e1 --> " + e1); // false
		System.out.println("e2 --> " + e2); // true
		System.out.println("e2 --> " + e3); // true

		System.out.println("\n====== Toán tử ++ -- ======");
		// Khi đặt toán tử ++ -- ở
			// Trước biến|biểu thức - prefix : +-1 vào biến, biểu thức --> dùng giá trị mới đó đi xử lý biến
		int n = ++b; // b = b + 1; n =b;
			// Sau biến|biểu thức - suffux : dùng giá trị hiện tại để xử lý --> sau đó mới +-1
		int m = a++; // m = a; a = a + 1;
		
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		System.out.println("m --> " + m);
		System.out.println("n --> " + n);
		
		a = 4;
		b = 2;
		
		System.out.println("\n===== Toán tử && || & | =====");
		// && --> trả về TRUE khi cả 2 biểu thức đều TRUE
		// nếu BT1=true, tiếp tục BT2 -> BT2=true ==> true
		// 								 BT2=false ==> false
		// nếu BT1=false, ko thực hiện BT2 ==> false
		
		// || --> trả về TRUE khi đã tồn tại 1 biểu thức là TRUE
		// BT1=true, ko thực hiện BT2 ==> TRUE
		// BT1=false, tiếp tục BT2 -> BT2=true ==> true
		//							  BT2=false ==> false
		
		// & | --> toán tử AND OR BIT
		// 5 & 4 --> đổi 5 -> nhị phân
		//			 đổi 4 -> nhị phân
		// AND OR kết quả nhị phân đó
		
		// & | --> luôn thực thi cả 2, nhiều vế rồi mới & | để ra kết quả
		// lập trình bậc cao --> CÓ (optional)
		
		boolean w1 = (a++ > 4 && ++b > 2);
		boolean w2 = (++a > 5 || b++ > 3);
		
		System.out.println("w1 --> " + w1);
		System.out.println("w2 --> " + w2);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		System.out.println("============== Thực hành ==============");
		int x = 5, y = 2, z = 3;
		y += y + x++ + z++ + ++z + ++x - y-- + z; //=> y = y + y + x++ + z++ + ++z + ++x - y-- + z
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
}

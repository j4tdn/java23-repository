package view;

public class Ex04Operator {
	public static void main(String[] args) {
		// Toán tử = ---> gán giá trị vế phải cho vế trái
		int a = 4;
		int b = 2;
		int z = 8;
		
		// Toán tử == --> so sánh vế trái và vế phải 
		// VT = VP --> thực hiện VP trước, được kết quả gán cho VT
		boolean e1 = (a==b);
		boolean e2 = (a* b == z);
		boolean e3 = (a != z);
		
		System.out.println("e1 -->" + e1);
		System.out.println("e2 -->" + e2);
		System.out.println("e3 -->" + e3);
		System.out.println("e4 --> " + !e3); // toán tử phủ định --> phủ định giá trị boolean
		
		System.out.println("\n ===== Toán tử ++ ===== \n");
		int m = a++;
		int n = ++b;
		System.out.println(" m --> " + m);
		System.out.println("n --> "+ n);
		
		a = 4;
		b = 2;
		
        // && --> trả về true khi tất cả biểu thức đều true
		//BT1 = true, tiếp tục BT2 -> BT2 = true -> true
										// false ==> false
		// BT1= false, k thực hiện bt 2 ==> false
		
		// || --> trả về true khi tồn tại 1 biểu thức là TRUE
		// BT1 = true, k thực hiện BT2  ==> true
		// BT1 = false , tiếp tục BT2 -> BT2 = true ==> true
										// false ==> false 
		// & | --> toán tử AND OR BITWISE
		// 5& 4 --> đổi 5 --> nhị phân
		//              đổi 4 --> nhị phân
		// AND OR kết quả nhị phân đó 
		
		// & | --> luôn thực thi cả 2, nhiều vế rồi mới & | để ra kết quả
		// lập trình bậc cao --> CÓ (optional)
		System.out.println("\n ==== Toán tử && || & | =====\n");
		boolean w1 = (a++ > 4 && ++b > 2); // false
		boolean w2 = (++a > 5 || b++ > 3 ); // true
		// a = 6
		// b = 2
	
		int x = 4;
		int y = 2;
		boolean  w3 = (x++ > 4 & ++y > 2);
		boolean w4 = (++x > 5 | y++ > 3);
		System.out.println("w3 -->" + w3);
		System.out.println("w4 -->" + w4);
		System.out.println("x = " + x);
		System.out.println("y =" + y);
		
		// Toán tử 3 ngôi ?= 
	} 
	
}

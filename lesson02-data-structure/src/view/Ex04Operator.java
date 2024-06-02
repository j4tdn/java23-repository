package view;

public class Ex04Operator {

	public static void main(String[] args) {
		
		// Toán tử = --> gán giá trị vế phải cho vế trái
		int a = 4;
		int b = 2;
		int z = 8;
		
		// Toán tử == --> so sánh VT và VP --> kết quả trả về KDL Boolean(True/False)
		// VT = VP --> thực hiện VP trước, được kết quả gán cho VT
		boolean e1 = (a == b);       // False
		boolean e2 = (a * b == z);   // True
		boolean e3 = (a != z);
		
		System.out.println("e1 --> " + e1);
		System.out.println("e2 --> " + e2);
		System.out.println("e3 --> " + e3);
		System.out.println("e4 --> " + !e3); // toán tử phủ định --> phủ định giá trị boolean
		
		System.out.println("\n========== Toán tử ++ -- =========\n");
		// Khi đặt toán tử ++ -- ở
		// trước (biến|biểu thức) - prefix : +-1 vào biến, biểu thức
		//									--> dùng giá trị mới đó đi xử lí 
		// sau (biến|biểu thức) - suffix : dùng giá trị hiện tại để xử lí --> sau đó mới +-1 
		int m = a++; //m = a; a = a + 1
		int n = ++b; //b = b + 1; n = b
		System.out.println("a --> " + a);
		System.out.println("m --> " + m);
		System.out.println("n --> " + n);
		
		a = 4;
		b = 2;
		
		System.out.println("\n===== Toán tử && || & | =====\n");
		
		// && --> trả về TRUE khi cả 2 biểu thức TRUE
		// BT1 = True --> tiếp tục BT2 --> BT2 = true ==> TRUE
		//                             --> BT2 = False ==> False
		// BT1 = False, không thực hiện BT2 ==> False
		
		// || --> trả về TRUE khi tồn tại 1 biểu thức là TRUE
		// BT1 = true --> không thực hiện BT2 ==> TRUE
		// BT1 = False --> BT2 = True ==> True
		//             --> BT2 = False ==> False
		
		// & | --> toán tử AND OR BIT
		// 5 & 4 --> Đổi 5 --> nhị phân
		//           đổi 4 --> nhị phân
		// AND OR kết quả nhị phân đó
		
		// & --> luôn thực thi cả 2, nhiều vế rồi mới & | để ra kết quả
		// lập trình bậc cao --> CÓ (Optional)
		
		
		boolean w1 = (a++ > 4 && ++b > 2);
		boolean w2 = (++a > 5 || b++ > 3);
		
		System.out.println("w1 --> " + w1);
		System.out.println("w2 --> " + w2);
		System.out.println("a --> " + a);
		System.out.println("b --> " + b);
		
		System.out.println("============== Thực Hành =============");
		int x = 5;
		int y = 2;
		int zz = 3;
		y += y + x++ + zz++ + ++zz + ++x - y-- + zz;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("zz = " + zz);
	}
	
}

package view;

public class Ex04Operator {
	
	public static void main(String[] args) {
		//Toán tử = -->gán giá trị vế phải cho vế trái
		int a = 4;
		int b = 2;
		int z = 8;
		
//		Toán tử == --> so sánh vế trái và VP kết quả trả về KDL boolean(true/false)
//		VT = VP --> thực hiện VP trước, được kết quả gán cho VT
		boolean e1 = (a == b);
		boolean e2 = (a * b ==z);
		boolean e3 = (a !=z);
		
		System.out.println("e1 -->" +e1);
		System.out.println("e2 -->" +e2);
		System.out.println("e3 -->" +e3);
		
		System.out.println("\n====== Toán Tử ++ -- =====\n");
//	 Khi đặt toán tử ++ --ở
//		+Trước(Biến|biểu thức) - prefix : +-1 vào biến, biểu thức bằng biến +1--> dùng giá trị biểu thức xử lý rồi mới qua biến
//		a++: dùng a giải quyết xong mới +1
//		+Sau(biến|biểu thức) -- suffix : dùng giá trị hiện tại để xử lý là biểu thức +1 -- sau đó mới +-1 biến
//		++a cộng 1 vào a rồi lấy giá trị đó đi giải quyết
		int m = a++; // m = a; a = a + 1;

		int n = ++b; // b = b + 1; n = b;
		System.out.println("a --->" +a);
		System.out.println("m --->" +m);
		System.out.println("b --->" +b);
		System.out.println("n --->" +n);
		
		a++;
	
		b++;
	System.out.println("a1--->" +a);
	System.out.println("b1--->" +b);
	
		}

}



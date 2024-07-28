package view;

public class Ex04Operator {

	public static void main(String[] args) {
		//toán tử = -->gán giá trị vế phải cho vế trái
		int a = 4;
		int b = 2;
		int c = 8;
		
		//toán tử == --> so sánh VT và VP kết quả trả về KDL boolean(true/false)
		// VT = VP --> thực hiện VP trước, được kết quả gán cho VT
		boolean e1 = (a == b);
		boolean e2 = (a * b == c);
		boolean e3 = (a != c);
		
		System.out.println("e1 -->" +e1);
		System.out.println("e2 -->" +e2);
		System.out.println("e3 -->" +e3);
		System.out.println("e4 -->" + !e3);//toán tử phủ định --> phủ định giá trị boolean
		
		System.out.println("\n ======= Toán tử ++ -- ======\n");
		//Khi đặt toán tử ++ -- 
		//ở trước (biến|biểu thức) - prefix : +-1 vào biến, biểu thức --> dùng giá trị mới đó đi xử lí
		//ở sau(biến|biểu thức) - suffux: dùng gía trị hiện tại để xử lý -->sau đó +-1
		int m = a++;
		int n = ++b;
		System.out.println("a -->" +a);
		System.out.println("m -->" +m);
		System.out.println("n -->" +n);
		
		a = 4;
		b = 2;
		// && --> trả về TRUE khi cả 2 biểu thức đều TRUE
		//BT1 = true, tiệp tục BT2 -> BT2=true ==>true
		//									false ==> false
		//BT1=false,ko thực hiện BT2 ==>Fasle
		// || --> trả về true khi tồn tại 1 biểu thức là true
		//BT1=true ko thực hiện BT2 ==>true
		//Bt1=fasle,tiếp tục BT2

		// & | toán tử AND OR BIT
		// 5 & 4 --> đổi 5 ->nhị phân
		//			 đổi 4 ->nhị phân
		//AND OR kết quả nhị phân đó
		
		// & | --> luôn thực thi cả 2, nhiều vế rồi mới & | để ra kết quả
		
		
		System.out.println("\n========= Toán tử && || & | =========\n");
		boolean  w1 = (a++ > 4 && ++b > 2);
		boolean  w2 = (++a > 5 || ++b > 3);
		System.out.println("w1 ->" +w1);
		System.out.println("w2 -->" +w2);
		System.out.println(" a-->" +a);
		System.out.println("b -->" +b);
		
		System.out.println("================ Thực hành =============");
		



		
	}
}

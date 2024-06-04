package view;

public class Ex04Operator {

	public static void main(String[] args) {
		// Toán tử = --> gán giá trị về cho vế trái 

		int a = 4;
		int b = 2;
		int zz = 8;
		// Toán tử == --> so sánh VT vs VP trả về kết quả KDL boolean(True/False)
		// VT = VP -> thực hiện vế phải trước , được kết quả gán cho VT
		boolean isEquals = (a == b);
		boolean e2 = (a*b==zz);
		boolean e3 = (a!= zz);
		
		System.out.println("e1 --> " + isEquals);
		System.out.println("e2 --> " + e2);
		System.out.println("e3 --> " + e3);
		System.out.println("e4  -->" + !e3);
		System.out.println("\n==========Toán tử ++ -- ==========\n");
		
		// Khi đặt toán tử ở 
		// + Trước : +-1 vào biểu thức --> dùng giá trị mới đó đi xử lý tiếp 
		// + Sau : dùng giá trị hiện tại để xử lý --> rồi mới +-1
		int m = a++;
		int n = ++b;
		System.out.println("a --> " + a);
		System.out.println("m --> " + m);
		System.out.println("n --> " + n);
		a = 4;
		b = 2;
		System.out.println("\n==========Toán tử && || & |  ==========\n");
		// && --> trả về TRUE khi cả 2 biểu thức đều TRUE 
		// BT 1 = true , tiếp tục xét BT2 -> BT2= true ==> true
		//                                         false  ==> false
		// 
		boolean w1 = (a++ > 4 && ++b > 2);
		System.out.println("=============Thực Hành ============");
		int x = 5, y = 2, z = 3;
		
		
	}
}

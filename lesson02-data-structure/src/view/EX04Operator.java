package view;

public class EX04Operator {

	public static void main(String[] args) {
		// --> toán tử gán dùng để gán giá trị vế phải cho vế trái
		int a = 4; 
		int b = 2;
		int z = 8;
		// toán tử so sánh vt và vp kết quả trả về kiểu dữ liệu boolean(true , false)
		
		boolean e1 = (a==b);
		boolean e2 = (a * b ==z);
		boolean e3 = (a != z);
		System.out.println("e1 = "+e1);
		System.out.println("e2 = "+e2);
		System.out.println("e3 -->"+e3);
		
		// toán tử phủ định 
		
		System.out.println("\n ======== toán tử ++ -- =========\n ");
		int m = a++;
		int n = ++b;
		System.out.println("a-->"+a);
		System.out.println("m--> "+m);
		System.out.println("n--> "+n);
		
		System.out.println("================thực hành ===========");
		

	}

}

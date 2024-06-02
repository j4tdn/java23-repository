package view;

public class Ex04Operator {
	public static void main(String[] args) {
		//Toán tử = -> gán giá trị vế phải cho vế trái
		int a = 4;
		int b = 2; 
		
		//Toán tử == -> so sánh VT và VP trả về boolean
		
		boolean e1 = ((a / 2) == b);
		boolean e2 = (a == b);
		
		System.out.println(e1);
		System.out.println(e2);
		
		
		//prefix 
		//suffix: dùng giá trị hiện tại để xử lý -> sau đó +1
		int m = a++; //m = a, a = a + 1
		int n = ++b; //b = b + 1,  n = b;
		
		System.out.println(m); //4
		System.out.println(a); //5
		System.out.println(n); //3
		
		//Toán tử && || &;
		a = 4;
		b = 2;
		
		//&& -> trả về true khi cả 2 true
		//BT 1 true -> tiếp tục BT2 
		//BT 1 false -> ko thưc hiện -> false
		
		//|| -> BT 1 true -> ko tiếp tục -> True

		//& | -> and or bit -> luôn thực hiện cả 2 vế rồi mới trả về kết quả
		
		boolean w1 = (a++ > 4 && ++b > 2); 
		boolean w2 = (++a > 5 || b++ > 2); 
		boolean w3 = false && false;
		
		System.out.println(w1);
		System.out.println(w2);
		System.out.println(a);
		System.out.println(b);
		
		int x = 5, y = 2, z = 3;
	}
}

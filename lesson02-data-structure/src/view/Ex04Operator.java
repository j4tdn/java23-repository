package view;

public class Ex04Operator {
	public static void main(String[] args) {
		// toán tử =  -> gán giá trị
		int a=4;
		int b=2;
		int z=8;
		// toán tử ==   -> dùng để so sánh VT vs VP kết quả trả về KDL boolean
		boolean e1 = (a==b);
		boolean e2 = (a*b == z);
		boolean e3 = (a != z);

		System.out.println("e1 -->" +e1);
		System.out.println("e2 -->" +e2);
		System.out.println("e3 -->" +e3);
		System.out.println("e4 -->" +!e3); //toán tử phủ định
		
		System.out.println("------------------ Toán tử  ++ -----------------------");
		int m = a++;  //sufux: dùng giá trị hiện tại để xử lý -> sau đó mới +-1
		int n = ++b;  //prefix: +-1 vào biến  --> dùng giá trị mới đó đi xử lý
		System.out.println("m -->" +m);
		System.out.println("n -->" +n);
		
		System.out.println("------------------ Toán tử  && || & | -----------------------");
		
		//&&  --> trả về true khi cả 2 đều đúng
		//BT1=true, tiếp tục BT2 -> BT2=true ==> true
		//BT!=false, ko thực hiện BT2 ==>false 
		
		// || --> trả về true khi 1 trong hai đúng
		//BT1=true , ko thực hiện BT2 ==> true
		//BT1=false, tiếp tục kt BT2=true ==>true
		//					---	 BT2=false ==>false
		
		// & | --> toán tử AND OR BIT
		// AND OR kết quả nhị phân đó
		
		//& | ---> luôn thực thi cả 2, nhiều vế rồi mới cho kq
		
		boolean w1 = (a++>4 && ++b>2);
		boolean w2 = (++a>5 || b++ >3);
		
		System.out.println("w1 -->" +w1);
		System.out.println("w2 -->" +w2);
		System.out.println("a -->" +a);
		System.out.println("b -->" +b);
		
		System.out.println("=============== Thực hành ==========================");
		int x=5, y=2, t=3;
		y += y + x++ + z++ + ++z + ++x - y-- + z;
		System.out.println("x= " +x);
		System.out.println("y= " +y);
		System.out.println("z= " +t);

		
	}
	
}

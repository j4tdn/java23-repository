package view;

public class Ex04Operator {
	public static void main(String[] args) {
		// toán tử =--> gán giá trị vế phải cho vế tría
		
		int a=4;
		int b=2;
		int zz=8;
		//Toán tử == --> so sánh giá trị vế phải vs vế trái trả về kdl boolean (true//false)
		
		boolean  e1 = (a == b);//f
		boolean e2 =(a*b ==zz);//t
		boolean e3 = (a !=zz);//t
		System.out.println("e1-->"+e1);
		System.out.println("e2 -->"+e2);
		System.out.println("e3 -->"+e3);
		System.out.println("e4-->"+!e3);//toán tử phủ định --> phủ định giá trị boolean 
		
		System.out.println("\n======= toán tử ++ --- ======\n");
		// khi đặt toán tử ++ -- ở
		// trước (biến|biểu thức)-prefix : +-1 vào biến ,biểu thức --> dùng giá trị đó đi xử 
		//sau (biến|biểu thức)-sufix : dùng giá trị hiện tại để xử lí
		int m = a++;// m =a; a=a+1
		int n = ++b;// b = b+1;n=b
		System.out.println("a-->"+a);
		System.out.println("m -- >"+m);
		System.out.println("n--> "+n);
		
		a=4;
		b=2;
		
		System.out.println("\n====== Toán tử && || &| ====\n");
		
		//&& --> trả về true lji cả 2 biểu thức đâuù đều true
		//bt1 = true, tiếp tục bt2 -> bt2 = true ==> true
		//									false ==>true
		//BT1=false, khôn thực hiện BT@==false
		//BT1=true, ko thực hiện BT2 ==>true
		//BT1= false , tiếp  tực bt2 --> bt2 =true ==>true
		//									false ==> false
		
		//&| --> toán tử and or bit
		//5 & 4 --> đổi 5 --> nhị phân
		//			đổi 4 -->nhị phân
		//and or kết quả nhị phân đó
		
		//&| --> luôn thực thi cả 2, nhìu về rồi mới &| để ra kết quả 
		// lập trình bậc cao
		
		boolean  w1 =(a++ >4 && ++b >2);
		boolean  w2 = (++a >5 || b++ >3);
		System.out.println("w1->"+w1);
		System.out.println("w2->"+w2);
		System.out.println("a-> "+a);
		System.out.println("b->"+b);
		
		System.out.println("===============thực hành =========");
		int x=5, y= 2 , z=3;
		y += y  + x++ + z++ + ++z + ++x - y-- +z;
		System.out.println("x = "+x);
		System.out.println("y= "+y);
		System.out.println("z = "+z);
		
		
	}
}

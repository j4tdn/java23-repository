package view;

public class Ex04Operator {

	public static void main(String[] args) {
		
		//Toan tu "=" : --> gan gia tri VP cho VT
		int a = 4;
		int b = 2;
		int zz = 8;
		//Toan tu "==" : --> so sanh VT va VP ket qua tra ve KDL boolean(true/false)
		//VT = VP --> thuc hien VP truoc, duoc ket qua gan cho VT
		boolean e1 = (a == b);
		boolean e2 = (a * b == zz);
		boolean e3 = (a != zz);
		
		System.out.println("e1 --> "+e1); //false
		System.out.println("e2 --> "+e2); //true
		System.out.println("e3 --> "+e3); //true
		System.out.println("e4 --> "+!e3); //toan tu phu dinh --> phu dinh gia tri boolean
		
		System.out.println("\n===== Toan tu ++ -- =====\n");
		//Khi dat toan tu ++ -- o
		//truoc(bien|bieu thuc) - prefix: +-1 vao bien, bieu thuc --> dung gia tri moi do di xu ly
		//sau(bien|bieu thuc) - suffix: dung gia tri hien tai de xu ly --> sau do moi +-1
		int m = a++; //m = a; a = a + 1;
		int n = ++b; //b = b + 1; n = b;
		System.out.println("a --> "+a);
		System.out.println("m --> "+m);
		System.out.println("n --> "+n); 
		
		a = 4;
		b = 2;
		
		System.out.println("\n===== Toan tu && || & | =====\n");
		
		boolean w1 = (a++ > 4 && ++b > 2);
		boolean w2 = (++a > 5 || b++ > 3);
		
		System.out.println("w1 -> "+w1); //false
		System.out.println("w2 -> "+w2); //
		System.out.println("a -> "+a);
		System.out.println("b -> "+b);
		
		System.out.println("============= Thuc hanh =============");
		int x = 5, y = 2, z = 3;
		y += y + x++ + z++ + ++z + ++x - y-- + z;
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		System.out.println("z = " + z);
	}
}

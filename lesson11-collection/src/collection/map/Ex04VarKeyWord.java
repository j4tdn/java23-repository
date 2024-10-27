package collection.map;

import java.util.ArrayList;

public class Ex04VarKeyWord {
	public static void main(String[] args) {
		// A a1 = new B();
		// Biến a1
		// Lúc compile --> KDL A
		// Lúc runtime --> KDL B

		// -> lúc compile và runtime -> a1 dựa vào phần phải
		// var a1 = new B();

		var list2 = new ArrayList<>(); // -> default Obj
		var list3 = new ArrayList<Integer>();

		// var x2 = null; -> null chưa thể xác định KDL

		// -> sử dụng var khi biết rõ KDL (bên phải) lúc compile
	}
}

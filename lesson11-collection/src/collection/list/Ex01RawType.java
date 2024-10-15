package collection.list;

import java.util.ArrayList;
import java.util.List;

public class Ex01RawType {
	public static void main(String[] args) {
		/*
		 * Nếu gọi List -> phải truyền vào KDL, Nếu không -> rawtype (Object)
		 * 
		 * Raw Types -> dễ bị lỗi casting exception
		 */

		@SuppressWarnings("rawtypes")
		List listA = new ArrayList(); // số nguyên
		List listB = new ArrayList(); // chuỗi

		listA.add(1);
		listA.add("2");
		listA.add("ad");
		for (Object a : listA) {
			System.out.println(a);
		}
	}
}

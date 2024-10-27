package view;

import java.util.List;

import bean.Apple;

public class Ex03UsingLocalVariable {
	/*
	 * 1 biến cục bộ có thể sử dụng trong annoymous mà 0 cần truyền tham số qua
	 * constructor
	 * 
	 * -> bắt buộc local phải là final
	 */

	public static void main(String[] args) {
		Runnable runnable = test(15);
		runnable.run();
	}

	private static Runnable test(int time) {
		String rn = "running ...";
		Apple apple = new Apple();
		apple.setId(123);

//		List<Integer> list = List.of(1, 2, 3, 4, 5);
//		Integer max = Integer.MIN_VALUE;
//		
//		list.forEach(number -> {
//			if (max < number) {
//				max = number;
//			}
//		});
		// -> SAI auto final

		return () -> {
			apple.setId(234);
			String student = "adam";
			System.out.println(student + " is " + rn + " in " +  time);
		};
	}
}

package test03;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import bean.Tuple;

public class Ex04PresentAmount {
	
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 15, 17, 21};
		
		// {giá trị, số lần xuất hiện trong mảng}
		// { {3,1}, {15,3}, {21,2}, {0,1}, {17,1} }
		
		// Sử dụng hàm có sẵn của Java
		Arrays.stream(a)
			.boxed().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			.entrySet().stream().filter(e -> e.getValue() == 1)
			.forEach(e -> System.out.println(e.getKey() + ", " + e.getValue()));
		
		System.out.println("\n=================\n");
		
		// Làm thủ công
		// Từ source là mảng số nguyên
		// Trả về 1 "mảng đối tượng" hoặc là mảng 2 chiều
		// Mỗi phần tử là 1 đối tượng có 2 thuộc tính(val, amount)
		
		Tuple[] tuples = counting(a);
		System.out.println("Làm thủ công --> " + Arrays.toString(tuples));
		
		for (Tuple tuple: tuples) {
			if (tuple.getB() == 1) {
				System.out.print(tuple.getA() + "  ");
			}
		}
	}
	
	private static Tuple[] counting(int[] source) {
		// null, null, null, null, null, null, null, null
		Tuple[] target = new Tuple[source.length];
		int count = 0;
		
		// 3, 15, 21, 0, 15, 15, 17, 21
		// {3, 1}, {15, 1}, {21, 1}, {0, 1}
		for (int number: source) {
			// nếu giá trị của number chưa tồn tại trong target
			// --> tạo ra 1 tuple(target, 1), đưa newTuple vào target
			// nếu như giá trị của number đã tồn tại trong target
			// --> get tuple set amount + thêm 1
			Tuple tuple = get(number, target, count);
			if(tuple == null) {
				Tuple newTuple = new Tuple(number, 1);
				target[count++] = newTuple;
			} else {
				tuple.plusB1();
			}
		}
		return Arrays.copyOfRange(target, 0, count);
	}
	
	private static Tuple get(int value, Tuple[] target, int count) {
		for (int i = 0; i < count; i++) {
			Tuple tuple = target[i];
			if (tuple.getA() == value) {
				return tuple;
			}
		}
		return null;
	}
	
	
}
package test03;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.xml.transform.Source;

import bean.Tuple;

public class Ex04PresentAmount {
	public static void main(String[] args) {
		int[] a = {3,15,21,0,15,15,17,21};
		
		// {giá trị, số lần xuất hiện trong mảng}
		// { { 3, 1} , {15, 3},  {21, 2},   {0,1},  {17,1} }
		
		// sử dụng hàm có sẵn của java
		Arrays.stream(a)
			   .boxed()
			   .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
			   .forEach((val, amount) -> System.out.println(val + ",  "  +amount));
	
		// làm thủ công
		// Từ source là mảng số nguyên 
		// Trả về 1 "mảng đối tượng" hoặc mảng 2 chiều
		// Mỗi phần thử là 1 đối tượng có 2 thuộc tính ( val , amount)
		System.out.println("========lam thu cong =======");
		System.out.println(Arrays.toString(counting(a)));
		Tuple[] tuples = counting(a);
		for (Tuple tuple : tuples ) {
			if (tuple.getB() == 1) {
				System.out.println(tuple.getA() + " ");
			}
		}
	}
	private static Tuple[] counting(int[] source) {
		// null, null, null, null, null, null, null, null
		Tuple[] target = new Tuple[source.length];
		int count = 0;
		// 3, 15, 21, 0, 15, 15, 17, 21
		//{ 3, 1} , {15, 3},  {21, 2},   {0,1},  {17,1}
		for (int number : source) {
			// nếu giá trị của number chưa tồn tại trong target
			// tạo ra 1 tuple(target, 1)
			// nếu như giá trị của number đã tồn tại trong target
			// ----> get tuple set amount + thêm 1, đưa newTuple vào target
			Tuple tuple = get(number, target, count);
			if (tuple == null) {
				Tuple newTuple = new Tuple(number, 1);
				target[count++] = newTuple;
			}
			else {
				tuple.setB(tuple.getB()+ 1);
			}
		}
		
		return Arrays.copyOfRange(target, 0, count);
	}
	private static Tuple get(int value, Tuple[] target, int count) { 
		for (int i = 0; i< count; i++) {
			Tuple tuple = target[i];
			if(target[i].getA() == value) {
				return tuple;
			}
		}
		return null;
	}
}

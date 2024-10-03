package view;

public class Ex04OperationsS {

	/*
	 * 
	 * Cho 1 mảng số nguyên gồm n phần tử Viết chương trình
	 * 
	 * 1.Tìm tổng các phần tử trong mảng 2.Tìm tích các phần tử trong mảng 3.Tìm giá
	 * trị lớn nhất của các phần tử trong mảng 4.Tìm giá trị nhỏ nhất của các phần
	 * tử trong mảng
	 * 
	 */
	public static void main(String[] args) {

	}

	private static int sum(int[] elements) {
		int sum = 0;

		for (int element : elements) {
			sum = sum + element;
		}
		return sum;
	}
}
//for (int element : elements) {
//    sum += element;
//    mul *= element;
//
//    if (element > max) {
//        max = element;
//    }
//
//    if (element < min) {
//        min = element;
//    }
//}

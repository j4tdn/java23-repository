package loop;

public class Ex01For {
	public static void main(String[] args) {
		// for/ while/ do while để
		
		// 1. duyệt các phần tử từ a đến b
		// -> in ra danh sách số nguyên từ 1 đến 10
		
		// 2. duyệt các phần tử trong danh sách/ tập hợp
		
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("i ---> " + i);
		}
		System.out.println("\n ======= \n");

		int i = 1;
		for (; i <= 10;) {
			System.out.println("i ---> " + i);
			i++;
		}
	}
}

package loop;

public class Ex01For {

	public static void main(String[] args) {
		// for/while//do-while để:
		
		// 1. duyệt các phần tử từ a đến b
		// -> in ra danh sách các số là bội của 3 tử 1 đến 10
		for (int i = 1; i <= 10; i++) {
			if (i % 3 == 0) {
				System.out.println("i => " + i);
			}
		}
		
	}
	
}

package view;

public class Ex05OperatorTests {

	public static void main(String[] args) {
		// Stack(ngăn xếp): LIFO: Vào trước ra sau, vào sau ra trước --> ++i
		// queue(hàng đợi): FIFO: vào trước ra trước, vào sau ra sau --> i++
		// chuyển đổi từ số thập phân sang nhị phân
		
		int i = 2;
		if (++i > 2 && i++ > 2) {
			i++;
		}
		
		if (i++ > 4 || ++i > 5) {
			System.out.println("i11 -> " + i);
		}
		
		if (i++ < 4 || ++i > 5) {
			System.out.println("i14 -> " + i);
		}
	
		int x = 0;
		int y = 0;
		for (int z = 0; z < 5; z++) {
			if ((++x > 2) && (++y > 2)) {
				x++;
			}
		}
		System.out.println(x + " " + y);
	}
	
}

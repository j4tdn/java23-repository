package view;

public class Ex05OperatorTests {
	public static void main(String[] args) {
		
		// stack(ngăn xếp): LIFO - vào trước ra sau, vào sau ra trước ++i
		// queue(hàng đợi): FIFO - vào trước ra trước, vào sau ra sau i++
		// chuyển đổi 1 số thập phân sang nhị phân
		
		int i = 2;
		if(++i > 2 && i++ > 2) {
			i++;
		}
		if(i++ > 4 || ++i > 5) {
			System.out.println("i11 -> " + i);
		}
		if(i++ < 4 || ++i > 5) {
			System.out.println("i14 -> " + i);
		}
	}
	/*
	 z =0, x =1
	 z =1 , x=2
	 z = 2, x =3 +, y = 1
	 z = 3, x 4, y2
	 z = 4, x5 y3 -> x6
	 */
}
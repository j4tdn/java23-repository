package loop;

public class Ex05OperatorTest {

	public static void main(String[] args) {
	
		// stack(ngăn xếp): LIFO --> vào trước ra sau, vào sau ra trước
		// queue(hàng đợi): FIFO --> vào trước ra trước, vào sau ra sau
		
		int i = 2;
		if (++i > 2 && i++ > 2) {
			i++;
		}
		if (i++ > 4 || ++i > 5) {
			System.out.println("i12 --> " + i);
		}
		if (i++ < 4 || ++i > 5) {
			System.out.println("i15 --> " + i);
		}
	}
}

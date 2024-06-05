package view;

public class Ex05OperatorTest {
	public static void main(String[] args) {
		// stack - ngăn xếp : LIFO vào trc ra sau, ngc lại
		// queue - hàng đợi : FIFO vào trc ra trc, ngc lại
		
		int i=2;
		if(++i > 2 && i++ >2) {
			i++;
		}	
		if(i++ >4 || ++i >5) {
			System.out.println("i1 --> " + i);
		}
		if(i++ <4 || ++i > 5) {
			System.out.println("i2 --> " + i);
		}
	}
}

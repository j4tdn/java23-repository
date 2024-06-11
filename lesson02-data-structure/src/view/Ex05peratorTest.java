package view;

public class Ex05peratorTest {
	
	public static void main(String[] args) {
		int i = 2;
		if(++i > 2 && i++ > 2) {
			i++;
		}
		if(i++ > 4 || ++i > 5) {
			System.out.println("i11 --> " + i);
		}
		if(i++ < 4 || ++i > 5) {
			System.out.println("i14 --> " + i);
		}
	}
}

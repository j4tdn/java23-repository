package view;

public class Ex05OperatorTests {

	public static void main(String[] args) {
		
		//stack(ngan xep): LIFO: vao truoc ra sau, vao sau ra truoc --> ++i 
		//queue(hang doi): FIFO: vao truoc ra truoc, vao sau ra sau --> i++
		
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
	}

}

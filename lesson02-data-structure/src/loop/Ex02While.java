package loop;

public class Ex02While {
	public static void main(String[] args) {
		int i = 1;
		int n = 10;
		//bội 3
		while(i<n) {
			if(i%3==0) {
				System.out.println("i --- " + i);
			}
			i ++;
		}
	}
}

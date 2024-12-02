package ex_150_java;

public class Test {
	public static void main(String[] args) {
		for(int i=0;i <= 10;i++) {
			if(i==4) {
				continue;
			}if(i==8) {
				break;
			}
			System.out.println(i);
		}
		
	}
}

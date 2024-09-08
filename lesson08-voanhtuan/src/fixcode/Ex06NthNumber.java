package fixcode;

public class Ex06NthNumber {

	public static void main(String[] args) {
		// 123456789101112131415
		int findingPos = 100;
		int running = 1;
		StringBuilder sb = new StringBuilder();
		
		while(true) {
			sb = sb.append(running);
			if (sb.length() >= findingPos) {
				break;
			}
			running++;
		}
		System.out.println("sb --> " + sb.charAt(findingPos - 1));
	}
	
}

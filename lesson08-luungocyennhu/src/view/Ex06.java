package view;

public class Ex06 {

	public static void main(String[] args) {
		
		int findingPos = 100;
		int running = 1;
		StringBuilder sb = new StringBuilder();
		
		while(sb.length() < findingPos) {
			sb = sb.append(running++);
		}
		System.out.println("sb --> " + sb.charAt(findingPos - 1));
	}
}

package view;

public class Ex06NthNumber {

	public static void main(String[] args) {
		
		// 1234567891011121314
		int findingPos = 15;
		
		int running = 1;
		StringBuilder sb = new StringBuilder();
		
		while(sb.length() < findingPos) {
			sb = sb.append(running++);
		}
		System.out.println("sb --> " + sb.charAt(findingPos - 1));
	}
	
}

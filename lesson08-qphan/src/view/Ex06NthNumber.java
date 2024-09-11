package view;

public class Ex06NthNumber {
	
	public static void main(String[] args) {
		// 123456789101112131415
		int findingPos = 100;
		int running = 1;
		StringBuilder sb = new StringBuilder();
		
		while(sb.length() < findingPos) {
			sb = sb.append(running++);
		}
		
		System.out.println("sb --> " + sb.charAt(findingPos-1));
		
		/*
		 Lý thuyết
		 
		 Bài tập
		 --> lesson08: 5, 7
		 --> lesson07: 4
		 
		 */
	}
	
}

package view;

public class Ex06 {

	public static void main(String[] args) {
		
		int findingPos =18;
		int running = 1;
		StringBuilder sb = new StringBuilder();
		
		while (true) {
			sb = sb.append(running);
			if(sb.length()>= findingPos) {
				break;
			}
			running++;
		}
		System.out.println("sb --> "+ sb.charAt(findingPos-1));
	}
}

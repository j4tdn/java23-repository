package view;

public class Ex06FindPositionInNumberSequence {

	public static void main(String[] args) {
		
		int running = 1;
		int findingPos = 18;
		StringBuilder sb = new StringBuilder();
		while(true) {
			sb.append(running);
			if(sb.length() > findingPos)
				break;
		}
		System.out.println("sb --> " + sb.charAt(findingPos + 1));
	}
}

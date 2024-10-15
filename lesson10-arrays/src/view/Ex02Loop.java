package view;

public class Ex02Loop {
	
	public static void main(String[] args) {
		String[] elements = {"a", "b", "c", "d", "e"};
		
		// for-index
		for(int i = 0; i < elements.length; i++) {
			System.out.println(i + " --> " + elements[i]);
		}
		
		System.out.println("\n");
		
		for (String element: elements) {
			System.out.println("each --> " + element);
		}
	}
	
}
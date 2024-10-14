package view;

public class Ex02Loop {

	public static void main(String[] args) {
		// for-index
		//for - each
		String []elements = {"a", "b", "c", "d", "e"};
		for(int i = 0; i < elements.length; i++) {
			System.out.println(i + " --> " + elements[i]);
		}
		System.out.println("\n");
		for(String element: elements) {
			System.out.println("each --> " + element);
		}
	}

}

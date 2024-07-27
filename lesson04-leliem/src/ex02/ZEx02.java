package ex02;

public class ZEx02 {

	public static void main(String[] args) {
		 int[] numbers = {12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18};

	        NumberClassifier classifier = new NumberClassifier(numbers);
	        NumberReorder reorder = new NumberReorder(classifier);

	        reorder.printResult();
	}
}

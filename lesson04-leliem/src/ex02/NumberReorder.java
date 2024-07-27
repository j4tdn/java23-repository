package ex02;

public class NumberReorder {

	 private NumberClassifier classifier;

	    public NumberReorder(NumberClassifier classifier) {
	        this.classifier = classifier;
	    }

	    public void printResult() {
	        printArray(classifier.getDivisibleBy7());
	        printArray(classifier.getDivisibleBy35());
	        printArray(classifier.getOthers());
	        printArray(classifier.getDivisibleBy5());
	    }

	    private void printArray(int[] array) {
	        for (int number : array) {
	            System.out.print(number + " ");
	        }
	    }
}

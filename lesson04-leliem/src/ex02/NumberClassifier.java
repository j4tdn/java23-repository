package ex02;

public class NumberClassifier {
    private int[] numbers;
    private int[] divisibleBy7;
    private int[] divisibleBy5;
    private int[] divisibleBy35;
    private int[] others;

    public NumberClassifier(int[] numbers) {
        this.numbers = numbers;
        classifyNumbers();
    }

    private void classifyNumbers() {
        int countDivBy7 = 0, countDivBy5 = 0, countDivBy35 = 0, countOthers = 0;
        
        for (int number : numbers) {
            if (number % 35 == 0) {
                countDivBy35++;
            } else if (number % 7 == 0) {
                countDivBy7++;
            } else if (number % 5 == 0) {
                countDivBy5++;
            } else {
                countOthers++;
            }
        }

        divisibleBy7 = new int[countDivBy7];
        divisibleBy5 = new int[countDivBy5];
        divisibleBy35 = new int[countDivBy35];
        others = new int[countOthers];
        
        int indexDivBy7 = 0, indexDivBy5 = 0, indexDivBy35 = 0, indexOthers = 0;
        
        for (int number : numbers) {
            if (number % 35 == 0) {
                divisibleBy35[indexDivBy35++] = number;
            } else if (number % 7 == 0) {
                divisibleBy7[indexDivBy7++] = number;
            } else if (number % 5 == 0) {
                divisibleBy5[indexDivBy5++] = number;
            } else {
                others[indexOthers++] = number;
            }
        }
    }

	public int[] getDivisibleBy7() {
		return divisibleBy7;
	}

	public int[] getDivisibleBy5() {
		return divisibleBy5;
	}

	public int[] getDivisibleBy35() {
		return divisibleBy35;
	}

	public int[] getOthers() {
		return others;
	}
}
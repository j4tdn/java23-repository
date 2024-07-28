package view;

public class Ex02SpecialNumberChecker {

	public static void main(String[] args) {
		int number = 10;
		
		if (isSpecialNumber(number)) {
            System.out.println(number + " là số đặc biệt");
        } else {
            System.out.println(number + " không phải là số đặc biệt");
        }
	}
	
	public static boolean isSpecialNumber(int s) {
        if (s <= 0) {
            return false;
        }

        int discriminant = 1 + 8 * s; // discriminant = 1 + 4 * 2 * s
        int sqrtDiscriminant = (int) Math.sqrt(discriminant);

        if (sqrtDiscriminant * sqrtDiscriminant != discriminant) {
            return false;
        }

        int n = (-1 + sqrtDiscriminant) / 2;

        return n > 0;
    }
	
}

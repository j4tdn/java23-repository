package Tasks;

import java.util.Scanner;

public class Ex05SymmetryNumber {

	public static void main(String[] args) {

		System.out.println("Input positive Interger N:");
		Scanner sc = new Scanner(System.in);
		int Numbers = sc.nextInt();
		if(Numbers < 10) {
			System.out.println("Please input again positive interger N: ");
	Numbers = sc.nextInt();
		}
		int x;
		int newNumbers = 0;
		for (int i = Numbers; i != 0; i = i / 10) {
			x = i % 10;
			newNumbers = newNumbers * 10 + x;
			if(newNumbers == Numbers) {
				System.out.println(+Numbers+" is symmetry number ");
		}
//			System.out.println("Số vừa nhập là số đối xứng: "+Numbers);
		}
	}
}
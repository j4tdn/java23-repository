package view;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex05HappyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập một số nguyên: ");
		int ip = sc.nextInt();

		if (isHappyNumber(ip)) {
			System.out.println(ip + " là số hạnh phúc");
		} else {
			System.out.println(ip + " không phải là số hạnh phúc");
		}

	}

	public static boolean isHappyNumber(int number) {
		int sum = 0;
		int current = number;
		Set<Integer> visited = new HashSet<>();

		while (sum != 1 && !visited.contains(current)) {
			visited.add(current);
			sum = 0;
			while (current > 0) {
				int digit = current % 10;
				sum += digit * digit;
				current /= 10;
			}
			current = sum;
		}

		return sum == 1;
	}

}

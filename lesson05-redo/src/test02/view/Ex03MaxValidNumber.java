package test02.view;

import java.util.Arrays;

public class Ex03MaxValidNumber {

	
	public static void main(String[] args) {
		String s = "12abu02muzk586cyx235";
		// B1 : tìm danh sách các số hợp lệ
		System.out.println("Valid number : " + Arrays.toString(getValidNumber(s)));
		
		// [:,] : Tổ hợp các trường hợp với các ký tự bên trong [] --> : , :, ,:
		// {1,}: Số lượng ký tự lớn hơn hoặc bằng 1
		
		String[] values = ("abc::,jâj1:::,::hchc,::udhdhfj".split("[:,]{1,}"));
		System.out.println("test ---> "+ Arrays.toString(values));
		
		String [] validNumbers = "12abu02muzk586cyx".split("[a-zA-Z]{1,}");
		System.out.println("valid numbers --> " + Arrays.toString(validNumbers));
		System.out.println("valid numbers advance --> " + Arrays.toString(getValidNumbersAdv(s)));
		System.out.println("Max number in stream: " + max(getValidNumbersAdv(s)));
		// B2 : tìm số lớn nhất
	}
	// 12abu02muzk586cyx
	// aa12caoakq2563hcduhc2 

	private static int max(int[] numbers) {
		int max = Integer.MIN_VALUE;
		for (int number: numbers) {
			if (max < number) {
				max = number;
			}
		}
		return max;
	}
	
	private static int[] getValidNumbersAdv(String s) {
		String[] tokens = s.split("[a-zA-Z]{1,}");
		
		int[]numbers = new int [tokens.length];
		int count = 0;
		for ( int i = 0; i< tokens.length; i++) {
			if (tokens[i].length() != 0) {
				numbers[count++] = Integer.parseInt(tokens[i]);
			}
		}
		return Arrays.copyOfRange(numbers, 0,count );
		
	}
	
	private static int[] getValidNumber(String s) {
		int [] validNumbers = new int[s.length()];
		int count  = 0;
		int start = -1; // vi tri dnah dau khi ma xuat hien ky tu so
						// neu -1 chua duoc danh dau phat hien so
						//  !-1 --> da danh dau cho lan tiep theo
		for (int i = 0; i < s.length(); i++) {

			char letter = s.charAt(i);
			System.out.println("i => " + letter);
			if (Character.isDigit(letter)) {
				System.out.println("is digit");
				if (start == -1) {
					start = i;
					System.out.println("start -> " + i);
				} 
				if (i == s.length() -1 ) {
					String digits = s.substring(start); // [start, length)
					validNumbers[count++] = Integer.parseInt(digits);
				}	
			}	
			else {
				if (start != -1) {
					String digits = s.substring(start, i);
					System.out.println("digits --> " + digits);
					System.out.println("valid number :" + validNumbers[count]);
					validNumbers[count++] = Integer.parseInt(digits);
					System.out.println("parsed number --> " + Integer.parseInt(digits));
					start = -1;
				}
			}
		}
		return Arrays.copyOfRange(validNumbers, 0, count);
	}
}

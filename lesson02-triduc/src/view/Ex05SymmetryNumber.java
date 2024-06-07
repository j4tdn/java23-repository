package view;

import java.util.Scanner;

public class Ex05SymmetryNumber {
//	Bài 5: Viết chương trình kiểm tra N có phải là số đối xứng hay không
//	Biết rằng N được nhập từ bàn phím là một số nguyên dương có tối thiểu 2 chữ số
//	VD: Nhập N = abc → báo lỗi, yêu cầu nhập lại
//	= a123 → báo lỗi, yêu cầu nhập lại
//	= 1 → báo lỗi, yêu cầu nhập lại
//	= 256 → false
//	= 12521 → true
//	= 2662 → true
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("Nhập vào số n: ");
			String n = sc.nextLine();
			if(isNumber(n)) { 
				if(Integer.parseInt(n)>=10){
					if(isSymmetryNumber(Integer.parseInt(n))) {
						System.out.println(n + " là số đối xứng");
						break;
					}
					else
					{
						System.out.println(n + " không phải số đối xứng");
						break;
					}
				}
			}
			System.out.println("Nhập sai!, nhập lại: ");
		}while(true);

	}
	
	private static boolean isSymmetryNumber(int n) {
		String first = "";
		String end = "";
		String full = String.valueOf(n);
		//số chẵn: a b b a -> 0 -> 4/2 = 2 -> a b -> gộp đc 0 cần dấu = 
		//vòng 2: a b b a -> length() 4 - 1 = 3 -> length/2 = 2 -> phải có dấu =
	 	//vd số lẻ: a b c b a -> 0 -> (5/2) = 2 -> a b -> gộp đc 0 cần dấu =
		//vòng 2: 4 -> (5/2) = 2 -> a b -> không có dấu = 
		//muốn gộp vòng 2: -> số chẵn: vòng 2 -> length -> (length + 1) / 2 vẫn = length() vẫn có =
		//số lẻ: vòng 2: length -> (length + 1) / 2 -> 4 -> 3 và có dấu =
		for(int i = 0; i < full.length()/2;i++) {
			first += full.charAt(i);
		}
		for(int i = full.length()-1; i >= (full.length()+1)/2;i--) {
			end += full.charAt(i);
		}
//		System.out.println(first + " " + end);
		
		if(first.equals(end)) {
			return true;
		}
		
		return false;
	}
	
	private static boolean isNumber(String n) {
		try {
			int i = Integer.parseInt(n);
			return true;
		}catch(NumberFormatException e){
			return false;
		}
	}
}	

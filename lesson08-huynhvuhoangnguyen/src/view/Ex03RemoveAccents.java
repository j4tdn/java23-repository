package view;

import java.util.Scanner;

public class Ex03RemoveAccents {

	public static void main(String[] args) {
		
		Scanner ip = new Scanner(System.in);
		System.out.println("Nhập chuỗi tiếng Việt có dấu: ");
		String input = ip.nextLine();
		
		String output = removeAccents(input);
		System.out.println("Chuỗi không dấu: ");
        System.out.println(output);
        
        ip.close();
		
	}
	public static String removeAccents(String input) {
		String vChar = "áàảãạăắằẳẵặâấầẩẫậéèẻẽẹêếềểễệíìỉĩịóòỏõọôốồổỗộơớờởỡợúùủũụưứừửữựýỳỷỹỵđ"
                + "ÁÀẢÃẠĂẮẰẲẴẶÂẤẦẨẪẬÉÈẺẼẸÊẾỀỂỄỆÍÌỈĨỊÓÒỎÕỌÔỐỒỔỖỘƠỚỜỞỠỢÚÙỦŨỤƯỨỪỬỮỰÝỲỶỸỴĐ";
		String normalChar = "aaaaaaaaaaaaaaaaaeeeeeeeeeeeiiiiiooooooooooooooooouuuuuuuuuuuyyyyyd"
                + "AAAAAAAAAAAAAAAAAEEEEEEEEEEEIIIIIOOOOOOOOOOOOOOOOOUUUUUUUUUUYYYYYD";
		
		StringBuilder output = new StringBuilder(input.length());
		
		for(int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			int index = vChar.indexOf(c);
			
			if(index >= 0) {
				output.append(normalChar.charAt(index));
			} else {
				output.append(c);
			}
		}
		return output.toString();
	}
	
	
}
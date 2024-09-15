package test01;

public class Ex03 {

	public static void main(String[] args) {
		
		String text = "Welcome   toJAVA10  class";
		System.out.println("Chuỗi ban đầu:\n" + text);
		
		System.out.println("Chuỗi sau khi bỏ khoảng trắng và đảo ngược:\n" + removeSpacesAndReverseText(text));
		
	}
	
	private static String removeSpacesAndReverseText(String text) {
		String removeSpaces =  text.replaceAll("\\s+", " ");
		return new StringBuilder(removeSpaces).reverse().toString();
	}
}

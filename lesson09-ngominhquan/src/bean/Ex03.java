package bean;

public class Ex03 {

	public static void main(String[] args) {
		
		String input = "Welcome    to JAVA10    class";
		String result = revert(input);
        System.out.println("Kết quả: " + result);
	}
	
	public static String revert(String s) {
		String trimmed = s.trim().replaceAll("\\s+", " ");
        String[] words = trimmed.split(" ");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(new StringBuilder(word).reverse().toString()).append(" ");
        }
        return result.toString().trim();
	}
}
	




 

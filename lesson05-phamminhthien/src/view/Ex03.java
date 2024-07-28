package view;

public class Ex03 {
	
	
	public static void main(String[] args) {
		
	}
	
	private static int getMaxValidNumber(String s) {
		int result =0;
		int sht = 0;
		for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c >= '0' && c <= '9') {
				sht = sht * 10 + (c - '0');
			}
			else {
				
			}
		}
		
		return result;
	}
		
	
}

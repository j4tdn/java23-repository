package string.mutable;

public class Ex01StringMutable {

	
	public static void main(String[] args) {
		//Concatenate -->String Immutable
		String[] sequences = {"a","b","c","d","e"};
		
		String s1= "";
		for(String sequence :sequences) {
			s1= s1+sequences +"";
			System.out.println("s1 code -->"+System.identityHashCode(s1));
		}
		System.out.println("s1 -->"+s1);
		
		System.out.println("\n");
		
		
		StringBuilder s2= new StringBuilder();
		for(String sequence :sequences) {
			s2= s2.append(sequence).append("");
			System.out.println("2 code -->"+System.identityHashCode(2));
		}
		System.out.println("s2 -->"+s2);
	}
}

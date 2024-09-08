package string.mutable;

public class Ex01StringMutable {

	public static void main(String[] args) {
		String [] sequences = {"a","b","c","d","e"};
		// Concatenate --> String Immutable
		String s1 ="";
		for(String sequence:sequences ) {
			s1 += sequence + " ";
			System.out.println("s1 code --> " + System.identityHashCode(s1));
		}
		System.out.println("s1 --> " + s1  );
		System.out.println("\n");
		// Concatenate --> String Mutable(StringBuilder, StringBuffer)
		StringBuilder s2  = new StringBuilder();
		for(String sequence:sequences ) {
			s2  = s2.append(sequence).append(" ");
			System.out.println("s2 code --> " + System.identityHashCode(s2));
		}
		System.out.println("s2 --> " + s2  );
		
	}

}

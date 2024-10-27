package generic.classinterface;

public class Ex01GenericClassInterfaceDemo {

	public static void main(String[] args) {
		
		IList<String> seqs = new CustomList<>();
		seqs.add("A12");
		seqs.add("Z75");
		seqs.add("D28");
		
		seqs.add("A13");
		seqs.add("Z76");
		seqs.add("D29");
		
		seqs.add("A14");
		seqs.add("Z71");
		
		System.out.println("Size --> "+ seqs.size());
		System.out.println("Capacity --> " +seqs.capacity());
		
		System.out.println("\n==================\n");
		for(int i = 0; i < seqs.size();i++) {
			System.out.println(seqs.get(i) + " ");
		}
		
	}
	
}

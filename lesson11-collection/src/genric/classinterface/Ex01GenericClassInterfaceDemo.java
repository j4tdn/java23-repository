package genric.classinterface;

public class Ex01GenericClassInterfaceDemo {
	public static void main(String[] args) {
		IList<String> seqs = new CustomList<>();

		seqs.add("A12");
		seqs.add("Z77");
		seqs.add("D28");

		seqs.add("A12");
		seqs.add("Z77");
		seqs.add("D28");

		seqs.add("A12");
		seqs.add("Z77");
		seqs.add("D28");

		seqs.add("T23");

		seqs.add("V56");

		System.out.println("size --> " + seqs.size());
		System.out.println("capacity --> " + seqs.capacity());

		for (int i = 0; i < seqs.size(); i++) {
			System.out.print(seqs.get(i) + " ");
		}

	}

}
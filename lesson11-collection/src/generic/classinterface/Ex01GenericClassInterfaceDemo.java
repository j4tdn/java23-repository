package generic.classinterface;

public class Ex01GenericClassInterfaceDemo {
	public static void main(String[] args) {
		IList<String> seq = new CustomList<String>();
		seq.add("A12");
		seq.add("Z13");
		seq.add("D27");

		seq.add("A12");
		seq.add("Z13");
		seq.add("D27");
		seq.add("A12");
		seq.add("Z13");
		seq.add("D27");

		seq.add("A12");
		seq.add("Z13");

		System.out.println("size --> " + seq.size());
		System.out.println("capa --> " + seq.capacity());

		// 0 thể dùng foreach vì IList là obj tự custom

		for (int i = 0; i < seq.size(); i++) {
			System.out.print(seq.get(i) + " ");
		}
	}
}

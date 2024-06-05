package view;

public class Ex02Boxing {
	public static void main(String[] args) {
        /*
         * Boxing UnBoxing auto-boxing auto unboxing
         * chỉ áp dụng cho các KDL đối tượng có sẵn của java: Integer Double Float Long Character
         */
//		
		int p1 = 5;
		Integer o1 = 7;
        Integer o2 = null;		
		p1 = o1 ;
		o1 = p1 ;
//		p1 = o2;
		o2 = p1;
		System.out.println("p1--> "+ p1);
		System.out.println("o1--> "+ o1);
		System.out.println("o2--> "+ o2);
	}
}

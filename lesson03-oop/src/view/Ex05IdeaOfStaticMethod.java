package view;

public class Ex05IdeaOfStaticMethod {
      
	private String sequence;
	public  Ex05IdeaOfStaticMethod(String sequence) {
		this.sequence = sequence;
	}
	
	public static void main(String[] args) {
//	viết chương trình tìm tổng 2 số a và b
//		Ex05IdeaOfStaticMethod o1 = new Ex05IdeaOfStaticMethod();
//		System.out.println("o1 sum ==> " +o1.sum(5, 7));
//		
//		Ex05IdeaOfStaticMethod o2 = new Ex05IdeaOfStaticMethod();
//		System.out.println("o1 sum ==> " +o2.sum(5, 8));
//		
		System.out.println("o sum ==> "+Ex05IdeaOfStaticMethod.sum(5, 7));
		Ex05IdeaOfStaticMethod o1 = new Ex05IdeaOfStaticMethod("asd2dsd");
		System.out.println("o1 is Number ==> " +o1.isNumber());
		Ex05IdeaOfStaticMethod o2 = new Ex05IdeaOfStaticMethod("123876");
		System.out.println("o2 is Number ==> " +o2.isNumber());
		

	}
	
	private static int sum(int a , int b) {
		return a + b;
	}
     
	private  boolean isNumber() {
		for(int i =0;i < sequence.length();i++) {
			char letter = sequence.charAt(i);
			if(letter <= '0' || letter >= '9') {
				return false;
			}
		}
	return true;	
	}
             private static void printfHello() {
            	 System.out.println("Today ---> 16.06.2024 ");
             }
}

package view;

public class Ex02Boxing {

	public static void main(String[] args) {
		
		//Boxing, Unboxing, Auto-boxing, Auto-Unboxing
		//Chi ap dung cho cac KDL doi tuong co san cua JAVA
		
		int p1 = 5;
		Integer o1 = 7;
		Integer o2 = null;
		Integer o3 = null;
		
		//Tu version cua JDK 1.5 --> Ho tro auto-boxing, un-boxing
		//boxing: bien KDL nguyen thuy chuyen thanh bien KDL doi tuong
		//unboxing: bien KDL doi tuong chuyen thanh KDL nguyen thuy
		p1 = o1;
		o1 = p1;
	}
}

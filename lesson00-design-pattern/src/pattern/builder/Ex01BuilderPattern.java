package pattern.builder;

public class Ex01BuilderPattern {
	/*
	 * 
	 * Design Pattern:
	 * la tap cac mau thiet ke giup minh giai quyet cac bai toan cu the voi giai phap phu hop
	 * 
	 * Builder Pattern: la pattern giup minh tao ra cac doi tuong phuc tap voi nhieu thuoc tinh Nhieu(> 4 thuoc tinh)
	 * 
	 * Vi du 1 : LocalDateTime
	 * 
	 * 
	 */
	public static void main(String[] args) {
		User u1 = new User(1, "A1", 28); // no builder
		
		System.out.println("builder no -- > " + u1);
		System.out.println("builder no -");
	}
}

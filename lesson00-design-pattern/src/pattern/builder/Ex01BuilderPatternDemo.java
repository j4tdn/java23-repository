package pattern.builder;

public class Ex01BuilderPatternDemo {

	/*
	Design Pattern: la tap cac mau thiet ke giup minh giai quyet cac bai toan cu the
	voi giai phap phu hop
	
	Builder Pattern
	la pattern giup minh tao ra cac doi tuong phuc tap voi nhieu thuoc tinh (> 4 thuoc tinh )
	
	VD1: LocalDateTime: day, month, year
	 */
	public static void main(String[] args) {
		User u1 = new User(1, "A1", 28);
		System.out.println("builder no --> " + u1);
	}
}

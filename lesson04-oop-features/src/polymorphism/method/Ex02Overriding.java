package polymorphism.method;

public class Ex02Overriding {
	public static void main(String[] args) {
		Ex02Overriding o1 = new Ex02Overriding();
		System.out.println("o1 --> " + o1);
		
		// Chua Override --> polymorphism.method.Ex02Overriding@515f550a
		// override
	}
	
	@Override
	public String toString() {
		return "Ex02 own toString ...";
	}
}

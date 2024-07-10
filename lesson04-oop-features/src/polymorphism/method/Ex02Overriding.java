package polymorphism.method;

public class Ex02Overriding {
	
	public static void main(String[] args) {
		Ex02Overriding o1  = new Ex02Overriding();
		System.out.println("01 --> " + o1);
		// chưa override --> polymorphism.method.Ex02Overriding@1234123
		// override
	}
	@Override
	public String toString() {
		return "Ex02 own toString...";
	}
}

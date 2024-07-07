package polymorphism.method;

public class Ex02Overriding {

	public static void main(String[] args) {
		Ex02Overriding o1 = new Ex02Overriding();
		System.out.println("o1 --> " + o1);
		
		// chưa override --> polymorphism.method.Ex02Overriding@2c7b84de
	}

	@Override
	public String toString() {
		return "Ex02 own toString ...";
	}
	
	
	
}

package polymorphism.method;

public class Ex02Overriding {
	
	public static void main(String[] args) {
		Ex02Overriding o1 = new Ex02Overriding();
		System.out.println("o1 --> "+o1);
		
		//Chưa override -->  polymorphism.method.Ex02Overriding@1eb44e46
		//Sau khi Override --> Ex02 own ToString.. 
		
	}
	@Override
	public String toString() {
		return "Ex02 own ToString.. ";
	}
}

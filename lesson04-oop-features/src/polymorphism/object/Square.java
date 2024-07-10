package polymorphism.object;

public class Square extends Shape {
	@Override
	void calS() {
		System.out.println("Square#cal ...");
	}
	@Override
	void paint() {
		System.out.println("Square#calS ...");
	}
}

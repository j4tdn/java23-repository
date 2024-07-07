package polymorphism.object;

public class Square extends Shape {
	@Override
	void callS() {
		System.out.println("Square#calS ...");
	}

	@Override
	void paint() {
		System.out.println("Square#paint ...");
	}
}

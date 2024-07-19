package polymorphism.object;

public class Circle extends Shape{

	@Override
	void calS() {
		System.out.println("Cricle#CalS .. ");
	}

	@Override
	void paint() {
		System.out.println("Cricle#paint ..");
	}

	void setBackground() {
		System.out.println("Crilce#setBackground ...");
	}
}

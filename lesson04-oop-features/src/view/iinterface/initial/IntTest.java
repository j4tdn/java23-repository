package view.iinterface.initial;

@FunctionalInterface
public interface IntTest {
	boolean test(int number);
	default int doublevalue(int number) {
		System.out.println("IntTest#doubleValue");
		return number * number;
	}
}

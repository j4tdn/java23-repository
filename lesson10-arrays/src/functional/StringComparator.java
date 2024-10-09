package functional;

@FunctionalInterface
public interface StringComparator {
	
	int strategy(String n1, String n2);
}

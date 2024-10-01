package functional;

@FunctionalInterface
public interface StringComparator {

	int strategy(String s1, String s2);
}

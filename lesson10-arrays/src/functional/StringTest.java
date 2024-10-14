package functional;

import bean.Item;

@FunctionalInterface
public interface StringTest {

	Object strategy(Item item);
}

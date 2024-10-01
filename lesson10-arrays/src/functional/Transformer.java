package functional;

import bean.Item;

@FunctionalInterface
public interface Transformer {

	Object strategy(Item item);
}

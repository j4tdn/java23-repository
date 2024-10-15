package functional;

import bean.Item;

@FunctionalInterface

public interface Transformer {
	Object transform(Item item);
}

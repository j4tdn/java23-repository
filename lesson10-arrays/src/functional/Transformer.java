package functional;

import bean.Item;

@FunctionalInterface
public interface Transformer {
	Object stratergy(Item items);
}

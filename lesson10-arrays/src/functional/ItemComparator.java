package functional;

import bean.Item;

@FunctionalInterface
public interface ItemComparator {
	int strategy(Item i1, Item i2);
}

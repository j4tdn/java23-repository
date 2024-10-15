package Functional;

import bean.Item;

@FunctionalInterface
public interface ItemComparator {
	
	int strategy(Item item1, Item item2);
	
}

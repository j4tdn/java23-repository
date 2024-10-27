package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Item;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex05CustomObjectTypeList {
	/*
	 * 	new Item(18, "Item A18", 28d, 101, toDate("29.09.2024")),
		new Item(22, "Item A22", 42d, 101, toDate("28.09.2024")),
		new Item(77, "Item A77", 42d, 103, toDate("27.09.2024")),
		new Item(71, "Item A71", 77d, 102, toDate("26.09.2024")),
		new Item(45, "Item A45", 28d, 101, toDate("28.09.2024")),
		new Item(56, "Item A56", 42d, 103, toDate("03.09.2024")),
		new Item(99, "Item A99", 28d, 102, toDate("20.09.2024")),
		new Item(83, "Item A83", 77d, 101, toDate("15.09.2024")),
		new Item(15, "Item A15", 66d, 103, toDate("06.09.2024"))
	 */
	
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>(DataModel.mockItems());

		Item checkingItem = new Item(22, "Item A22", 42d, 101, DataModel.toDate("28.09.2024"));

		System.out.println("CheckingItem contains --> " + items.contains(checkingItem));

		System.out.println("size --> " + items.size());

		items.remove(checkingItem);

		System.out.println("size after remove --> " + items.size());

		// Sắp xếp tăng dần id
		items.sort((item1, item2) -> {
			return item1.getId().compareTo(item2.getId());
		});
		
		generate("Items after",items);
		
		// khởi tạo new ArrayList, Arrays.asList, List.of
		// add,get,set,remove, removeif, iterate, contains, sort, shuffle.

		Collections.shuffle(items);

		generate("Shuffle", items);
	}
}

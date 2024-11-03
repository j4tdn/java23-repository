package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex05CustomObjectTypeList {
	
	/*
	 new Item(18, "Item A18", 28d, toDate("29.09.2024"), 101),
	 new Item(22, "Item A22", 42d, toDate("28.09.2024"), 101),
	 new Item(77, "Item A77", 42d, toDate("27.09.2024"), 101),
	 new Item(71, "Item A71", 77d, toDate("26.09.2024"), 102),
	 new Item(45, "Item A45", 28d, toDate("25.09.2024"), 102), 
	 new Item(56, "Item A56", 42d, toDate("30.09.2024"), 103),
	 new Item(99, "Item A99", 28d, toDate("01.09.2024"), 103),
	 new Item(83, "Item A83", 77d, toDate("18.09.2024"), 101)
	 */
	
	public static void main(String[] args) {
		
		List<Item> items = new ArrayList<>(DataModel.mockItems());
	
		// demo hàm contains
		// duyệt từng phần tử trong items
		// kiểm tra nếu phần tử nào 'equals' với checkingItem
		// sẽ trả về true, ko có trả về false
		
		Item checkingItem = new Item(22, "Item A22", 42d, DataModel.toDate("28.09.2024"), 101);
		System.out.println("CheckingItem contains --> " + items.contains(checkingItem));
		
		
		System.out.println("size --> " + items.size());
		
		// demo hàm remove
		// duyệt từng phần tử trong items
		// kiểm tra nếu phần tử nào 'equals' với checkingItem
		// sẽ remove, ko thì ko remove
		items.remove(checkingItem);
		
		System.out.println("size after remove --> " + items.size());
		
		// sắp xếp items giảm dần theo sales price
		items.sort(Ex05CustomObjectTypeList::sortSalesPriceDesc);
		
		CollectionUtils.generate("item sorted(id asc)", items);
		
		Collections.shuffle(items);
		
		CollectionUtils.generate("shuffle", items);
		
		// khởi tạo new ArrayList, Arrays.asList, List.of
		// add, get, set, remove, removeIf, iterate, contains, sort, shuffle
	}
	
	private static int sortSalesPriceDesc(Item i1, Item i2) {
		return i2.getSalesPrice().compareTo(i1.getSalesPrice());
	}
	
}

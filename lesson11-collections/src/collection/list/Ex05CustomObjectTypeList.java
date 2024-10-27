package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex05CustomObjectTypeList {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<Item>(DataModel.mockItems());
	
		// demo hàm contains
		// duyệt từng phần tử trong items
		// kiểm tra nếu phần tử nào equals với checkingItem
		// sẽ trả về true, nếu k có trả về false
		
		Item checkingItem = new Item(46, "Item A46" , 77d, DataModel.toDate("26.09.2024"), 102);
		System.out.println("Checking item contains --> " + items.contains(checkingItem));
		
		System.out.println("size --> " + items.size());
		
		//demo hàm remove
		// duyệt từng phần tử trong items
		// kiểm tra nếu phần tử nào 'equals' với checkingItem
		// sẽ remove, ko thì ko remove
		items.remove(checkingItem);
		
		System.out.println("size after removing --> " + items.size());
		
		//sắp xếp items tăng dần theo id
		items.sort((item1, item2) -> {
			return item1.getId().compareTo(item2.getId());
		});

		CollectionUtils.generate("item sorted (id asc)", items);
		// sắp xếp items giảm dần theo salesPrice
		items.sort((item1, item2) -> {
			return item2.getSalesPrice().compareTo(item1.getSalesPrice());
		});
		
		CollectionUtils.generate("item sorted (salesPrice desc)", items);
		
		Collections.shuffle(items);
		
//		CollectionUtils.generateItems("item shuffle ", items);
		CollectionUtils.generate("item shuffle ", items);

		// khởi tạo : new ArrayList, Array.asList, List.of
		// add, get, set, remove, removeIf, iterate, contains, sort, shuffle
		
		
	}
}

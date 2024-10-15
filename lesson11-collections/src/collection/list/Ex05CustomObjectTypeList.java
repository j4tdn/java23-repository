package collection.list;

import java.util.ArrayList;
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
		
		CollectionUtils.generateItems("item sorted (id asc)", items);
	}
}

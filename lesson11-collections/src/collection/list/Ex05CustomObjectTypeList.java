package collection.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex05CustomObjectTypeList {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>(DataModel.mockItems());
		
		// demo hàm contains
		// duyệt từng phần tử trong items
		// kiểm tra nếu phần tử nào 'equals' với checkingItem
		// sẽ trả về true, khong trả về false
		
		Item checkingItem =  new Item(22, "Item A22", 58d, DataModel.toDate("09.09.2024"), 101 );
		
		System.out.println("CheckingItem contains --> " + items.contains(checkingItem));
		
		System.out.println("size --> " + items.size());
		// demo hàm remove
		// duyệt từng phần tử trong items
		// kiểm tra nếu phần tử nào 'equals' với checkingItem
		// sẽ remove, khong thì khong luon
		
		items.remove(checkingItem);
		System.out.println("size after remove --> " + items.size());
		
		// sắp xếp items tăng dần theo getId
		items.sort((item1, item2) -> {
			return item1.getId().compareTo(item2.getId());
			
		});
		
		CollectionUtils.generateItems("item sorted(id asc)", items);
		
		
		
		// new ArrayList, Array.asList, List.of : khởi tạo
		// add, get, set, remove, removeIf iterate, contains, contains, sort, shuffle(xáo) : 
		
	}

}

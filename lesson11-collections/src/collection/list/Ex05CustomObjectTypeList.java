package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex05CustomObjectTypeList {
	
	public static void main (String[] args) {
		List<Item> items = new ArrayList<>(DataModel.mockItems());
		
		//demo hàm contains 
		Item checkingItem = new Item(22, "Item A22", 42d, DataModel.toDate("28.09.2024") , 101);
		System.out.println("CheckingItem Contains -->" + items.contains(checkingItem));
		
		//demo hàm remove 
		
		items.remove(checkingItem);
		System.out.println("size after remove -->" + items.size());
		
		//sắp xếp danh sách item tăng dần theo id 
		
		//items.sort((item1, item 2) -> {
		//	return item1.getId().compareTo(item2.getId());
		//});
		
		CollectionUtils.generateItem("sort --> ", items);
		
		Collections.shuffle(items);
		
		CollectionUtils.generateItem("shuffle --> ", items);
	}
	
}

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
		// duyệt từng phần trử tỏng items
		// kiểm tra nếu phần tử nào 'equals' với checkingItem
		// sẽ trả về true, ko có trả về false
		
		Item checkingItem = new Item(22, "Item A22", 42d, DataModel.toDate("28.09.2024"), 101);
		System.out.println("CheckingItem contains --> " + items.contains(checkingItem));
		
		System.out.println("size --> " + items.size());
		
		// demo hàm remove
		// duyệt từng phần trử trong items
		// kiểm tra nếu phần tử nào 'equals' với checkingItem
		// sẽ remove, ko thì ko remove
		
		items.remove(checkingItem);
		System.out.println("size after remove --> " + items.size());
		
		// sắp xếp items tăng dần theo id
		items.sort((item1, item2) -> {
			return item1.getId().compareTo(item2.getId());
		});
		
		// sắp xếp items giảm dần theo salesPrice
		items.sort((item1, item2) -> {
			return item2.getSalesPrice().compareTo(item1.getSalesPrice());
		});
		
		CollectionUtils.generate("item sorted (id asc)", items);
		
		Collections.shuffle(items);
		CollectionUtils.generate("item shuffle", items);
		
		
	}
}

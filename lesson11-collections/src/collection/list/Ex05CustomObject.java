package collection.list;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import bean.Item;
import model.DataModel;
import ultisl.CollectionUtils;
public class Ex05CustomObject {
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>(DataModel.mockItems());
		
		// demo hàm contains 
		// duyệt từng phần tử trong items
		// kiểm tra nếu phần tử nào ' equals' với checkingItem
		Item chekingItem = new Item(22, "Item A22", 42d, DataModel.toDate("28.09.2024"), 101);
		System.out.println("CheckingItem contains --> " + items.contains(chekingItem));
		
		System.out.println("size -> " + items.size());
		
		items.remove(chekingItem);
		System.out.println("size after remove -> " +items.size() );
		items.sort((item1, item2) -> {
			return item2.getSalesPrice().compareTo(item1.getSalesPrice());
		}) ;
		CollectionUtils.generate("item sorted(id asc) ", items);
		Collections.shuffle(items);
		CollectionUtils.generate("item shuffle  ", items);
		// Khởi tạo new ArrayList, Arrays.asList, List.of
		// Sử dụng các hàm add, remov, get, set, ...
		
	}
}

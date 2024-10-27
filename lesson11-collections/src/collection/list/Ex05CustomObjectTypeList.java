package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex05CustomObjectTypeList {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>(DataModel.mockItems());
		
		// demo ham contains
		// duyet tung phan tu trong items
		// kiem tra neu phan tu nao 'equals' voi checkingItem
		// se tra ve true, ko co tra ve false
		Item checkingItem = new Item(22, "Item A22", 28d, DataModel.toDate("28.09.2024"), 101);
		System.out.println("CheckingItem contains --> " + items.contains(checkingItem));
		
		
		System.out.println("size --> " + items.size());
		
		// demo ham remove
		// duyet tung phan tu trong items
		// kiem tra neu phan tu nao 'equals' voi checkingItem
		// se remove, ko thi ko remove
		items.remove(checkingItem);
		
		System.out.println("size after remove --> " + items.size());
		
		// sap xep items giam dan theo salesPrice
		items.sort((item1, item2) -> {
			return item1.getSalesPrice().compareTo(item2.getSalesPrice());
		});
		
		CollectionUtils.generate("items sorted(id asc)", items);
		
		Collections.shuffle(items);
		
		CollectionUtils.generate("shuffle", items);
		
		// khoi tao new ArrayList, Array.asList, List.of
		// add, get, remove, removeIf, iterate, contains, sort, shuffle
	}
}

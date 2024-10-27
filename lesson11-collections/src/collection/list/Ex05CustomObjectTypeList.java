package collection.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Item;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex05CustomObjectTypeList {
	// == so sánh địa chỉ ở stack

	public static void main(String[] args) {
		
//		List<Item> items = DataModel.mockItems();
		List<Item> items = new ArrayList<>(DataModel.mockItems());
		
		//demo hàm contains
		// duyệt từng phần tử trong items
		//kiểm tra nếu phần tử nào 'equals' với checkingItem
		// equal muốn bằng với phần tử nào Item(Id/salesPrices/...) thì ta sẽ overide lại bên Item
		// sẽ trả về true,k có trả về false
	
		Item checkingItem = new Item(22, "Item A22", 42d, DataModel.toDate("28.09.2024"), 101);
	    System.out.println("Size: " +items.size());
	    // tăng dần theo Id
	    items.sort((item1,item2) -> {
//	    	return item1.getId().compareTo(item2.getId());
	    	return item2.getSalesPrice().compareTo(item1.getSalesPrice()); // giảm dần theo salesPrices
	    });
	    
//	    generateItems("Sorting Asc(tăng dần)", items);
	    generate("Sorting Asc(tăng dần)", items);
	    
	    //shuffle: xáo trộn
	Collections.shuffle(items);
//	generateItems("Shuffle", items);
	generate("Shuffle", items);
	    //Khởi tạo ArrayList: --> new ArrayList, Arrays.asList, List.of
//	    add,get,set,remove,removeIf,contains,sort,itterate,shuffle

	   
	}

}

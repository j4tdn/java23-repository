package generic.extendssuper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01GenericExtends {

	
	public static void main(String[] args) {
		List<Item> items = new ArrayList<>(DataModel.mockItems());
		
//		List<Item> items2 = DataModel.mockItems() // immutable
		
		 // <T extends Comparable<? super T>>
		// hỗ trợ bắt lỗi tại compile
		
		Collections.sort(items);
		
		// Note: sort -- > dùng method có Comparator<T>
		//					để sort được dựa trên các phần tử khác nhau
		
		CollectionUtils.generate("item sort by id asc" , items);
		
	}
	
}

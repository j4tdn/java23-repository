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
		
		// <T extends Comparable<T>> List<T>
		// Ho tro bat loi tai compile
		Collections.sort(items);
		
		// Luu y: sort --> dung method co Comparator<T>
		// de sort dc nhieu cach
		
		CollectionUtils.generate("items sort by id asc", items);
	}
}

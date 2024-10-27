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
		// hỗ trợ bắt lỗi tại compile
		// List<Item> items2 = DataModel.mockItems(); // ko sửa xóa thêm dc
		
		// Lưu ý: sort --> dùng method có Comparator<T>
		// để sort đc nhiều cách
		Collections.sort(items);
		CollectionUtils.generate("items sort by id asc", items);
	}

}

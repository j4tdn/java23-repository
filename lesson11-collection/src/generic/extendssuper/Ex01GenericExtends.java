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

		// <T extends Comparable<T>>
		// Hỗ trợ bắt lỗi tại compile
		Collections.sort(items);

		// lưu ý: sort --> dùng method có comparator<T>
		// để sort được nhiều cách
		CollectionUtils.generate("items sort by id asc", items);
	}
}

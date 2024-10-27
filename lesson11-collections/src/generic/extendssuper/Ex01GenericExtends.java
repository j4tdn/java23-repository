package generic.extendssuper;

import java.util.ArrayList;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex01GenericExtends {

	public static void main(String[] args) {
		List<Item> items = new ArrayList<>(DataModel.mockItems());
		
		// <T extends Comparable<T>> List<T>
		
	}
}

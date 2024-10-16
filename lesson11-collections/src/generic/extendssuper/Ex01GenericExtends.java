package generic.extendssuper;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex01GenericExtends {

	public static void main (String[] args ) {
		List <Item> items = new ArrayList <> (DataModel.mockItems());
		
		Collection.sort(items);
		CollectionUtils.generate("item sort by adc", items);
	}
	
}

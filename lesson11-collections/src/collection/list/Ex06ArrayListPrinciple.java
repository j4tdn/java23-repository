package collection.list;

import java.util.ArrayList;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex06ArrayListPrinciple {

	public static void main(String[] args) {
		/*
		  ^^^ Cơ chế của class ArrayList
		  + ArrayList là 1 class ở trong Java
		  + Sử dụng cơ chế của Array - Mảng và các hàm xử lý 
		  + Có 1 thuộc tính Object[] elementData
		  
		  class ArrayList{
		  	int size;
		  	Object[] elementData;
		  	Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
		  
		  	public ArrayList() {
		  		this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		  		}
		  }
		 */
		
		//B1: Khởi tạo ArrayList qua constructor rỗng
		// Tạo ra 1 ô nhớ ở Heap cho ArrayList
		// Ô nhớ có tt elementData = {}
		Item item1 = new Item(24, "Item A24" , 26d, DataModel.toDate("25.09.2024"), 102);

		List<Item> items = new ArrayList<>();
		
		// B2: Thêm mới 1 phần tử
		items.add(item1);
	}
}

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
		  	int size; // số phần tử của ArrayList
		  	Object[] elementData;
		  	Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
		  	int defaultCapacity = 10;
		  
		  	public ArrayList() {
		  		this.elementData = DEFAULTCAPACITY_EMPTY_ELEMENTDATA;
		  		}
		  		
		  	public boolean add(E e) {
        		add(e, elementData, size);
        		return true;
    		}
    		
    		private void add(E e, Object[] elementData, int s) {
        		if (s == elementData.length)
            		elementData = grow(); // 10 pt { item1, null, null, null, null, null, null, null, null, null }
        		elementData[s] = e;
        		size = s + 1;
    		}
    		
    		private Object[] grow() {
    			return grow(size + 1);
    		}
    		
    		private Object[] grow(int minCapacity) {
        		int oldCapacity = elementData.length;
        		if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
            		int newCapacity = ArraysSupport.newLength(oldCapacity,
                    		minCapacity - oldCapacity, 
                    		oldCapacity >> 1           );
            		return elementData = Arrays.copyOf(elementData, newCapacity);
        		} else {
            		return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
        		}
    		}
    		public static int newLength(int oldLength, int minGrowth, int prefGrowth) {
        		// preconditions not checked because of inlining
        		// assert oldLength >= 0
        		// assert minGrowth > 0

        		int prefLength = oldLength + Math.max(minGrowth, prefGrowth); // might overflow
        		if (0 < prefLength && prefLength <= SOFT_MAX_ARRAY_LENGTH) {
            		return prefLength;
        		} else {
            		// put code cold in a separate method
            		return hugeLength(oldLength, minGrowth);
        		}
    }
		  }
		 */
		
		//B1: Khởi tạo ArrayList qua constructor rỗng
		// Tạo ra 1 ô nhớ ở Heap cho ArrayList
		// Ô nhớ có tt elementData = {}
		Item item1 = new Item(24, "Item A24" , 26d, DataModel.toDate("25.09.2024"), 102);
		Item item2 = new Item(26, "Item A26" , 26d, DataModel.toDate("25.09.2024"), 102);

		List<Item> items = new ArrayList<>();
		
		// B2: Thêm mới 1 phần tử
		
		// Trong lần đầu tiên thêm phần tử vào
		// Tạo elementData mảng 10 phần tử ( defaultCapacity)
		// Đưa phần tử đầu tiên vào
		items.add(item1);
		
		// Khi add các phần tử tiếp theo
		// kiểm tra size đã = ( vượt qua elementsData.length) chưa
		// nếu vượt --> grow 
		// chưa đưa pt mới vào
		// tăng size
		items.add(item2);
		
		// giải lập 
		// items.add(...) đủ 10
		// items.add(item11)
		
		// size: số lượng phần tử của ArrayList
		// length(capacity): sức chứa của Array bên trong ArrayList
						// : sức chứa mặc định = 10
		// cứ 1 lần add mới phần tử nếu size == capacity -> grow
		
		// new ArrayList --> tạo 1 mảng rỗng
		List<String> x = new ArrayList<String>();
		
		// new ArrayList<String>(8) --> tạo 1 mảng gồm 8 phần tử
		// khi biết được ArrayList có số lượng phần tử tối đa là bao nhiêu
		// tạo duy nhất 1 mảng elementData, không cần grow, copy
		List<String> elements = new ArrayList<String>(8);
	}
}

package collection.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import bean.Item;
import jdk.internal.util.ArraysSupport;

public class Ex06ArrayListPrinciple {
	
	public static void main(String[] args) {
		
		/*
		 ^^^ Cơ chế của class ArrayList
		 
		 + ArrayList là 1 class ở trong Java
		 + Sử dụng cơ chế của Array - Mảng và các hàm xử lý
		 + Có 1 thuộc tính Object[] elementData
		 
		 class ArrayList {
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
		        // 10pt {it1, it2, it3, it4, it5, it6, it7, it8, it9, it10} 
		        // 30pt {it1, it2, it3, it4, it5, it6, it7, it8, it9, it10, it11, 19 pt null} 
		            elementData = grow(); 
		        elementData[s] = e;
		        size = s + 1; // size = 11
		    }
		 	
		 	private Object[] grow() {
			    return grow(size + 1);
			}
			
			private Object[] grow(int minCapacity) {
			    int oldCapacity = elementData.length;
			    if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
			        int newCapacity = ArraysSupport.newLength(oldCapacity,
			                minCapacity - oldCapacity,
			                oldCapacity >> 1          );
			        return elementData = Arrays.copyOf(elementData, newCapacity);
			    } else {
			        return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
			    }
			}
			
			public static int newLength(int oldLength, int minGrowth, int prefGrowth) {
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
		
		Item item1 = new Item(1, "A1", 22d);
		Item item2 = new Item(2, "A2", 22d);
		
		Item item11 = new Item(11, "A11", 22d);
		
		// B1: Khởi tạo ArrayList qua constructor rỗng
		// Tạo ra 1 ô nhớ ở HEAP cho ArrayList
		// Ô nhớ có tt elementData = {}
		List<Item> items = new ArrayList<>();
		
		// B2: Thêm mới 1 phần tử
		
		// Trong lần đầu tiên thêm phần tử vào
		// Tạo elementData mảng 10 phần tử(default capacity)
		// Đưa pt đầu tiên vào
		// tăng size
		items.add(item1);
		
		// Khi add các pt tiếp theo
		// kiểm tra size đã =(vượt qua elementsData.length) chưa
		// nếu vượt --> grow
		// chưa đưa pt mới vào
		// tăng size
		items.add(item2);
		
		// giải lập
		// items.add(...) đủ 10
		
		items.add(item11);
		
		// size: số lượng phần tử của ArrayList
		// length(capacity): sức chứa của Array bên trong ArrayList
		//                 : sức chưa mặc định = 10
		// cứ 1 lần add mới phần tử nếu size = capacity --> grow
		
		
		// new ArrayList --> tạo 1 mảng rỗng
		List<String> x = new ArrayList<String>();
		
		// new ArrayList<>(8) --> tạo 1 mảng gồm 8 phần tử
		// khi biết được ArrayList này có số lượng phần tử tối đa là bao nhiêu
		// tạo duy nhất 1 mảng elementData, khỏi cần grow, copy
		List<String> elements = new ArrayList<String>(80);
	}
	
}
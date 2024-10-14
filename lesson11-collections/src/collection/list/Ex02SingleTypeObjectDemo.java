package collection.list;

import java.util.ArrayList;
import java.util.List;

//SOT: Single Type Object: Integer, String, Double, LocalDate...
public class Ex02SingleTypeObjectDemo {

	public static void main(String[] args) {
		// Khởi tạo, thêm,sửa,xóa,lấy ra, sắp xếp,...
		
		List<String> elements = new ArrayList<>();// Object[] elementData
		
		elements.add("A92"); // thêm vào vị trí cuối cùng của danh sách
		elements.add("B42");
		elements.add("Z15");
		elements.add("T86");
		
		elements.add(0, "K7");
		elements.add(3, "X3");
		
		System.out.println("size: " +elements.size()); 
		elements.forEach(seq -> System.out.println(seq + " 	"));

		System.out.println("=================================");
		elements.set(0, "1"); // hàm set dùng để sửa 
		
		// Xóa phần tử có giá trị = T86
		//Kiểm tra trong List<T> nếu có phần tử T87 thì nó sẽ xóa, k thôi
		elements.remove("T86"); 
		
		// Xóa những từ mà có kí tự cuối là số và lớn hơn 5
		// ConcurrentModificationException
		// Vì elements vừa sử dụng để for trong lúc for vửa remove
		// --> Có thể chưa duyệt đến thì phần tử thứ i đã remove
		// Sửa lỗi này: đảm bảo là duyệt đến phần tử thứ i mới được phép xóa ptu thứ i hoặc < i
		// duyệt đồng bộ: sychronous:   duyệt đến i mới sử dụng được i: Iterable#iterate
		// duyệt bất đồng bộ: asynchronous :duyệt i dùng i + 1- đều được: for-each, for-index
//              for(String element:elements) { --> bị lỗi
		// charAt: dùng để lấy từng kí tự
//         char lastOne = element.charAt(elements.size() -1);
//               if(Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5){
//                    	elements.remove(element);
//        	  }
//          }
		
		
		
		
		
		
		elements.removeIf(element -> {
			char lastOne = element.charAt(element.length() -1 );
          return Character.isDigit(lastOne) 
        		       && Integer.parseInt(String.valueOf(lastOne)) > 5;
		});

		System.out.println("size: " +elements.size()); // Phân biệt size và length
		
		// In ra danh sách
		//for-each, for-index
//		for(int i = 0; i < elements.size();i++) {
//			System.out.println(elements.get(i));
//		}
		
		elements.forEach(seq -> System.out.println(seq + " 	"));
		
		System.out.println("==================================");
		List<String> words = new ArrayList<>(elements); // words ni sẽ tạo 1 list mới có KDL là elements
//		List<String> words = elements; // List sẽ lấy cái elements đã có ở trên
		
		System.out.println("size: " +elements.size()); 
		System.out.println("Words:");
		words.forEach(word -> System.out.println(word + " "));
	}
	
}

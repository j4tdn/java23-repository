package collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02SingleTypeObjectDemo {
	
	public static void main (String[] args) {
		// Khởi tạo, thêm, sửa, xoá, sắp xếp,...
		
		//khởi tạo một danh sách rỗng 
		
		List<String> element = new ArrayList<>();
		
		element.add("a92"); // thêm vào vị trí cuối cùng		
		element.add("z15");	
		element.add("d86");
		element.add("x13");
		element.add("k7");
		
		
		
		//in ra danh danh sách 
		
		//for (int i = 0; i < element.size(); i++) {
		//	System.out.println(element.get(i));
		//}
		
		
		
		element.set(2, "n2");
		
		// xoá các phần tử có giá trị là d86 
		
		element.remove("d86"); // kiểm tra trong list nếu có phần tử d86 thì sẽ xoá 
		
		// xoá những từ mà có ký tự cuối cùng là số và lớn hơn 5
		
		// Duyệt đồng bộ là duyệt đến i mới được dùng thứ i --> iterable itarate
		// Duyệt bất đồng bộ lkaf duyệt đến i thì sử dụng i--, i++ đều được 
		
		//for (String e : element) {
		//	char lastOne = e.charAt(e.length()-1);
		//	if (Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5) {
		//		element.remove(lastOne);
		//	}
		//}
		
		//Iterator<String> iterator = element.iterator();
		//while(iterator.hasNext()) {
		//	String e = iterator.next();
		//	char lastOne = e.charAt(e.length()-1);
		//	if (Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5) {
		//	iterator.remove();
		//	}
		//}
		
		element.removeIf(e -> {
			char lastOne = e.charAt(e.length()-1);
			return Character.isDigit(lastOne) && Integer.parseInt(String.valueOf(lastOne)) > 5;
		});
		//iterator.forEachRemaining(seq -> System.out.println(seq + " "));
		
		System.out.println("X3  contains --> " + element.contains("X3"));
		
		System.out.println("size " + element.size());
		
		element.forEach(seq -> System.out.println(seq + " ")); 
	}
	
	
	
}

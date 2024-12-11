package view.stream;

import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

import utils.CollectionUtils;

public class Ex04StreamFilter {

	/*
	 Cho danh sách các số nguyên 
	 +Tìm các phần tử chẵn trong dánh sách 
	 + Unique 
	   . Tạo ra danh sách các phần tử mà không trùng nhau từ danh sách đã cho 
	   --> Vd: 1 2 2 3 3 4 --> 1 2 3 4 
	   . Lấy ra các phần tử là duy nhất trong danh sách 
	   --> VD: 1 2 	2 3 3 4 --> 1 4 
	   + Lấy ra 5 phần tử cuối cùng trong danh sách 
	   + Lấy 3 phần tử đầu tiên trong danh sách  
	  
	 */
	
	public static void main(String[] args) {
		var data = List.of("A","B","B","C","C","D","D","E");
		
		var elements = data.stream()
		               .filter(element -> element.compareTo("B") > 0)
		               .collect(Collectors.toList());
		
		CollectionUtils.generate("1:Danh sách các phần tử lớn hơn B", elements);
		
		//Cau2
		var uniqueEle = data.stream()
				                    .distinct()
				                    .toList();
	// .collect(Collectors.toSet());//chuyển qua set thì sẽ k lấy pt trùng -> prefer-> toSet(hashcode,equals)
		CollectionUtils.generate("2:Danh sách các phần tử k trùng", uniqueEle);
		
		//Câu 3
		/*
		 Map<K,V>
		 K:Thuộc tính muốn group by
		 V: List<T> chứa các phần tử có trùng K 
		 
		 counting
		 Map<K,Long>
		 K: thuộc tính muốn trong group by
		 V: số lượng phần tử trong list
		 
		 Function<T,R> function = e -> e;  ==> Function.idenity()
		  
		 */
		
		data.stream()
		            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
		            .entrySet()
		            .stream()
		            .filter(t -> t.getValue() == 1)
		            .map(Entry::getKey)
		            .toList();
		
		CollectionUtils.generate("3. Lấy 5 phần tử cuối trong danh sách", 
				data.stream()
				    .skip(data.size() - 5) // 8 - 5 skip 3 pt đầu
				    .toList()
				);
		
		CollectionUtils.generate("3. Lấy 3 phần tử đầu tiên trong danh sách", 
				data.stream()
				    .limit(3)
				    .toList()
				);
		            
		
		
		
		
		
	
		
		
	}
}

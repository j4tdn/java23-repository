package view.stream;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import model.DataModel;
import utils.CollectionUtils;

public class Ex05StreamMapping {

	public static void main(String[] args) {
		List<String> elements = List.of("Hello", "Water", "Laptop", "Television");
		
		//Lấy độ dài của từng danh sách trong mảng
		var lengthData = elements.stream()
		        .map(String::length)
//		        .map(e -> e.length())
		        .toList();

		CollectionUtils.generate("Độ dài của từng pt trong danh sách" , lengthData);
		
		//Lấy độ dài của từng từ kèm giá trị 
		
		CollectionUtils.generate("2:Độ dài của từng từ kèm giá trị", 
				elements.stream()
				        .collect(Collectors.toMap(Function.identity() , String::length))
				);
		
		//Câu 3: Lấy số thự tự của cùng tên dĩa thức ăn 
		
		var menu = DataModel.getDishes();
		
	     CollectionUtils.generate("3:Số thự tự của cùng tên dĩa thức ăn", 
	    		 menu.stream()
                     .map(t -> {
                    	 String name = t.getName();
                    	 return name.charAt(name.length()-1);
                     })
                     .toList()
	    		 );
	      
	     List<List<String>> cards = List.of(
	    		 List.of("5 cơ","6 chuồn","2 cơ","2 rô"),
	    		 List.of("3 bích", "4 chuồn"),
	    		 List.of("10 cơ")	 
	    		 );
	     
	     CollectionUtils.generate("4:Tìm quân bài là lá 2: ", 
	    		                   cards.stream()//Stream<List<String>>
	    		                       .flatMap(List::stream)//Stream<String>
	    		                        .filter(card -> card.startsWith("2"))
	    		                        .toList() //List<String>
	    		 );
	     
	     int[][] matrix2D = {
	    		 {2,3,4},
	    		 {5,7,8},
	    		 {1,2,3}
	     };
	     
	     CollectionUtils.generate("5:Chuyển mảng 2 chiều sang 1 chiều: ", 
	    		                   Arrays.stream(matrix2D) //Stream<int[]>
	    		                   .flatMapToInt(Arrays::stream) //IntStream
	    		                   .toArray());
	}
}

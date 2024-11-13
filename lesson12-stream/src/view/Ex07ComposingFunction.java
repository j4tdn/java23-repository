package view;
import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsLast;
import static java.util.Comparator.reverseOrder;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import model.DataModel;
import static utils.CollectionUtils.*;

public class Ex07ComposingFunction {
	
	public static void main(String[] args) {
		// Sắp xếp danh sách các quả táo tăng dần theo weight, giảm dần theo id
		List<Apple> inventory = new ArrayList<>(DataModel.getApples());
		inventory.add(0, null);
		inventory.add(3, null);
//		 Truyền thống
//		inventory.sort((a1, a2) -> {
//			int weightInt = a1.getWeight().compareTo(a2.getWeight());
//			
//			if (weightInt != 0) {
//				return weightInt;
//			}
//			
//			return a2.getId().compareTo(a1.getId());
//		});
//		
		// Kết hợp so sánh
		
		// Hàm có sẵn là lambda
		inventory.sort(
				nullsLast(comparing(Apple::getWeight))
					.thenComparing(Apple::getId, reverseOrder())
				);
		
		generate("1. Sắp xếp danh sách các quả táo tăng dần theo weight, giảm dần theo id ", inventory);
	
		// strategy pattern
		// local variable
		// method reference
		// constructor reference
		// composing function
		
		// -> stream
	
	}
	
}

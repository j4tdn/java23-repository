package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import bean.Apple;
import model.DataModel;

public class Ex07ComposingFunction {

	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>(DataModel.getApples());
		inventory.add(0,null);
		inventory.add(3,null);
		
		
		// Sắp xếp tăng dần theo weight và tăng dần theo id
		inventory.sort((a1, a2) -> {
			int weightInt = a1.getWeight().compareTo(a2.getWeight());
			if(weightInt != 0) {
				return weightInt;

			}
			return a1.getId().compareTo(a2.getId());
		});
			
		// Cách 2 ngắn gọn hơn 
		inventory.sort(Comparator.comparing(Apple::getWeight)
				.thenComparing(Apple::getId));
		
		// TH3: nếu có null
	inventory.sort(
			Comparator.nullsLast(Comparator.comparing(Apple::getWeight)
					.thenComparing(Apple::getId))
			);
	}
}

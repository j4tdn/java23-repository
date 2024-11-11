package view;

import static java.util.Comparator.comparing;
import static java.util.Comparator.nullsLast;

import java.util.ArrayList;
import java.util.List;

import bean.Apple;
import model.DataModel;
import utils.CollectionUtils;

public class Ex07ComposingFunction {

	public static void main(String[] args) {
		
		List<Apple> inventory = new ArrayList<>(DataModel.getApples());
		
		inventory.add(0, null);
		inventory.add(3, null);
		
		inventory.sort((a1, a2) -> {
			return a1.getWeight().compareTo(a2.getWeight());
		});
		
		inventory.sort((a1, a2) -> {
			return a1.getWeight().compareTo(a2.getWeight());
		});
		
		inventory.sort(
				nullsLast(comparing(Apple::getWeight)
						.thenComparing(Apple::getId, re))
				);
		
		CollectionUtils.generate("1. ", inventory);
	}
}

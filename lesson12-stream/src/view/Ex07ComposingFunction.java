package view;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Comparator.*;
import java.util.List;

import bean.Apple;
import model.DataModel;

public class Ex07ComposingFunction {
	public static void main(String[] args) {
		// Sắp xếp danh sách các quả táo tăng dần theo wight, tăng dần theo id
		List<Apple> inventory = new ArrayList<>(DataModel.getApples());
		inventory.add(0,null);
		inventory.add(3,null);
	//	inventory.sort((o1, o2) ->);
	}
}

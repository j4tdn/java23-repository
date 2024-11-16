package view.stream;

import java.util.List;

import bean.Dish;
import model.DataModel;

public class Ex02StreamTraversableOnce {

	public static void main(String[] args) {
		List<Dish> menu = DataModel.getDishes();
		
		
		System.out.println("1.Duyệt lần đầu");
		menu.stream().forEach(System.out::println);
		
		System.out.println("/n=================\n");
		
		System.out.println("1.Duyệt lần hai");
		menu.stream().forEach(System.out::println);
		
	}
}

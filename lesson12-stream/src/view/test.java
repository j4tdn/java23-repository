package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import bean.Apple;
import bean.Item;

public class test {

	public static void main(String[] args) {
		var inventory = mockData();
		
		generate(
				filter(inventory, apple -> apple.getColor().equals("white") && apple.getWeight() > 200)
				, 
				"mau trang");
		
		generate(
				filter1(inventory, a -> a.getId())
				, 
				"lay id");
		
		
	}
	private static List<Apple> mockData(){
		return List.of(
				new Apple(1, "white", 230d, "VN"),
				new Apple(2, "red", 222d, "BK"),
				new Apple(3, "white", 112d, "CN"),
				new Apple(4, "white", 432d, "DT")
				);
	}
	
	private static List<Apple> filter(List<Apple> apples, Predicate<Apple> predicate){
		List<Apple> result = new ArrayList<>();
		
		for(var element: apples)
			if(predicate.test(element))
				result.add(element);
		
		return result;
	}
	
	private static <R> List<R> filter1(List<Apple> apples, Function<Apple, R> funt){
		List<R> result = new ArrayList<>();
		
		for(var apple: apples)
			result.add(funt.apply(apple));
		
		return result;
	}
	
	private static <R> void generate(List<R> apples, String prefix) {
		System.out.println(prefix + "--> {");
		for(var element: apples)
			System.out.println(element);
		System.out.println("}\n");
	}
}

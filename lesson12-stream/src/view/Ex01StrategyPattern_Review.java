package view;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import static utils.CollectionUtils.*;

import bean.Apple;
import model.DataModel;
import model.GreenApplePredicate;

public class Ex01StrategyPattern_Review {
	public static void main(String[] args) {
		var inventory = DataModel.getApples();

		// filter green apples
		// C1: Implementation Class
		var greenApplesImple = filterApples(inventory, new GreenApplePredicate());
		generate("Green apples (implementation): ", greenApplesImple);

		// C2: anonymous class
		var greenApples = filterApples(inventory, new Predicate<Apple>() {
			@Override
			public boolean test(Apple apple) {
				return "green".equals(apple.getColor());
			}
		});
		
		generate("Green apples (anonymous): ", greenApples);

		/* C3:Anonymous func = Lambda
		 Là đoạn code override hàm trừu tượng 0 có ten hàm
		 CẤU TRÚC:
		 (danh sách tham số) -> {
				body
		 }
		
		Lưu ý;
		+ tham số lambda -> bắt buộc KDL
		+ nếu 1 tham số -> có thể bỏ (...)
		+ nếu body 1 dòng -> bỏ {}
			. nếu return type!void -> bỏ chữ return
		*/
		
		List<Apple> greenAppleLamb = filterApples(inventory, (Apple apple) -> "green".equals(apple.getColor()));
		generate("Greeen apples (lambd):", greenAppleLamb);
		
		// filter red apples and price > 200
		List<Apple> redAndHeavyApple = filterApples(inventory,
				apple -> "red".equals(apple.getColor()) && apple.getWeight() > 150d);
		
		generate("red: ", redAndHeavyApple);
		
		//filter apples from VN
		var vnApple = filter(inventory, apple -> apple.getCountry().equalsIgnoreCase("vietnam"));
		generate("vn: ", vnApple);
	}

	// Java hỗ trợ Predicate<T> boolean (T t)

	private static List<Apple> filterApples(List<Apple> inventories, Predicate<Apple> predicate) {
		var result = new ArrayList<Apple>();

		for (var apple : inventories) {
			if (predicate.test(apple)) {
				result.add(apple);
			}
		}

		return result;
		
	}
}

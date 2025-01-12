package view.stream.practice;

import java.util.Optional;

import bean.Item;

public class Ex04Optional {
	public static void main(String[] args) {
		Optional<Item> opt = Optional.ofNullable(getItem());

		if (opt.isPresent()) {
			Item item = opt.get();
			item.setId(20);
			System.out.println("item1 ->" + item);
		}

		opt.ifPresent(item -> {
			item.setId(20);
			System.out.println("item2 -> " + item);
		});

		Item item = opt.orElse(new Item());
		item.setId(20);
		System.out.println("item3 --> " + item);
	}

	private static Item getItem() {
		return null;
	}
}

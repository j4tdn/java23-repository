package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import bean.Item;
import utils.CollectionUtils;

public class Ex06FileReader {

	public static void main(String[] args) throws IOException {

		File file = new File("inventory.txt");
		if (!file.exists()) {
			System.out.println(">>> File path is not existed ...");
			return;
		}
		// read data from file
		List<String> lines = Files.readAllLines(file.toPath());

 		
		CollectionUtils.generate("1. Lines with String type", lines);

		// convert list<String> sang list<Apple>
		
		
		List<Item> data = map(lines,Item::new);
		
		CollectionUtils.generate("2. Lines with Item type",	data);

	}

	public static <T, R> List<R> map(List<T> elements, Function<T, R> function) {

		List<R> result = new ArrayList<>();

		for (T element : elements) {
			result.add(function.apply(element));
		}
		return result;
	}

}

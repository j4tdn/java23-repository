package view;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;

import bean.Item;
import ultisl.CollectionUtils;

public class Ex06FileReader {
	public static void main(String[] args) throws IOException {
		/*
		 Yêu cầu đọc dữ liệu từ file inventory .txt vào List <Appale> inventory
		 */
		File file = new File("inventory");
		if(!( file.exists())) {
			System.out.println(">>> File path is not existed....");
			return;
		}
		List<String> lines = Files.readAllLines(file.toPath());
		CollectionUtils.generate("1. Lines with String type", lines);
		List<Item> data = map(lines, Item::new);
		CollectionUtils.generate("2. Lines with Item type", data);
	}
	public static <T,R> List<R> map(List<T> elements, Function<T, R> funt){
		List<R> result = new ArrayList<>();
		for(T element: elements) {
			result.add(funt.apply(element));
		}
		return result;
	}
	
}

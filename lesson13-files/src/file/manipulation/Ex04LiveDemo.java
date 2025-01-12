package file.manipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04LiveDemo {
 
	public static void main(String[] args) {
			readFile(Path.of("bkit/test/data.txt")).stream()
			.skip(1)
			.flatMap(line -> Arrays.asList(line.strip().split("[^\\d]+")).stream())
			.filter(text -> !text.isEmpty())
			.map(Integer::parseInt)
			.distinct()
			.sorted()
			.forEach(System.out::println);
		
	}
		
	private static List<String> readFile(Path path) {
		List<String> lines = new ArrayList<>();
		
		try {
			lines = Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return lines;
	}
	
}
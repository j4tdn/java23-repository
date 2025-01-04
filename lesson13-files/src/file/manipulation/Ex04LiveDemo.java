package file.manipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex04LiveDemo {

	public static void main(String[] args) {
		
		
//		lines.stream()
//			 .skip(1)
//			 .map(line -> {
//				 return Arrays.asList(line.strip().split("[a-zA-Z]+")); // List<String>
//			 }) //Stream<List<String>> {(43,0), (2), (2), 231233
//			 .toList(); // List<List<String>>
		
		readFile(Path.of("bkit/test/data.txt")).stream()
		 	 .skip(1)
		 	 .flatMap(line -> Arrays.asList(line.strip().split("[^\\d]+")).stream()) //Stream<String> {43, 0, 2, 2, 231233 }
		 	 .filter(text -> !text.isEmpty())
		 	 .distinct()
		 	 .map(Integer::parseInt)
		 	 .sorted()
		 	 .forEach(System.out::println); // List<List<String>>
		
	}
	
	private static List<String> readFile(Path path) {
		List<String> lines = new ArrayList<>();
		
		try {
			Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return lines;
	}
	
}

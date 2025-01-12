package file.text;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

import utils.FileUtils;

public class Ex02FileReader {
	public static void main(String[] args) {
		// which file
		File file = new File("data/input.txt");

		if (!file.exists()) {
			System.out.println(">> File '" + file.getName() + "' is not existed");
			return;
		}

		// read file --> list<String>
		try {
			List<String> lines = Files.readAllLines(file.toPath());
			int size = lines.size();
			
			if (lines.size() != 0) {
				lines.remove(0);
			}
			
			List<String> nums = lines.stream()
					.map(line -> line.split("[a-z]+")) // Stream<String[]> --> { {43,0}, {002}, {2,77}..}
					.flatMap(aof -> Arrays.stream(aof)) // stream<String> -> {43,0,002,2,77...}
					.filter(e -> !e.isEmpty())
					.map(Integer::parseInt)
					.sorted()
					.map(String::valueOf)
					.toList();
			
			// opt: handle/process login
			File target = FileUtils.createNewFile("data/output.txt");
			Files.write(target.toPath(), nums);
			
			FileUtils.open(target);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		


		// convert # type
	}
}

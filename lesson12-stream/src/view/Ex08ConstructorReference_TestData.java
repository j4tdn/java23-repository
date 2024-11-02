package view;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

import utils.CollectionUtils;
import view.Ex07ConstructorReference.TestCon;

public class Ex08ConstructorReference_TestData {

	public static void main(String[] args) {
		List<String> lines = readFile("testcon_data.txt");
		lines.forEach(line -> {
			System.out.println("line -> " + line);
		});

		// convert line (String) to TestCon(Obj)

//		List<TestCon> result = new ArrayList<>();
//		lines.forEach(line -> {
//			String[] tokens = line.split(", ");
//			if (tokens.length == 4) {
//				Integer a1 = Integer.parseInt(tokens[0]);
//				String a2 = tokens[1];
//				LocalDate a3 = LocalDate.parse(tokens[2], DateTimeFormatter.ofPattern("dd.MM.yyyy"));
//				BigDecimal a4 = new BigDecimal(tokens[3]);
//				TestCon tc = new TestCon(a1, a2, a3, a4);
//				result.add(tc);
//			}
//		});
		
		List<TestCon> result = map(lines, TestCon::new);

		CollectionUtils.generate("Rs: ", result);
	}

	
	private static <T,R> List<R> map(List<T> lines, Function<T, R> function) {
		List<R> result = new ArrayList<>();
		lines.forEach(element -> {
			R r = function.apply(element);
			result.add(r);
		});
		return result;
	}

	private static List<String> readFile(String pathFile) {
		Path path = Paths.get(pathFile);
		System.out.println(path);
		try {
			return Files.readAllLines(path);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return List.of();
	}
}

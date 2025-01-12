package file.text;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import bean.Apple;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {


	public static void main(String[] args) {
		File file = new File("wdata/inventory.txt");
		
		if(!file.exists()) {
			System.out.println(">> File '" + file.getName() + "' is not existed");
			return;
		}
		
		// data(#file, java) -> T, List<T>, Set<?>
		var apples = DataModel.getApples();
		
		// -> convert to list
		List<String> lines = (apples.stream()
					.map(Apple::toline)
				.collect(Collectors.toCollection(ArrayList::new)));
		
		lines.add(0, "*** list apple ****");
		lines.add(1, "============");

		// write List<String> to target file
		// each element in List<String> -> 1 line in target file

		try {
			Files.write(file.toPath(), lines);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// awt open file
		FileUtils.open(file);

		System.out.println(">> End <<");

		// Each element in List<String> --> 1 line in target file

	}
}

package file.manipulation;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

public class Ex02FileWriterAvailable {

	public static void main(String[] args) {
		
		File file = FileUtils.createFile("bkit/java23/model/item-test-data.txt");
		
		Path path = file.toPath();
		
		List<String> lines = DataModel.mockItems()
									  .stream()
									  .map(Item::toLine)
									  .toList();
		
		try {
			Files.write(path, lines);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished writing file ...");
	}
}

package file.manipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import bean.Item;
import model.DataModel;

public class Ex02FileWriterAvailable {
	
	public static void main(String[] args) {
		
		// File file = FileUtils.createFile("bkit/java23/model/item-test-data.txt");
		// Path path = file.toPath();
		
		Path path = Paths.get("bkit/java23/model/item-test-data.txt");
		
		List<String> lines =  DataModel.mockItems().stream()
				.map(Item::toLine)
				.toList();
		
		try {
			Files.write(path, lines);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Finished writing file ...");
		
	}
	
}

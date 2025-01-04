package file.mainipulation;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import utils.FileUtils;

public class Ex03FileReaderAvailable {
	public static void main(String[] args) {
		
		/*
		 witeFile
		 + input: file/path,collection<string>
		 + method: Files.write(...)
		 
		 */
		Path path = FileUtils.createFile("bkit/jave23/data/item-model.txt").toPath();
		try {
			List<String> lines = Files.readAllLines(path);
			System.out.println("=== data from file == ");
			lines.forEach(System.out::println);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}

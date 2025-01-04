package file.manipulation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import utils.FileUtils;

public class Ex03FileReaderAvailable {

	public static void main(String[] args) {
		
		/*
		  writeFile
		  + input: file(path), collection<String>
		  + method: Files.write(..)
		  
		  readFile
		  + input: file/path
		  + method: readAllLines(path)
		  + output: List<String> --> convert Collection<T>
		  
		 */
		
		Path path = FileUtils.createdFile("bkit/java23/model/item-test-data.txt").toPath();
		
		try {
			List<String> lines = Files.readAllLines(path);
			
			System.out.println("=== data from file ===");
			lines.forEach(System.out::println);
			
		} catch (IOException e){
			e.printStackTrace();
		}
	}
	
}

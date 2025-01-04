package file.manipulation.serialized;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Dish;
import utils.FileUtils;

public class Ex02FileInputStreamDemo {

	public static void main(String[] args) {
		File file = FileUtils.createdFile("bkit/java23/serialized/menu.txt");
		
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Object object = ois.readObject();
			
			@SuppressWarnings("unchecked")
			List<Dish> menu = (List<Dish>) object;
			
			System.out.println("=== Data from Serialized File === ");
			menu.forEach(System.out::println);
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(ois, fis);
		}
	}
	
}

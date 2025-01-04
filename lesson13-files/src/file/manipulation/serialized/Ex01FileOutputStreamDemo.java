package file.manipulation.serialized;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Dish;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileOutputStreamDemo {

	public static void main(String[] args) {
		
		File file = FileUtils.createFile("bkit/java23/serialized/menu.txt");
		List<Dish> menu = DataModel.mockDishes();
		
		// Ghi file với serialized data
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			oos.writeObject(menu);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(oos, fos);
		}
		
		System.out.println("Finish writing file...");
		
	}
	
}

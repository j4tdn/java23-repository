package file.mainipulation.seialized;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Dish;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileOutputStreamDemo {
	public static void main(String[] args) {
		
		File file = FileUtils.createFile("bkit/java23/serialzed/menu.txt");
		List<Dish> menu = DataModel.mockDishes();
		
		// ghi file voi serialzed
		
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		try {
			 fos = new FileOutputStream(file);
			 oos = new ObjectOutputStream(fos);
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			FileUtils.close(fos,oos);
		}
	}
}

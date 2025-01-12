package file.serialize;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.List;

import bean.Dish;
import model.DataModel;
import utils.FileUtils;

//Os -> output stream
public class Ex02FileOs {
	public static void main(String[] args) {
		File file = FileUtils.createNewFile("data/serialize.txt");
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		// Ghi file
		try {
			fos = new FileOutputStream(file);
			oos = new ObjectOutputStream(fos);
			
			// data
			List<Dish> menu = DataModel.mockDishes();
			
			oos.writeObject(menu);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			FileUtils.close(oos, fos);
		}

		FileUtils.open(file);

	}
}

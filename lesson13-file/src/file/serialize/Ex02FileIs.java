package file.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.List;

import bean.Dish;
import utils.FileUtils;

public class Ex02FileIs {
	public static void main(String[] args) {
		File file = new File("data/serialize.txt");

		if (!file.exists()) {
			System.out.println("file is not existed");
			return;
		}

		FileInputStream fis = null;
		ObjectInputStream ois = null;

		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			
			Object object = ois.readObject();

			List<Dish> menu = (List<Dish>) object;

			menu.forEach(System.out::println);
		}
		catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			FileUtils.close(fis, ois);
		}
		
	}
}

package file.manipulation;

import java.util.List;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {

	public static void main(String[] args) {
		
		// .txt --> readable
		
		// dang toan: Collection<T> --> writeFile(file)
		// Collection<T> --> Collection<String> --> writeFile(data, file)
		
		// String parentPath = "bkit/java23/data/";
		
		// String fileName = "exported-" + System.currentTimeMillis() + ".txt";
		
		String path = FileUtils.createFile("item-model.txt").getPath();
		
//		File file = FileUtils.createFile("bkit/java23/data/item-model.txt");
//		String path = file.getPath();
		
		List<String> lines = DataModel.mockItems()
			 .stream()
			 .map(Item::toLine)
			 .toList();
		
		FileUtils.writeFile(path, lines, true);
		
		// 1. Ghi vào file --> + thêm data mới ko xóa nội dung cũ
		
		// 2. Ghi vào file --> + xóa nội dung cũ [tên file ko trùng nhau]
	}
}

package file.manipulation;

import java.io.File;
import java.nio.file.Files;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {

	public static void main(String[] args) {
		
		// .txt --> readable
		
		// dạng toán: Collection<T> --> writeFile(file)
		// Collection<T> --> Collection<String> --> writeFile(data, file)
		
		// String parentPath = "bkit/java23/data/";
		// String fileName = "exported-" + System.currentTimeMillis() + ".txt";
		
		String path = FileUtils.createFile("bkit/java23/data/item-model.txt").getPath();
		
		List<String> lines = DataModel.mockItems().stream()
				 .map(Item::toLine)
				 .toList();
		
		// Tự code
		FileUtils.writeFile(path, lines, true);
		
		// 1. Ghi vào file --> + thêm dât mới, không xóa nội dung cũ
		
		// 2. Ghi vào file --> + xóa nội dung cũ [tên file không trùng nhau]
		
		// Dùng hàm có sẵn
		// Files.write
	
	}
}

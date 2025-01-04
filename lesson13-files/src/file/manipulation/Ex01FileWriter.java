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
		
//		String parentPath = "bkit/java23/data/";
//		
//		String fileName = " exported-" + System.currentTimeMillis() + ".txt";
//		
//		String path = FileUtils.createdFile(parentPath + fileName).getPath();
		
		// demo ghi mới vào file
		String path = FileUtils.createdFile("bkit/java23/data/item-model.txt").getPath();
		
		List<String> lines = DataModel.mockItem().stream()
			.map(Item::toLine)
			.toList();
		
		// tự code	
		FileUtils.writeFile(path, lines, true);
		
		// 1. ghi vào file --> + thêm data mới ko xóa nội dung cũ
		
		// 2. ghi vào file --> + xóa nội dung cũ [tên file ko trùng nhau]
		
		// dùng hàm có sẵn
		// Files.wr
		
	}
	
}

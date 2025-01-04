package file.mainipulation;

import java.io.File;
import java.util.List;

import bean.Item;
import model.DataModel;
import utils.FileUtils;

public class Ex01FileWriter {
	
	// dạng toán : Collection<T> --> writeFile(file)
	// Collection<T> -- > Collection
	public static void main(String[] args) {
		
		//String parentPath = "bkit/jave23/data/";
		//String filename = "exported-" +System.currentTimeMillis() + ".txt";
		
		String path = FileUtils.createFile("bkit/jave23/data/item-model.txt").getPath();
		
		List<String> lines = DataModel.mockItems().stream()
				.map(Item::toLine)
				.toList();
		// Tự code
		FileUtils.writeFile(path,lines,true);
		
		//1. Ghi vào file cũ --> + thêm data mới không xóa nội dung cũ
		
		//2. Ghi vào file --> + xóa nội dung cũ [tên file ko trùng nhau]
		
		
	}
}

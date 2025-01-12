package file.structure;

import java.io.File;
import java.io.IOException;

import utils.FileUtils;

public class Ex01FileCreator {
	public static void main(String[] args) {
		// relative path: đường dẫn tương đối
		// --> data/draft.txt --> .../lesson13/data/draft

		// absolute path: đường dẫn tuyệt đối
		// C:/hello/...
		FileUtils.createNewFile("wdata/inventory.txt");
		System.out.println("... Finished ...");
	}
}

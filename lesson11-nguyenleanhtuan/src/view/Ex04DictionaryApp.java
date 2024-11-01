package view;

import bean.Word;
import model.Dictionary;

import java.util.Scanner;

public class Ex04DictionaryApp {
	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("Chương trình từ điển:");
			System.out.println("1. Thêm từ mới");
			System.out.println("2. Tra từ");
			System.out.println("3. Thoát");
			System.out.print("Chọn chức năng: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				System.out.print("Nhập từ: ");
				String tu = scanner.nextLine();
				System.out.print("Nhập nghĩa: ");
				String nghia = scanner.nextLine();
				System.out.print("Nhập loại từ: ");
				String loaiTu = scanner.nextLine();
				System.out.print("Nhập ghi chú: ");
				String ghiChu = scanner.nextLine();

				Word newWord = new Word(tu, nghia, loaiTu, ghiChu);
				if (dictionary.themTuMoi(newWord)) {
					System.out.println("Thêm từ thành công!");
				} else {
					System.out.println("Từ đã tồn tại trong từ điển.");
				}
				break;

			case 2:
				System.out.print("Nhập từ cần tra: ");
				String tuCanTra = scanner.nextLine();
				Word word = dictionary.traTu(tuCanTra);

				if (word != null) {
					System.out.println("Kết quả tra từ: ");
					System.out.println(word);
				} else {
					System.out.println("Từ không tồn tại trong từ điển.");
				}
				break;

			case 3:
				System.out.println("Thoát chương trình.");
				scanner.close();
				System.exit(0);
				break;

			default:
				System.out.println("Lựa chọn không hợp lệ. Vui lòng thử lại.");
				break;
			}
		}
	}
}

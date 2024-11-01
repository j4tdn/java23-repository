package view;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import bean.Word;

public class Ex04 {

	public static void main(String[] args) {
		Dictionary dictionary = new Dictionary();
		Scanner scanner = new Scanner(System.in);

		Map<Integer, Runnable> actions = new HashMap<>();
		actions.put(1, () -> addNewWord(dictionary, scanner));
		actions.put(2, () -> lookupWord(dictionary, scanner));


		while (true) {
			System.out.println("\n=== Từ Điển ===");
			System.out.println("1. Thêm từ");
			System.out.println("2. Tra cứu ");

			int choice = scanner.nextInt();
			scanner.nextLine();

			Runnable action = actions.get(choice);
			if (action != null) {
				action.run();
				if (choice == 3)
					break;
			} else {
				System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
			}
		}
	}

	public static void addNewWord(Dictionary dictionary, Scanner scanner) {
		System.out.print("Nhập từ: ");
		String word = scanner.nextLine();

		System.out.print("Nhập nghĩa: ");
		String meaning = scanner.nextLine();

		System.out.print("Nhập loại từ: ");
		String type = scanner.nextLine();

		System.out.print("Nhập ghi chú: ");
		String note = scanner.nextLine();

		Word newWord = new Word(word, meaning, type, note);
		dictionary.addWord(newWord);
		System.out.println("Từ mới đã được thêm vào từ điển.");
	}

	public static void lookupWord(Dictionary dictionary, Scanner scanner) {
		System.out.print("Nhập từ cần tra: ");
		String word = scanner.nextLine();

		Word foundWord = dictionary.lookup(word);
		if (foundWord != null) {
			System.out.println("Kết quả tra cứu:\n" + foundWord);
		} else {
			System.out.println("Từ này không có trong từ điển.");
		}
	}

}
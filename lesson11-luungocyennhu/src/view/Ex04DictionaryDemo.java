package view;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bean.CDs;
import bean.Dictionary;

public class Ex04DictionaryDemo {

	public static void main(String[] args) {
		List<Dictionary> d = new ArrayList<>();
		 Scanner ip = new Scanner(System.in);
		
		d.add(new Dictionary("subject", "chủ đề", "Danh từ", "Đồng nghĩa: topic"));
		d.add(new Dictionary("library", "thư viện", "Danh từ", "Đồng nghĩa: reading room"));
		d.add(new Dictionary("function", "chức năng", "Danh từ", "Đồng nghĩa: purpose"));

		printf("Danh sách Dictionary sau khi thêm", d);
		
		System.out.print("Nhập từ: ");
        String word = ip.nextLine();
        System.out.print("Nhập nghĩa: ");
        String meaning = ip.nextLine();
        System.out.print("Nhập loại từ: ");
        String partOfSpeech = ip.nextLine();
        System.out.print("Nhập ghi chú: ");
        String note = ip.nextLine();
        
        d.add(new Dictionary(word, meaning, partOfSpeech, note));
		printf("Danh sách Dictionary sau khi thêm", d);
		
		System.out.print("Nhập từ cần tìm kiếm: ");
        String searchWord = ip.nextLine();
        Dictionary result = searchWord(d, searchWord);
        System.out.println(" --> Kết quả: \n" + result);
	}
	
	private static void printf(String prefix, List<Dictionary> ds) {
		System.out.println(prefix + " --> {");
		for(Dictionary d: ds) {
			System.out.println(d);
		}
		System.out.println("}\n");
	}
	
	private static Dictionary searchWord(List<Dictionary> ds, String text) {
		for(Dictionary d: ds) {
			if (d.getWord().equals(text)) {
				return d;
			}
		}
		return null;
	}
}

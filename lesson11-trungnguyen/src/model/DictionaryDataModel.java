package model;

import java.util.HashSet;
import java.util.Set;

import bean.Word;

public class DictionaryDataModel {
	
	public static Set<Word> generateMockData() {
        Set<Word> mockWords = new HashSet<>();

        mockWords.add(new Word("apple", "Quả táo", "Danh từ", "Trái cây màu đỏ hoặc xanh."));
        mockWords.add(new Word("banana", "Quả chuối", "Danh từ", "Trái cây dài, màu vàng."));
        mockWords.add(new Word("run", "Chạy", "Động từ", "Di chuyển nhanh bằng chân."));
        mockWords.add(new Word("beautiful", "Đẹp", "Tính từ", "Có hình dáng hoặc màu sắc dễ chịu."));
        mockWords.add(new Word("quickly", "Nhanh chóng", "Trạng từ", "Thực hiện một cách nhanh."));
        mockWords.add(new Word("computer", "Máy tính", "Danh từ", "Thiết bị điện tử để xử lý thông tin."));
        mockWords.add(new Word("book", "Sách", "Danh từ", "Tài liệu in trên giấy, thường có nhiều trang."));
        mockWords.add(new Word("study", "Học", "Động từ", "Học hỏi và tiếp thu kiến thức."));
        
        return mockWords;
    }
}

package model;

import java.util.ArrayList;
import java.util.List;
import bean.Word;

public class Dictionary {

	private List<Word> danhSachTu;

	public Dictionary() {
		danhSachTu = new ArrayList<>();
	}

	// Thêm một từ mới vào từ điển
	public boolean themTuMoi(Word tuMoi) {
		// Kiểm tra xem từ đã tồn tại trong từ điển chưa
		for (Word tu : danhSachTu) {
			if (tu.getTu().equalsIgnoreCase(tuMoi.getTu())) {
				return false; // Từ đã tồn tại
			}
		}
		danhSachTu.add(tuMoi);
		return true; // Thêm thành công
	}

	// Tra từ điển
	public Word traTu(String tuCanTra) {
		for (Word tu : danhSachTu) {
			if (tu.getTu().equalsIgnoreCase(tuCanTra)) {
				return tu; // Tìm thấy từ
			}
		}
		return null; // Không tìm thấy từ
	}

	public List<Word> getDanhSachTu() {
		return danhSachTu;
	}
}

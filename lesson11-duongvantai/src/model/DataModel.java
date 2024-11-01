package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import bean.CD;
import bean.Word;

public class DataModel {
	public static List<CD> mockCD(){
		// immutable
		//Ex02
		return  List.of(
				new CD(4, "Pop", "Michael Jackson", 10, 15.99),
				new CD(	5, "Rock", "Queen", 12, 20.50),
				new CD(	2, "Jazz", "Miles Davis", 8, 18.75),
				new CD(	3, "Classical", "Ludwig van Beethoven", 9, 22.00),
				new CD(	1, "Hip Hop", "Tupac Shakur", 15, 19.99),
				new CD(	8, "Country", "Johnny Cash", 11, 17.50),
				new CD(	7, "Electronic", "Daft Punk", 13, 21.00),
				new CD(	6, "Reggae", "Bob Marley", 14, 16.75)
				);
	}
	//Ex04
	public static List<Word> mockWord(){
		return List.of(
				new Word( "học", "to learn", "động từ",  "dùng trong ngữ cảnh giáo dục"),
				new Word( "đẹp", "beautiful", "tính từ",  "dùng để miêu tả vẻ ngoài"),
				new Word( "nhà", "home", "danh từ",  " nơi ở"),
				new Word( "chạy", "to run", "động từ",  "hoạt động thể chất"),
				new Word( "sách", "book ", "danh từ",  "dùng để đọc")
				);
	}
	
	
}

package model;

import bean.CD;
import bean.CDStore;

public class CDData {

	private CDStore data;
	
	public CDData() {
		data = new CDStore();
		addCDs();
	}
	
	private void addCDs() {
		
		data.addCd(new CD(1, "Pop", "Taylor Swift", 10, 20000));
		data.addCd(new CD(2, "Rock", "Imagine Dragons", 12, 25000));
		data.addCd(new CD(3, "Jazz", "Norah Jones", 8, 30000));
		data.addCd(new CD(5, "Classical", "Ludwig van Beethoven", 15, 35000));
		data.addCd(new CD(5, "Hip-Hop", "Kendrick Lamar", 14, 18000));
		data.addCd(new CD(6, "Pop", "Dua Lipa", 9, 22000));
		data.addCd(new CD(5, "Rock", "Foo Fighters", 11, 28000));
		data.addCd(new CD(8, "Jazz", "Miles Davis", 7, 33000));
		data.addCd(new CD(9, "Classical", "Johann Sebastian Bach", 13, 40000));
		data.addCd(new CD(10, "Hip-Hop", "Drake", 10, 17000));
		data.addCd(new CD(11, "Pop", "Ariana Grande", 10, 21000));
		data.addCd(new CD(12, "Rock", "Queen", 12, 24000));
		data.addCd(new CD(1, "Jazz", "Ella Fitzgerald", 8, 31000));
		data.addCd(new CD(14, "Classical", "Wolfgang Amadeus Mozart", 15, 36000));
		data.addCd(new CD(15, "Hip-Hop", "J. Cole", 14, 19000));
		data.addCd(new CD(16, "Pop", "Bruno Mars", 9, 23000));
		data.addCd(new CD(17, "Rock", "Linkin Park", 11, 27000));
		data.addCd(new CD(11, "Jazz", "John Coltrane", 7, 34000));
		data.addCd(new CD(19, "Classical", "Frédéric Chopin", 13, 39000));
		data.addCd(new CD(15, "Hip-Hop", "Lil Nas X", 10, 16000));
	}
	
	public CDStore getData() {
		return data;
	}
	
}
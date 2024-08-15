package datetime;

import java.util.Calendar;

public class Ex02Calendar {
	// strategy pattern
	// singleton pattern
	//builder pattern : :LocalDate, LocalTime, LocalDateTime ...
	
	public static void main(String[] args) {
		
		// c--> tra ve thong tin thoi gian hien tai
		Calendar c =  Calendar.getInstance();
		System.out.println("c --> " +c);
	}
}

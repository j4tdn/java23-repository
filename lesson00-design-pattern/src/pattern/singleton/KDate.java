package pattern.singleton;

public class KDate {
	
	private static KDate INSTANCE = null;
	
	private int day;
	private int month;
	private int year;
	
	public static KDate getInstance () {
		if (INSTANCE == null) {
			INSTANCE = new KDate();
		}
		return INSTANCE;
	}
	/*
	 * Empty constructor
	 */
	public KDate() {
		// TODO Auto-generated constructor stub
	}
	
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public static KDate getInstance1() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}

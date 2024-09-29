package pattern.singleton;

public class KDate {

private static KDate INSTANCE = null;
	
	private int day;
	private int month;
	private int year;
	
	public static KDate getInstance() {
		if (INSTANCE == null) {
			INSTANCE = new KDate();
		}
		return INSTANCE;
	}

	/**
	 * Empty constructor
	 */
	private KDate() {
	}

	public static KDate getINSTANCE() {
		return INSTANCE;
	}

	public static void setINSTANCE(KDate iNSTANCE) {
		INSTANCE = iNSTANCE;
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

	@Override
	public String toString() {
		return "KDate [day=" + day + ", month=" + month + ", year=" + year + "]";
	}
	
	
}
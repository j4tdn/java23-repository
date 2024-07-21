package bean;

public class NumberWithLevel {
	
	int number;
	int level;
	
	public NumberWithLevel() {
	}

	public NumberWithLevel(int number) {
		this.number = number;
		this.level = calculateLevel(number);
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "NumberWithLevel [number=" + number + ", level=" + level + "]";
	}
	
	public static int calculateLevel(int number) {
		int level = 0;
		for(int i = 0; i <= number; i++) {
			if(number % 1 == 0) {
				level++;
			}
		}
		return level;
	}
	
}

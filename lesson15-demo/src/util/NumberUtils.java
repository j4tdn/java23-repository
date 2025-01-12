package util;

import java.math.BigDecimal;

public class NumberUtils {
	private NumberUtils() {

	}

	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}

package utils;

import java.math.BigDecimal;
import java.util.Collection;
import java.util.function.Function;

public class NumberUtils {

	private NumberUtils() {

	}
	
	public static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}

}
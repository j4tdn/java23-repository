package utils;

import java.util.Objects;

import org.apache.commons.codec.digest.DigestUtils;

public class SqlUtils {

	private SqlUtils() {
	}
	
	public static String md5(String text) {
		Objects.requireNonNull(text, "text should not be null");
		return DigestUtils.md5Hex(text);
	}

	public static void close(AutoCloseable... objectsToBeClosed) {
		try {
			for (AutoCloseable object : objectsToBeClosed) {
				object.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
package utils;

public class SqlUtils {

	private SqlUtils() {
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

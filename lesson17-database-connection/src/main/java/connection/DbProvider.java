package connection;

import java.io.IOException;
import java.util.Properties;

public class DbProvider {

	private static String DB_CONFIG_PATH = "config.properties";

	private DbProvider() {
	}

	public static Properties getProperties() {
		Properties props = new Properties();

		try {
			// ...\project_path\target\classes
			ClassLoader classLoader = DbProvider.class.getClassLoader();
			props.load(classLoader.getResourceAsStream(DB_CONFIG_PATH));
		} catch (IOException e) {
			e.printStackTrace();
		}

		return props;
	}

}
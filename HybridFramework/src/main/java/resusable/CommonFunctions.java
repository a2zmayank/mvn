package resusable;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CommonFunctions {

	public static String getConfigValue(String strKey) throws IOException {
		String strPath = System.getProperty("user.dir") + "/resources/config.properties";
		FileInputStream fis = new FileInputStream(strPath);
		Properties prop = new Properties();
		prop.load(fis);
		
		return prop.getProperty(strKey);
	}
}

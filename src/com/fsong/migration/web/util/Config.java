package com.fsong.migration.web.util;

import java.io.InputStream;
import java.util.Properties;

public class Config {
	private static InputStream in = null;
	public static Properties config = new Properties();
	public static String HTTP_SERVER="HTTP_SERVER";

	
	static {
		try {
//			File file = new File(System.getProperty("catalina.home") + "/conf/AbleSkyConfig.properties");
//			if (file.exists()) {
//				in = new FileInputStream(file);
//			} else {
//				/**
//				 * use default config
//				 */
//				in = Config.class.getClassLoader().getResourceAsStream("Config.properties");
//			}
			in = Config.class.getClassLoader().getResourceAsStream("Config.properties");
			config.load(in);
			HTTP_SERVER = config.getProperty(HTTP_SERVER).trim();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}

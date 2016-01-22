package com.letsparty.weixin.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * 
 * @author mengce
 * use to get weixin Appid & AppSecret properties
 */
public class ConfigUtil {

	private static Properties props = new Properties();
	
	static{
		try{
			props.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("/wechat.properties"));
		}catch(FileNotFoundException e){
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String get(String key){
		
		return props.getProperty(key);
	}
	
	public static void set(Properties prop){
		
		props = prop;
		
	}
}

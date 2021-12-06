package dao;

import java.util.HashMap;

public class Session {
	private static HashMap<String, Object> datas = new HashMap<String, Object>();
//						  "loginUser"	UserDTO loginUser
	public static void set(String key, Object value) {
		datas.put(key, value);
	}
	
	public static Object get(String key) {
		return datas.get(key);
	}
}

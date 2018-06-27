package main.java;

import java.util.HashMap;

public class ValExchange {
	public HashMap<String, String> valExchange(HashMap<String, String> map){
		if (!map.get("val1").isEmpty()) {
		String value1 = map.get("val1");
		map.replace("val2", value1);
		map.replace("val1", "");
		}
		return map;
	}

}

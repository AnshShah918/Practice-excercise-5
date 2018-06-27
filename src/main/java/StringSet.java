package main.java;

import java.util.HashMap;

public class StringSet {
	
	public HashMap<String, Boolean> Setter (String[] str){
		HashMap<String, Boolean> map = new HashMap<>();
		for (String string : str) {
			if(!string.isEmpty())
				if(map.containsKey(string)) {
					map.put(string, true);
				}else
				{
					map.put(string, false);
				}
		}
		return map;
		
	}

}
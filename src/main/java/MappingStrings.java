package main.java;

import java.util.HashMap;

public class MappingStrings {
	public HashMap<String, Integer> calculateOccurrence(String str) {
        if(str.isEmpty()) {
            return null;
        }
        String[] stringArray = str.split("\\W|___");
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        for(String elem: stringArray) {
            if(!elem.isEmpty()) {
                if(map.containsKey(elem)) {
                    map.put(elem, map.get(elem)+1);
                } else {
                    map.put(elem,1);
                }
            }
        }
        
        return map;
    }

}

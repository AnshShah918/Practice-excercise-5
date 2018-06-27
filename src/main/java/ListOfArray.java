package main.java;

import java.util.ArrayList;

public class ListOfArray {
	public ArrayList<String> listOf(ArrayList<String> list , String change , String replace){
		list.set(list.indexOf(change), replace);
		
		return list;
	}

}

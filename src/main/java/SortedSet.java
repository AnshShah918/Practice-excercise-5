package main.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;

public class SortedSet {
	public ArrayList<String> sort(String[] val){
		TreeSet<String> set1 = new TreeSet<>(Arrays.asList(val));
		ArrayList<String> sorted = new ArrayList<String>(set1);
		return sorted;
	}

}

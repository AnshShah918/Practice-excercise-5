package test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import main.java.SortedSet;

public class SortedSetTest {

	@Test
	public void test() {
		
		//Arrange
		
		ArrayList<String> expectedValue = new ArrayList<>();
		expectedValue.add("Alice");
		expectedValue.add("Bernard");
		expectedValue.add("Gerard");
		String[] value = {"Bernard", "Alice", "Gerard"};
		SortedSet obj = new SortedSet();
		
		//Act
		ArrayList<String> actualValue = obj.sort(value);
		
		//Assert
		
		assertEquals(expectedValue,actualValue);
	}

}

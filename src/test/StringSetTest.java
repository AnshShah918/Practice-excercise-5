package test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import main.java.StringSet;

public class StringSetTest {

	@Test
	public void test() {
		// Arrange
		
		HashMap<String, Boolean> expectedValue = new HashMap<>();
		expectedValue.put("a", true);
		expectedValue.put("b", false);
		expectedValue.put("c", true);
		String[] value = {"a" , "a", "b", "c", "c", "c"};
		StringSet obj = new StringSet();
		
		// Act
		HashMap<String, Boolean> actualValue = obj.Setter(value);
		
		//Assert
		
		assertEquals(expectedValue,actualValue);
	}

}

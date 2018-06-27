package test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import main.java.MappingStrings;

public class MappingStringsTest {

	@Test
	public void test() {
		
		// Arrange
		
		HashMap<String, Integer> expectedValue = new HashMap<>();
		expectedValue.put("a", 2);
		expectedValue.put("b", 2);
		expectedValue.put("c", 3);
		String value = "a(& b b (*a c c @! c";
		MappingStrings obj = new MappingStrings();
		
		// Act
		HashMap<String, Integer> actualValue = obj.calculateOccurrence(value);
		
		//Assert
		
		assertEquals(expectedValue,actualValue);
		}
	}


package test;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

import main.java.ValExchange;

public class ValExchangeTest {

	@Test
	public void test() {

		// Arrange
		
		HashMap<String, String> expectedValue = new HashMap<>();
		HashMap<String, String> value = new HashMap<>();
		expectedValue.put("val1", "");
		expectedValue.put("val2", "3");
		value.put("val1", "3");
		value.put("val2", "4");
		ValExchange obj = new ValExchange();
		
		// Act
		HashMap<String, String> actualValue = obj.valExchange(value);
		
		//Assert
		
		assertEquals(expectedValue,actualValue);
	}

}

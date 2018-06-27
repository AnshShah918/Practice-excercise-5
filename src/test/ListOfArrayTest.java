package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import main.java.ListOfArray;

public class ListOfArrayTest {
	
	@Test
    public void test() {
        //arrange
        ListOfArray loa = new ListOfArray();
        ArrayList<String> expected = new ArrayList<>();
        expected.add("Kiwi");
        expected.add("Grape");
        expected.add("Mango");
        
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Apple");
        list1.add("Grape");
        list1.add("Mango");
        String change = "Apple";
        String replace = "Kiwi";
        
        //Act
        ArrayList<String> actual = loa.listOf(list1, change, replace);
        
        //Assert
        assertEquals(expected, actual);
        
    }
}

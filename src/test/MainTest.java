package test;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import main.java.Student;
import main.java.StudentSorter;

public class MainTest {
	
	 static StudentSorter studentSort;

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		studentSort = new StudentSorter();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		studentSort = null;

	}
	
	@Test
	public void testCompareFunction() {
		Student std1 = new Student(1, 26, "Ram");
		Student std2 = new Student(2, 26, "Shyam");
		Student std3 = new Student(3, 25, "Ashok");
		Student std4 = new Student(4, 26, "Ram");
		Student std5 = new Student(5, 29, "Anand");
		ArrayList<Student> studentsArray = new ArrayList<Student>();
		studentsArray.add(std1);
		studentsArray.add(std2);
		studentsArray.add(std3);
		studentsArray.add(std4);
		studentsArray.add(std5);
		ArrayList<Student> sortedStudentArray = new ArrayList<Student>();
		sortedStudentArray.add(std5);
		sortedStudentArray.add(std1);
		sortedStudentArray.add(std4);
		sortedStudentArray.add(std2);
		sortedStudentArray.add(std3);
		
		studentsArray.sort(studentSort);
		assertEquals(sortedStudentArray, studentsArray);
	}
	
}
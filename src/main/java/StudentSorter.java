package main.java;

import java.util.Comparator;

public class StudentSorter implements Comparator<Student> {

	@Override
	public int compare(Student stud1, Student stud2) {
		if(stud1.getStudentAge()!=stud2.getStudentAge())
			return stud2.getStudentAge()-stud1.getStudentAge();
		else {
			if(!stud1.getStudentName().equals(stud2.getStudentName())){
				return stud1.getStudentName().compareTo(stud2.getStudentName());
			}
			else {
				return stud1.getStudentId()-stud2.getStudentId();
			}
		}
	}

}

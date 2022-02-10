package daysix.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentComparatorDemo {

	public static void main(String[] args) {
		List<StudentNew> studentNewList = new ArrayList<StudentNew>();
		studentNewList.add(new StudentNew(10, "Nik", 45.12, 21));
		studentNewList.add(new StudentNew(10, "Roh", 85.12, 23));
		studentNewList.add(new StudentNew(10, "Joy", 12.12, 25));

		System.out.println(studentNewList);
		
		System.out.println("Sorting By Name");
		Collections.sort(studentNewList, new NameComparator());
		System.out.println(studentNewList);
		
		System.out.println("Sorting By Age");
		Collections.sort(studentNewList, new AgeComparator());
		System.out.println(studentNewList);
		
		System.out.println("Sorting By Marks");
		Collections.sort(studentNewList, new MarksComparator());
		System.out.println(studentNewList);
		
		System.out.println("----------Reverse Order On Bases of Marks--------------");
		Collections.reverse(studentNewList);
		System.out.println(studentNewList);
		
	}

}

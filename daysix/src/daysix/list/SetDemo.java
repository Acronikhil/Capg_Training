package daysix.list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		// Set will not store duplicate elements.

		// HashSer does not allow duplicate
		// is an unsorted,unordered Se

		Set set = new HashSet();
		set.add("Hello");
		set.add(null);
		set.add("Hello");
		set.add(15);
		set.add(15.12);

		System.out.println(set); // Output ---------> [null, Hello, 15.12, 15]

		Set<String> setofStr = new HashSet<String>();
		setofStr.add("Hello");
		setofStr.add(null);
		setofStr.add("Hello");
		setofStr.add("Everyone");

		System.out.println(setofStr);

		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Jyotika");

		Employee e2 = new Employee();
		e2.setEmpId(1);
		e2.setEmpName("Jyotika");

		Employee e3 = new Employee();
		e3.setEmpId(3);
		e3.setEmpName("Nikhil");

		Set<Employee> emp = new HashSet<Employee>();
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);

		System.out.println(emp);

		// TreeSet - it does not allow duplicated
		// By default it elements will be in ascending order - Sorted Collection
		// Not Synchronized- If more than one thread wanys to access it at the same
		// time, then it must be

		TreeSet<String> treeSet = new TreeSet<String>();
		treeSet.add("One");
		treeSet.add("Two");
		treeSet.add("Three");
		treeSet.add("Four");
		treeSet.add("Five");

		System.out.println(treeSet);// If we want to sort array or list in our way we must use Comparator interface

		
		
		
	}

}

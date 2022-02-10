package daysix.list;

import java.util.Iterator;
import java.util.TreeSet;

public class StudentComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet treeSet = new TreeSet();
		treeSet.add(new Student(11,"Akash", 92.20));
		treeSet.add(new Student(11,"Nidhi", 91.00));
		treeSet.add(new Student(11,"Nikhil", 99.80));
		
		System.out.println(treeSet);
		
		Iterator itr = treeSet.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}

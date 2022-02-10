package daysix.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListDemo {

	public static void main(String[] args) {
		// List can store the order collection of objects. It can have duplicate values.
		// List interface is imnplemented by the classes ArrayList, LinkedList,
		// Vector,and Stack

		List arrayList = new ArrayList();
//		List linkedList = new LinkedList();
		List vectorList = new Vector();
//		List stack = new Stack();// LIFO

		// ArrayList class implements List Interface it uses dynamic array to store the
		// duplicate element of diffrent data types
		// It maintains insertion order and is non-synchronized.

		arrayList.add(11);
		arrayList.add("Hello");
		arrayList.add(54.12);
		arrayList.add("Everyone");

		Iterator itr = arrayList.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.contains("Hello"));
		System.out.println(arrayList.get(2));
		System.out.println(arrayList.size());
		System.out.println(arrayList.remove(0));
		System.out.println(arrayList); // Output ------> [Hello, 54.12, Everyone]

		arrayList.add("Hello"); // Allows duplication and also maintains insertion order.
		System.out.println(arrayList);

		// We are decoupling our code from a specific implementation of the interface
		// This is called programming to interface it will be helpful in case if you
		// wish to move to some other implementation of List in future

		List<String> strList = new ArrayList<String>();
		strList.add("Hii");
		strList.add("Good");
		strList.add("Morning");

		// ArrayList<String> listOfString = new ArrayList<String>();

		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.setEmpName("Nikhil Dubey");

		Employee e2 = new Employee();
		e2.setEmpId(2);
		e2.setEmpName("Aman Singh");

		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);

		Iterator itr2 = empList.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

		// LinkedList implemetd Collection interface. It is used doubley linked list to
		// store the elements.
		// It can store the duplicate elements.
		// It maintains insertion order and is no-synchronized.
		// The manipluatoin is fast because no shifting is required.

		List<String> linkedList = new LinkedList<String>();
		linkedList.add("Abc");
		linkedList.add("Abc");
		linkedList.add("Abc");
		linkedList.add("Absdfvs");
		linkedList.add("Raghini");

		Iterator itt = linkedList.iterator();
		while (itt.hasNext()) {
			System.out.println(itt.next());
		}

		linkedList.set(0, "Hiii");// Replace the element at particular index position.

		System.out.println(linkedList);
		Collections.replaceAll(linkedList, "Raghini", "Jyotika");
		System.out.println(linkedList);
		linkedList.replaceAll(String::toLowerCase); // Method refrence or u can use Lambda expression
		System.out.println(linkedList);

		// VECOT uses a dynamic array to store the data elements. It is similar to
		// AarrayList.
		// It is synchronized and contains may methods that are not part of Collection
		// Framework.

		List<Integer> vector = new Vector<Integer>();
		vector.add(10);
		vector.add(1);
		vector.add(22);
		vector.add(45);
		for (Integer intNum : vector) {
			System.out.println(intNum);
		}

		// Stack is subclass of vector. It implements LIFO data structures i.e. Stack.
		// It contains methods of Vector and also provides like boolean push(),peek()
		// etc. which defines it properties
		
//		List stack = new Stack();
		Stack<Double> stackOfDoubleNum = new Stack<Double>();
		stackOfDoubleNum.push(1231.02);
		stackOfDoubleNum.push(4.02);
		stackOfDoubleNum.push(52.02);
		
		for (Double doubleNum : stackOfDoubleNum) {
			System.out.println(doubleNum);
		}
		System.out.println(stackOfDoubleNum);
		
		System.out.println(stackOfDoubleNum.pop());
		System.out.println(stackOfDoubleNum);

		
		
		
	}

}

package daysix.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import daysix.list.Employee;

public class GenericsDemo {

	// Below type T is replaced by String refrence type

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sender<String> s = new Sender<String>();
		Sender<Employee> empSender = new Sender<Employee>();

		s.setMessage("String Message sent using Sender Gen type");
		s.sendmessage();

		Employee e = new Employee();
		e.setEmpId(1);
		e.setEmpName("Nikhil");

		empSender.setMessage(e);
		empSender.sendmessage();

		// Before generics:
		List myIntegerList = new LinkedList(); // 1
		myIntegerList.add(new Integer(1)); // 2
		Integer intObjk = (Integer) myIntegerList.iterator().next(); // 3

		// After Generics
		List<Integer> listOfInteger = new LinkedList<Integer>();// 1
		listOfInteger.add(1); // 2
		Integer intObj = listOfInteger.iterator().next(); // 3

		// Usage of generics having multiple type parameters
		HashMap<String, Mammal> map = new HashMap<String, Mammal>();
		map.put("wombat", new Mammal("Wombat"));
		Mammal mammal = map.get("wombat");
		mammal.getMessage();

		// There is no inheritance relationship between type arguments of a generic
		// class is supported

//		ArrayList<Integer> al = new ArrayList<Integer>();
//		ArrayList<Object> ao = al;//if it is allowed at compile time,
//		ao.add(new Object());
//		Integer i=ao.get(0);// will result ni run time ClassCastException

		ArrayList<Integer> aL = new ArrayList<Integer>();
		List<Integer> li = new ArrayList<Integer>();
		Collection<Integer> ci = new ArrayList<Integer>();
		Collection<String> sc = new Vector<String>(4);

	}

}

package assissment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EmployeeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> listOfEmployee = new ArrayList<>();
		
		Employee e1 = new Employee(1,"Nikhil","Indore",2000);
		Employee e2 = new Employee(2,"Nischay","Indore",4000);
		Employee e3 = new Employee(1,"Aviral","Bhopal",6000);
		
		listOfEmployee.add(e1);
		listOfEmployee.add(e2);
		listOfEmployee.add(e3);
		
		AddressComparator ac = new AddressComparator();
		
		
		
//		listOfEmployee.stream().filter(ac.compare(o1, o2)).collect
//		Collections.sort(listOfEmployee ,Comparator.comparing(Employee::getAddress));
//		System.out.println(listOfEmployee);
		
//		List<Employee> el = listOfEmployee.stream().filter((e)-> e.getAddress().equals("Indore")).collect(Collectors.toList());
//		System.out.println(el);
		
	}

}

package dayseven.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDemo {
// Management has decided ot inc. the salary of all emp of IT dept with 10%

	public static void main(String[] args) {
		Employee e1 = new Employee(1, "Nikhil", 1500, "IT");
		Employee e2 = new Employee(2, "Aman", 100, "Marketing");
		Employee e3 = new Employee(3, "Jyotika", 5000, "IT");
		Employee e4 = new Employee(4, "Nikhar", 6000, "Testing");
		Employee e5 = new Employee(5, "Esha", 1500, "HR");
		Employee e6 = new Employee(6, "Payas", 5000, "IT");
		Employee e7 = new Employee(7, "Aditya", 2000, "Finance");
		Employee e8 = new Employee(8, "Suman", 1000, "HR");
		Employee e9 = new Employee(9, "Nidhi", 3000, "Finance");
		
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		empList.add(e5);
		empList.add(e6);
		empList.add(e7);
		empList.add(e8);
		empList.add(e9);
		
		List<Double> listOfITDeptSallary = empList.stream().filter(o->o.getDepartment().equals("IT"))
		.map(o->o.getSalary()*1.10).collect(Collectors.toList());
		listOfITDeptSallary.forEach(System.out::println);
		
		double totalSalariesOfIT = listOfITDeptSallary.stream().reduce(0.0, (x,y)->x+y);
		System.out.println(totalSalariesOfIT);
		
		
		// Other Terminal Functions --- min(), max(), count()
		
		System.out.println("----------------------- Minimum ---------------------------------------");
//		
		List<Employee> listOfITDeptSallary2 = empList.stream().filter(o->o.getDepartment().equals("IT"))
				.map(o->{
					o.setSalary(o.getSalary() * 1.10);
					return o;
				}).collect(Collectors.toList());
		System.out.println(listOfITDeptSallary2);
//		System.out.println(empList.stream().filter(o->o.getDepartment().equals("IT")).max(Collectors.getSallary()));
		
		
	}
}

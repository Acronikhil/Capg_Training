package daynine.hrms.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

import daynine.hrms.exceptions.EmployeeNotFoundException;
import daynine.hrms.exceptions.NoEmployeeFoundException;

public class EmpOps implements EmpInterface {

	Scanner sc = new Scanner(System.in);

	List<Employee> listOfEmp = new ArrayList<>();

	public void addEmp() {
		Integer id;
		String name;
		String address;
		Long phoneNumber;
		String department;

		System.out.print("\nEnter Employee Id: ");
		id = sc.nextInt();
		System.out.println("\nEnter Employee Name: ");
		name = sc.nextLine();
//		sc.next();
		System.out.println("Enter Employee address");
		address = sc.nextLine();
//		sc.next();
		System.out.println("Enter employee phonenumber");
		phoneNumber = sc.nextLong();
		System.out.println("Enter employee department");
		department = sc.nextLine();
//		sc.next();
		
		listOfEmp.add(new Employee(id, name, address, phoneNumber, department));
		System.out.println("Employee Added Successfully");
	}

	public  void findEmp() throws EmployeeNotFoundException {
		Integer toFind;
		
		System.out.print("\nEnter Employee id to find: ");
		toFind = sc.nextInt();
		
		boolean found = false;

		for (Employee emp : listOfEmp) {
			if (Objects.equals(toFind, ((daynine.hrms.app.Employee) emp).getId())) {
				System.out.println("Emp: "+emp);
				found = true;
				break;
			} else {
				found = false;
			}

		}
		try {
		if (!found) {
			
			throw new EmployeeNotFoundException("Employee is not in org.");
//			System.out.println("Employee is not in org.");
		}}catch(EmployeeNotFoundException enfe) {
			System.out.println("404 Not Found ");
		}
		

	}
	
	public void allEmp() throws NoEmployeeFoundException {
		try {
		if(listOfEmp.isEmpty()) {
			throw new NoEmployeeFoundException("No employee data exists");
		}}catch(NoEmployeeFoundException nefe) {
			nefe.printStackTrace();
		}
		
		for (Employee emp : listOfEmp) {
			System.out.println(emp);

		}
		
	}

}

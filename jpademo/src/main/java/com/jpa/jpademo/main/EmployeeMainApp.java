package com.jpa.jpademo.main;

import com.jpa.jpademo.data.Employee;
import com.jpa.jpademo.services.EmployeeServices;
import com.jpa.jpademo.services.EmployeeServicesImpl;

public class EmployeeMainApp {

	public static void main(String[] args) {
		EmployeeServices empServices = new EmployeeServicesImpl();
		
		Employee emp = new Employee(5,"Jyotika Agrawal");
		empServices.addEmployee(emp);
		System.out.println(empServices.getEmployee(5));
		
	}

}
